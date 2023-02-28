plugins {
    id(Plugins.AndroidApplication)
    kotlin(Plugins.Android)
    kotlin(Plugins.Kapt)
   // id(Plugins.Hilt)
}

android {
    compileSdk = AndroidConfig.CompileSdk
    defaultConfig {
        applicationId = AndroidConfig.ApplicationId
        minSdk = AndroidConfig.MinSdk
        targetSdk = AndroidConfig.TargetSdk
        versionCode = AndroidConfig.VersionCode
        versionName = AndroidConfig.VersionName
        testInstrumentationRunner = AndroidConfig.TestInstrumentationRunner
    }
    compileOptions {
        sourceCompatibility = AndroidConfig.Java_1_8
        targetCompatibility = AndroidConfig.Java_1_8
    }
    buildFeatures {
        compose = true
    }
    kotlinOptions {
        jvmTarget = AndroidConfig.JvmTarget
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.Compose
    }
}

dependencies {
    implementation(Libs.Splash)
    implementation(Libs.Material)
    implementation(Libs.Compose.Activity)
    implementation(Libs.Compose.Ui)
}