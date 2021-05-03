package com.code42.jenkins.pipelinekt.internal.environment

import com.code42.jenkins.pipelinekt.core.Environment
import com.code42.jenkins.pipelinekt.core.vars.Var
import com.code42.jenkins.pipelinekt.core.writer.GroovyWriter

data class EnvVar(val name: Var.Literal.Str, val value: Var.Literal.Str) : Environment {
    override fun toGroovy(writer: GroovyWriter) {
        writer.writeln("${name.toGroovy()}=${value.toGroovy()}")
    }
}
