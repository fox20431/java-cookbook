plugins {
    application
}

group = "com.hihusky"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        // junit jupiter api
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
        // junit jupiter engine
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")

        // lombok for compile only
        compileOnly("org.projectlombok:lombok:1.18.22")
        // lombok for annotation processor
        annotationProcessor("org.projectlombok:lombok:1.18.22")
        // lombok for test compile only
        testCompileOnly("org.projectlombok:lombok:1.18.22")
        // lombok for test annotation processor
        testAnnotationProcessor("org.projectlombok:lombok:1.18.22")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

