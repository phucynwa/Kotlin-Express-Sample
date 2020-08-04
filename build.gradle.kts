plugins {
    kotlin("js") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("express", "4.17.1"))
}

kotlin.target.nodejs { }