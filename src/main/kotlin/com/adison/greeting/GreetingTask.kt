package com.adison.greeting

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class GreetingTask : DefaultTask() {
    var greeting = "hello from GreetingTask"

    @TaskAction
    fun greet() {
        print(greeting)
    }
}