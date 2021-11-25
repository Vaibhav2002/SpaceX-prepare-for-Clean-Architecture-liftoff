object ProjectModules {
    const val core = ":core"
    const val api = ":data-api"
    const val data = ":data"
    const val domain = ":domain"
    const val coreAndroidTest = ":core-android-test"
}

object AndroidSettings {
    const val appVersionName = "0.1"
    const val compileSdk = 31
    const val buildTools = "30.0.3"
    const val minSdk = 26
    const val targetSdk = 31
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object Versions {
    const val core = "1.3.2"
    const val fragment = "1.2.5"
    const val navigation = "2.3.2"
    const val compose = "1.1.0-beta03"
    const val composeSystemUi = "0.21.3-beta"
    const val composeViewModel = "2.4.0"
    const val composeNavigation = "2.4.0-beta01"
    const val constraintLayout = "2.0.4"
    const val legacySupportV4 = "1.0.0"
    const val lifecycleLivedataKtx = "2.2.0"
    const val livedataTesting = "1.1.1"
    const val dagger = "2.24"
    const val hilt = "2.37"
    const val hiltJetpack = "1.0.0-alpha02"
    const val hiltVM = "1.0.0-alpha03"
    const val androidxTest = "1.2.0"
    const val espresso = "3.2.0"
    const val androidxJunit = "1.1.1"
    const val junit = "4.13.1"
    const val junitPlatformRunner = "1.0.2"
    const val mockito = "3.12.3"
    const val mockitoKotlin = "1.6.0"
    const val gradle = "7.0.3"
    const val kotlin = "1.5.31"
    const val timber = "4.7.1"
    const val lottie = "4.2.0"
    const val lottieCompose = "4.2.1"
    const val coreTesting = "1.1.1"
    const val retrofit = "2.6.2"
    const val retrofitConverterGson = "2.4.0"
    const val okhttpLoggingInterceptor = "4.9.1"
    const val coil = "1.4.0"
    const val bottomSheet = "0.1.9"
    const val jodaTime = "2.10.8"
    const val mockWebServer = "4.9.0"
    const val browser = "1.0.0"
    const val solidRecyclerView = "1.0.2"
    const val kotlinxCoroutines = "1.5.2"
}

object BuildDependencies {
    const val androidGradle =
        "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val hiltAndroidGradlePlugin =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
}

object Dependencies {

    object AndroidX {
        const val fragmentKtx =
            "androidx.fragment:fragment-ktx:${Versions.fragment}"
        const val coreKtx =
            "androidx.core:core-ktx:${Versions.core}"
        const val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val legacySupport =
            "androidx.legacy:legacy-support-v4:${Versions.legacySupportV4}"
        const val lifecycleLivedataKtx =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleLivedataKtx}"
        const val lifecycleCompiler =
            "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleLivedataKtx}"
        const val archViewModel =
            "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycleLivedataKtx}"
        const val archComponents =
            "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleLivedataKtx}"
        const val browser = "androidx.browser:browser:${Versions.browser}"

        object Navigation {
            const val fragmentKtx =
                "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
            const val uiKtx =
                "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        }

        object Compose {
            const val ui = "androidx.compose.ui:ui:${Versions.compose}"
            const val systemUiController =
                "com.google.accompanist:accompanist-systemuicontroller:${Versions.composeSystemUi}"
            const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
            const val runtimeLiveData =
                "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
            const val material = "androidx.compose.material:material:${Versions.compose}"
            const val uiTooling = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
            const val navigation =
                "androidx.navigation:navigation-compose:${Versions.composeNavigation}"
            const val viewModel =
                "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModel}"
        }
    }

    const val kotlinxCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutines}"

    object Dagger {
        const val dagger =
            "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerAndroid =
            "com.google.dagger:dagger-android:${Versions.dagger}"
        const val daggerAndroidSupport =
            "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val daggerCompiler =
            "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val daggerAndroidProcessor =
            "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    }

    object Hilt {
        const val hiltAndroid =
            "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltAndroidCompiler =
            "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val hiltCompiler =
            "androidx.hilt:hilt-compiler:${Versions.hiltJetpack}"
        const val hiltViewModel =
            "com.google.dagger:hilt-android-compiler:${Versions.hiltVM}"
        const val hiltNavigationCompose =
            "androidx.hilt:hilt-navigation-compose:${Versions.hiltVM}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitConverterGson =
            "com.squareup.retrofit2:converter-gson:${Versions.retrofitConverterGson}"
    }

    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
    const val lottieCompose = "com.airbnb.android:lottie-compose:${Versions.lottieCompose}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLoggingInterceptor}"

    const val coilCompose = "io.coil-kt:coil-compose:${Versions.coil}"

    const val bottomSheet =
        "com.qhutch.bottomsheetlayout:bottomsheetlayout:${Versions.bottomSheet}"

    const val jodaTime = "joda-time:joda-time:${Versions.jodaTime}"

    const val solidRecyclerView =
        "com.mitteloupe.solid:solidrecyclerview:${Versions.solidRecyclerView}"
}

object TestDependencies {

    object AndroidX {
        const val core =
            "androidx.test:core:${Versions.androidxTest}"
        const val coreKtx =
            "androidx.test:core-ktx:${Versions.androidxTest}"
        const val runner =
            "androidx.test:runner:${Versions.androidxTest}"
        const val rules =
            "androidx.test:rules:${Versions.androidxTest}"
        const val espressoCore =
            "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val espressoContrib =
            "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
        const val junit =
            "androidx.test.ext:junit:${Versions.androidxJunit}"
        const val coreTesting =
            "android.arch.core:core-testing:${Versions.coreTesting}"
    }

    const val kotlinxCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinxCoroutines}"

    object JUnit {
        const val junit =
            "junit:junit:${Versions.junit}"
        const val junitPlatformRunner =
            "org.junit.platform:junit-platform-runner:${Versions.junitPlatformRunner}"
    }

    const val livedataTesting =
        "com.jraska.livedata:testing-ktx:${Versions.livedataTesting}"

    object Mockito {
        const val mockitoCore =
            "org.mockito:mockito-core:${Versions.mockito}"
        const val mockitoInline =
            "org.mockito:mockito-inline:${Versions.mockito}"
        const val mockitoKotlin =
            "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlin}"
    }

    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"
}
