# sbt-tld

 [![Travis CI](https://travis-ci.org/gmethvin/sbt-tld.svg?branch=master)](https://travis-ci.org/gmethvin/sbt-tld) [![Download](https://api.bintray.com/packages/gmethvin/sbt-plugins/sbt-tld/images/download.svg)](https://bintray.com/gmethvin/sbt-plugins/sbt-tld/_latestVersion) 

An sbt plugin to generate a current list of top-level domains for use in Scala.

## Usage

This plugin requires sbt 1.0.0+. Reference it in your `project/plugins.sbt` like:

```scala
addSbtPlugin("io.methvin.sbt" % "sbt-tld" % version)
```

where `version` is replaced by the latest version: [![Download](https://api.bintray.com/packages/gmethvin/sbt-plugins/sbt-tld/images/download.svg)](https://bintray.com/gmethvin/sbt-plugins/sbt-tld/_latestVersion) 


Then add the `TldPlugin` to the project for which you'd like to generate the TLD list, and configure the settings to your liking:

```scala
enablePlugins(TldPlugin) // this is required on the project in which you want to generate the TLD file

// all these settings are optional; default values are shown here

// amount of time after which to regenerate the TLD file
tldRegenAfter := 1.day

// name of the package in which to put the TLD object
tldPackageName := "io.methvin.tld"

// name of object wrapper in which val is created
tldObjectName := "TLDs"

// name of val containing the list of TLDs
tldValName := "get"

// URL from which to get the list (one TLD per line, lines with invalid TLDs ignored)
tldSourceUrl := new URL("https://data.iana.org/TLD/tlds-alpha-by-domain.txt")
```

You can configure the package, object, and val names by setting the above-mentioned settings. Note that these values are substituted into the code unescaped, so they must be valid identifiers in each context.

This will generate a file that looks like:

```scala
package io.methvin.tld

object TLDs {
  val get: IndexedSeq[String] = IndexedSeq(
    "aaa",
    ...,
    "zw"
  )
}
```

In this case, to get the list of TLDs, you'd use `TLDs.get`. For convenience, the TLDs are all lowercased and sorted.
