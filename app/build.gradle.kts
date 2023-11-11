plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.dinesh.android"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dinesh.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            testCoverage {
                enableUnitTestCoverage = false
                enableAndroidTestCoverage = false
            }
        }
        debug {
            isMinifyEnabled = true
            isShrinkResources = true
            testCoverage {
                enableUnitTestCoverage = true
                enableAndroidTestCoverage = true
            }
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(JavaVersion.VERSION_17.toString().toInt())
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    buildFeatures {
        buildConfig = true
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
//    signingConfigs {
//        getByName("debug") {
//            storeFile = file("../keystore/debug.keystore")
//            storePassword = "android_storePassword"
//            keyAlias = "android_debug_key"
//            keyPassword = "android_keyPassword"
//        }
//    }

}

dependencies {
////    implementation(project(":permission"))
    implementation(project(mapOf("path" to ":theme")))
////    implementation("com.github.Dinesh2811:EasyPermissionRequest:1.1")

    implementation(libs.bundles.android)
    implementation(libs.bundles.compose)
    implementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(platform(libs.androidx.compose.bom))

    //  ViewModel & LiveData
//    implementation(libs.bundles.lifecycle)
}
