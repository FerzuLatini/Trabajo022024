plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "cl.virginiogomez.trabajo022024"
    compileSdk = 35  // Asegúrate de que sea 35

    defaultConfig {
        applicationId = "cl.virginiogomez.trabajo022024"
        minSdk = 24
        targetSdk = 35  // Cambiar a 35
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat) // Biblioteca de compatibilidad
    implementation(libs.material) // Material Design
    implementation(libs.activity) // Actividad
    implementation(libs.constraintlayout) // Layouts de Constraint
    implementation("androidx.core:core-splashscreen:1.0.1")// Splash Screen
    implementation(libs.play.services.maps) // Google Maps

    testImplementation(libs.junit) // Pruebas unitarias
    androidTestImplementation(libs.ext.junit) // Pruebas de instrumentación
    androidTestImplementation(libs.espresso.core) // Pruebas de UI
}
