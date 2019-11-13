organization in ThisBuild := "com.hiya"
scalacOptions in ThisBuild ++= Seq("-Xfatal-warnings", "-Xlint","-deprecation","-feature","-unchecked")
crossScalaVersions in ThisBuild := Seq("2.11.12", "2.12.8", "2.13.1")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

lazy val hiyaIncOSS = "Hiya Inc. OSS" at "https://maven.pkg.github.com/hiyainc-oss/releases/"
resolvers += hiyaIncOSS
publishTo := Some(hiyaIncOSS)

val token = scala.sys.env.get("GITHUB_TOKEN")
credentials ++= token.map(t =>
  List(Credentials(
    realm = "GitHub Package Registry",
    host = "maven.pkg.github.com",
    userName = "hiyainc-oss",
    passwd = t
  ))
).getOrElse(Nil)
