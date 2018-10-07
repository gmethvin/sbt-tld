package simple

import io.methvin.tld.TLDs

object Main {
  def main(args: Array[String]): Unit = {
    val tlds = TLDs.get
    println(tlds)
    import scala.collection.Searching._
    val tldsToTest = Seq("com", "net", "org", "play", "eu", "africa", "horse", "bar", "life", "blog")
    for (tld <- tldsToTest) {
      tlds.search(tld) match {
        case Found(index) => // do nothing
        case InsertionPoint(index) =>
          throw new IllegalStateException(s"$tld not found!")
      }
    }
  }
}
