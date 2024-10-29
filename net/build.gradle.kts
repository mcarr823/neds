plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "dev.mcarr.neds.net"
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
    // :common module provides enums used for URL building
    implementation(project(":common"))

    // Ktor CIO is used as the HTTP client implementation
    implementation(libs.ktor.cio)

    // Content negotiation and JSON serialization are used
    // for converting response data from JSON to serializable
    // data classes automatically.
    implementation(libs.ktor.content.negotiation)
    implementation(libs.ktor.serialization.json)

    // Robolectric is needed for mocking the Android Uri class.
    testImplementation(libs.junit)
    testImplementation(libs.robolectric)
}