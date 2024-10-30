plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.jetbrains.kotlin.serialization)
    id("kotlin-parcelize")
}

android {
    namespace = "dev.mcarr.neds"
    compileSdk = 34

    defaultConfig {
        applicationId = "dev.mcarr.neds"
        minSdk = 24

        // SDK 35 is in beta. Let's target 34 for now
        //noinspection OldTargetApi
        targetSdk = 34

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    lint {
        // We have some long vectors (the app icon)
        // Ignore them. It's just text and shouldn't be a performance issue
        disable += "VectorPath"
    }
}

dependencies {
    // Common classes
    implementation(project(":common"))

    // UI components
    implementation(project(":ui"))

    // Use cases
    implementation(project(":domain"))

    // Data sources, repositories
    implementation(project(":data"))

    // Compose navigation, for NavHost and such
    implementation(libs.androidx.navigation.compose)

    // Serialization is used for NavHost destination objects
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}