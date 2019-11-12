organization in ThisBuild := "com.hiya"
scalacOptions in ThisBuild ++= Seq("-Xfatal-warnings", "-Xlint","-deprecation","-feature","-unchecked")
crossScalaVersions in ThisBuild := Seq("2.11.12", "2.12.8", "2.13.1")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
