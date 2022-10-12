plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.sergediame.pokedex"
        minSdk =  21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner =  "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    namespace = "com.sergediame.pokedex"
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)

    testImplementation(libs.junit)
    testRuntimeOnly(libs.enginejunit)

    androidTestImplementation(libs.espresso.core)

    implementation(projects.domain)
    implementation(projects.data)
    implementation(projects.remote)
    implementation(projects.local)
    implementation (libs.dagger)
    kapt(libs.daggercompiler)
}

kapt {
    correctErrorTypes = true
}