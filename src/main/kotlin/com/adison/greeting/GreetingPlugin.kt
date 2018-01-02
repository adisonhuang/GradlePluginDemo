package com.adison.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin: Plugin<Project>{
    override fun apply(target: Project?) {
        target?.tasks.let {
            it?.create("hello",GreetingTask::class.java)
        }
    }
}