// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:3.3.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.21")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

//task clean(type: Delete) {
//    delete (rootProject.buildDir)
//}