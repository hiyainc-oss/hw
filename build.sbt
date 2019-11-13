organization in ThisBuild := "com.hiya"
scalacOptions in ThisBuild ++= Seq("-Xfatal-warnings", "-Xlint","-deprecation","-feature","-unchecked")
crossScalaVersions in ThisBuild := Seq("2.11.12", "2.12.8", "2.13.1")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

lazy val hiyaIncOSS = "Hiya Inc. OSS" at "https://maven.pkg.github.com/hiyainc-oss"
resolvers += hiyaIncOSS
publishTo := Some(hiyaIncOSS)

credentials ++= envVars.value.get("GITHUB_TOKEN").map(token =>
  List(Credentials(
    realm = "GitHub Package Registry @ maven.pkg.github.com",
    host = "maven.pkg.github.com",
    userName = "",
    passwd = token
  ))
).getOrElse(Nil)
