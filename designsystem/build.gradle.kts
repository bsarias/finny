plugins {
    id(Plugins.AndroidLibrary)
    id(Plugins.AndroidKotlin)
}

android {
    namespace = "com.finny.designsystem"
    compileSdk = AndroidConfig.CompileSdk

    defaultConfig {
        minSdk = AndroidConfig.MinSdk
        targetSdk = AndroidConfig.TargetSdk
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
    implementation(Libs.Material)
    implementation(Libs.Compose.Ui)

    debugImplementation(Libs.Compose.Tooling.Ui)
    implementation(Libs.Compose.Tooling.Preview)
}