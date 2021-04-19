package com.github.luismigil.intellijcustomplugin.services

import com.github.luismigil.intellijcustomplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
