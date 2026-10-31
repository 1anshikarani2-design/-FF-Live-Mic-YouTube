plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    namespace = "com.fflivemic.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.fflivemic.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 8
        versionName = "0.8.0-youtube-rtmp"
    }
}

// RootEncoder handles MediaProjection H.264, mixed PCM -> AAC, and RTMP publishing.
dependencies {
    implementation("com.github.pedroSG94.RootEncoder:library:2.8.1")
}


kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}
