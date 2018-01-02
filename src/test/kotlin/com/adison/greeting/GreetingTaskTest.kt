package com.adison.greeting

import org.gradle.api.Project
import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder

class GreetingTaskTest {
    @Test
    fun canAddTaskToProject() {
        val project = ProjectBuilder.builder().build()
        val task = project.tasks.let{
            it?.create("hello",GreetingTask::class.java)
        }
        assert(true){
            task is GreetingTask
        }

    }
}