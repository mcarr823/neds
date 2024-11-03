plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("kotlinx-serialization")
}

android {
    namespace = "dev.mcarr.neds.common"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    lint {
        disable += "unused"
    }
}

dependencies {
    // Core coroutines library is needed for specifying return types
    // for interfaces which expose Flows.
    implementation(libs.kotlinx.coroutines.core)

    // Needed for the @Serializable tag on data classes
    implementation(libs.kotlinx.serialization.json)

    // Robolectric is needed for mocking the Android Uri class.
    // Coroutines needed for testing suspend functions.
    testImplementation(libs.junit)
}