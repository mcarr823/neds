plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "dev.mcarr.neds.mock"
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

    // Needed for unit testing
    @Suppress("UnstableApiUsage")
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    // Provides interfaces and data types which the classes
    // in this module will inherit from, return, or mock
    implementation(project(":common"))

    // For mocking serialized network data responses
    implementation(libs.ktor.serialization.json)

    // Standard unit testing libs
    testImplementation(libs.junit)
    testImplementation(libs.robolectric)

    // Needed for loading resources while performing unit tests
    testImplementation(libs.androidx.test.core)

    // Needed for running suspending functions in unit tests
    testImplementation(libs.kotlinx.coroutines.test)
}