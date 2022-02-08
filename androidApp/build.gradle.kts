plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "it.aesys.firstkmmapplication.android"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures.dataBinding = true
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
}