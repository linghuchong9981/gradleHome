package com.linghuchong.cc.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ChangeApkNamePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        if (!project.android){
            return
        }


        project.android.applicationVariants.all{
            variant ->
                variant.outputs.all{
                    outputFileName="${variant.name}-${variant.versionName}-plugin-modify.apk"
                }
        }
    }
}
