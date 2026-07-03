// kotlin-lib/build.gradle.kts
plugins {
    `java-library`
    // Sử dụng phiên bản Kotlin mới nhất (2.4.0)
    kotlin("jvm") version "2.4.0"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation(gradleApi())
}
