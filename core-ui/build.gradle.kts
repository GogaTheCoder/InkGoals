plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.gohar.inkgoals.core.ui"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    buildFeatures { buildConfig = true }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    // позже добавим Compose/Material3
}
