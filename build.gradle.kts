plugins {
    `java-library`
    maven
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
    id("org.jetbrains.kotlin.plugin.spring")
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
    maven(url = "https://repo.spring.io/snapshot")
    maven(url = "https://repo.spring.io/milestone")
}

subprojects {
    apply(plugin="java")
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven(url = "https://repo.spring.io/snapshot")
        maven(url = "https://repo.spring.io/milestone")
    }

}
