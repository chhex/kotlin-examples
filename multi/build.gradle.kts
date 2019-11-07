plugins {
    kotlin("jvm") version "1.3.30"
    application
}

sourceSets {
    val main by getting
    main.java.srcDirs("src")
}

application {
    mainClassName = "NotMultiDispatchKt"
}    

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}
