// scala-lib/build.gradle.kts
plugins {
    scala
    `java-library`
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.8.4")
}

tasks.withType<ScalaCompile> {
    scalaCompileOptions.forkOptions.jvmArgs = listOf("--sun-misc-unsafe-memory-access=allow")
}
