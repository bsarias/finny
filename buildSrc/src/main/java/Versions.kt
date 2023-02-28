import org.gradle.api.JavaVersion

object Versions {
    const val AndroidGradle = "7.3.1"
    const val Kotlin = "1.8.10"
    const val Hilt = "2.43.2"
    const val Navigation = "2.5.1"
    const val Compose =  "1.3.1"
}

object Libs {

    object Compose {
        val Activity by lazy { "androidx.activity:activity-compose:${Versions.Compose}" }
        val Ui by lazy { "androidx.compose.ui:ui:${Versions.Compose}" }
    }
    val Material by lazy { "androidx.compose.material3:material3:1.0.1" }

    val Splash by lazy { "androidx.core:core-splashscreen:1.0.0" }

    object Hilt {
        val Android by lazy { "com.google.dagger:hilt-android:${Versions.Hilt}" }
        val Compiler by lazy { "com.google.dagger:hilt-compiler:${Versions.Hilt}" }
    }
}

object Plugins {
    val Android by lazy { "android" }
    val Kapt by lazy { "kapt" }
    val AndroidApplication by lazy { "com.android.application" }
    val AndroidLibrary by lazy { "com.android.library" }
    val AndroidKotlin by lazy { "org.jetbrains.kotlin.android" }
    val AndroidHilt by lazy { "com.google.dagger.hilt.android" }
    val Hilt by lazy { "dagger.hilt.android.plugin" }
}

object AndroidConfig {
    const val CompileSdk = 32
    const val MinSdk = 26
    const val TargetSdk = 32
    const val VersionCode = 1
    const val VersionName = "1.0.0"
    const val ApplicationId = "com.finny.app"
    val Java_1_8 = JavaVersion.VERSION_1_8
    const val JvmTarget = "1.8"
    const val TestInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}