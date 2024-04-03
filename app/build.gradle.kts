@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation("org.bitbucket.frankmonza:kustomapi:21")
    implementation("org.bitbucket.frankmonza:kustompreset:22")
    implementation("org.bitbucket.frankmonza:kustomdashboard:23")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")
}

android {
    compileSdk = rootProject.ext.get("compileSdkVersion") as Int
    buildToolsVersion = rootProject.ext.get("buildToolsVersion") as String

    defaultConfig {

        /**
         * CHANGE THIS TO YOUR APP PKG NAME THIS CANNOT BE CHANGED AFTER FIRST RELEASE
         */
        applicationId = "whatever.kompany.skin"

        /**
         * INCREMENT THIS IF YOU WANT TO RELEASE UPDATES
         */
        versionCode = 1
        versionName = "1"

        minSdk = 26
        targetSdk = rootProject.ext.get("targetSdkVersion") as Int
    }

    buildTypes {
        release {
            isShrinkResources = false
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules")
        }
        aaptOptions.setNoCompress("zip", "komp", "klwp", "kwgt", "klck", "kwch", "kntf")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_17.toString()
        }
    }

    namespace = "whatever.kompany.skin"
}