package com.adison.greeting

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project

class GreetingPluginTest {
    @Test
    fun greeterPluginAddsGreetingTaskToProject() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("com.adison.greeting")
        assert(true){
            project.tasks.getByName("hello") is GreetingTask
        }
    }
}
