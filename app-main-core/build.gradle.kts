// app-main-core/build.gradle.kts
plugins {
    kotlin("jvm") version "2.4.0"
    application
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    // Kéo 2 module kia vào làm phụ thuộc cho app này
    implementation(project(":city1-java"))
    implementation(project(":city2-kotlin"))
    implementation(project(":city3-scala"))
}

application {
    mainClass.set("runBox_Processing.HeartKt")
}


