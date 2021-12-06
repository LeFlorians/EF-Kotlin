plugins {
    kotlin("jvm") version "1.5.10"
}

group = "le.florians"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.0")
}

// Custom Jar output
tasks.jar {
    manifest {
        // Define entry point in manifest
        attributes["Main-Class"] = "MainKt"
    }
    configurations["compileClasspath"].forEach {
        file: File ->
            from(zipTree(file.absoluteFile))
    }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}