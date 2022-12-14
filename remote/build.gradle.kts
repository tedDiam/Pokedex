plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlinx-serialization")
}

android {
    compileSdk = 33


    defaultConfig {
        minSdk = 21
        targetSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("proguard-rules.pro")
        buildConfigField("String", "API_BASE_URL", "\"https://pokeapi.co/api/v2/\"")
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
    namespace = "com.sergediame.remote"
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)

    testImplementation(libs.junit)
    testRuntimeOnly(libs.enginejunit)

    androidTestImplementation(libs.espresso.core)
    implementation(projects.data)

    implementation (libs.dagger)
    implementation(libs.bundles.networking)
    implementation(libs.kotlinx.serialization.json)
    kapt(libs.dagger.compiler)
}

kapt {
    correctErrorTypes = true
}