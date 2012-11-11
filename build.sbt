name := "scala-python-example"

scalaVersion := "2.10.0-RC1"

fork in run := true

javaOptions in run += "-Djava.library.path=./lib"
