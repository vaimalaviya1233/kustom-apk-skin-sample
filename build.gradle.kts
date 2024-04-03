buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
    }
}

allprojects {
    allprojects {
        repositories {
            mavenCentral()
            google()
        }
        ext {
            set("buildToolsVersion", "34.0.0")
            set("compileSdkVersion", 34)
            set("targetSdkVersion", 34)
        }
    }
}

