package com.code42.jenkins.pipelinekt.core.secrets

import com.code42.jenkins.pipelinekt.core.vars.Var

data class VaultSecret(
    val path: Var.Literal.Str,
    val engineVersion: Var.Literal.Str,
    val envVar: Var.Literal.Str,
    val vaultKey: Var.Literal.Str
) :
    VaultSecrets {
    override fun toGroovy(): String {
        return "vaultSecrets: [[path: '$path', engineVersion: $engineVersion, secretValues: [[envVar: '$envVar', vaultKey: '$vaultKey']]]]"
    }
}
