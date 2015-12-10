import android.Keys._
import android.Dependencies.{LibraryDependency, aar}

android.Plugin.androidBuild

platformTarget in Android := "android-21"

name := "macroid-starter"

scalaVersion := "2.11.6"

run <<= run in Android

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "jcenter" at "http://jcenter.bintray.com"
)


//// Repositories for dependencies
//resolvers ++= Seq(Resolver.mavenLocal,
//  DefaultMavenRepository,
//  Resolver.typesafeRepo("releases"),
//  Resolver.typesafeRepo("snapshots"),
//  Resolver.typesafeIvyRepo("snapshots"),
//  Resolver.sonatypeRepo("releases"),
//  Resolver.sonatypeRepo("snapshots"),
//  Resolver.defaultLocal)
//
//





scalacOptions in (Compile, compile) ++=
  (dependencyClasspath in Compile).value.files.map("-P:wartremover:cp:" + _.toURI.toURL)

scalacOptions in (Compile, compile) ++= Seq(
  "-P:wartremover:traverser:macroid.warts.CheckUi"
)

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")
scalacOptions ++= Seq("-feature", "-deprecation", "-target:jvm-1.7")

libraryDependencies ++= Seq(
  aar("org.macroid" %% "macroid" % "2.0.0-M4"),
  aar("org.macroid" %% "macroid-viewable" % "2.0.0-M4"),
  aar("com.android.support" % "support-v4" % "21.0.3"),
  compilerPlugin("org.brianmckenna" %% "wartremover" % "0.10")
)

proguardScala in Android := true

// Activate proguard for Android
useProguard in Android := true

proguardOptions in Android ++= Seq(
  "-ignorewarnings",
  "-keep class scala.Dynamic"
)
