package cc.linghuchong.kplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class KPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        var helper = project.extensions.create("KHelper", KHelperExtension::class.java)
        project.tasks.create("KotlinHello") {
            println(helper.message)
        }

//        if (!project.hasProperty("android")){
//            return
//        }
//
//        project.property("android")
    }

}