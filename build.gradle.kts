buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
    }
}

allprojects {
    allprojects {
        repositories {
            mavenCentral()
            google()
        }
        ext {
            set("buildToolsVersion", "33.0.2")
            set("compileSdkVersion", 33)
            set("targetSdkVersion", 33)
        }
    }
}

