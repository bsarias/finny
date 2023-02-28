plugins {
    id (Plugins.AndroidApplication) version Versions.AndroidGradle apply false
    id (Plugins.AndroidLibrary) version Versions.AndroidGradle apply false
    id (Plugins.AndroidKotlin) version Versions.Kotlin apply false
    id (Plugins.AndroidHilt) version Versions.Hilt apply false
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}
