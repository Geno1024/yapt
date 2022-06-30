plugins {
    kotlin("multiplatform") version "1.7.0"
}

group = "com.geno1024"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    mingwX64() {
        compilations {
            getByName("main") {
                cinterops {
                    val winhttp by creating {
                        packageName = "cinterop.winhttp"
                    }
                }
            }
        }
        binaries {
            executable {
                entryPoint = "com.geno1024.yapt.main"
            }
        }
    }
    linuxX64() {
        binaries {
            executable {
                entryPoint = "com.geno1024.yapt.main"
            }
        }
    }
}
