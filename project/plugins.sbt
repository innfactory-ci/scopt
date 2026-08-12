val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.22.0")

val scalaNativeVersion =
  Option(System.getenv("SCALANATIVE_VERSION")).getOrElse("0.5.12")

addSbtPlugin("com.github.sbt" % "sbt-site" % "1.7.0")
addSbtPlugin("com.github.sbt" % "sbt-ghpages" % "0.9.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.3.2")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.3.2")
addSbtPlugin("org.scala-native" % "sbt-scala-native" % scalaNativeVersion)
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.3.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.6.1")
