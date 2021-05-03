package com.code42.jenkins.pipelinekt.dsl.environment

import com.code42.jenkins.pipelinekt.core.Environment
import com.code42.jenkins.pipelinekt.core.vars.Var
import com.code42.jenkins.pipelinekt.core.vars.ext.strDouble
import com.code42.jenkins.pipelinekt.dsl.DslContext
import com.code42.jenkins.pipelinekt.internal.environment.EnvVar

fun DslContext<Environment>.jdk(name: String, value: String) {
    envVar(name.strDouble(), value.strDouble())
}

fun DslContext<Environment>.envVar(name: Var.Literal.Str, value: Var.Literal.Str) {
    add(EnvVar(name, value))
}
