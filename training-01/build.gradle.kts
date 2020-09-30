plugins {
    `java`
    `java-library`
}

java {
    sourceCompatibility = JavaVersion.VERSION_14
    targetCompatibility = JavaVersion.VERSION_14
}

version = "1.4.10"

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
    }

    test {
        java {
            setSrcDirs(listOf("test"))
        }
    }
}

testtasks.compileJava {
    options.isIncremental = true
    options.isFork = true
    options.isFailOnError = false
}

tasks.jar {
    manifest {
        attributes(
                "Implementation-Title" to "Training 001",
                "Implementation-Version" to archiveVersion
        )
    }
}

dependencies {
    // implementation("org.springframework:spring-web")

    compile group: 'org.jetbrains.kotlin', name: 'kotlin-stdlib', version: '1.4.10'

    compile group: 'org.scala-lang', name: 'scala-library', version: '2.13.3'


    testCompile group: 'org.jetbrains.kotlin', name: 'kotlin-test-junit', version: '1.4.10'
    compile group: 'org.jetbrains.kotlin', name: 'kotlin-test', version: '1.4.10'

}
