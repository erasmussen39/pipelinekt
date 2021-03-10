package com.code42.jenkins.pipelinekt.core.secrets

import com.code42.jenkins.pipelinekt.core.vars.Var

data class VaultSecret(
    val path: Var,
    val engineVersion: Var,
    val envVar: Var,
    val vaultKey: Var
) :
    VaultSecrets {
    override fun toGroovy(): String {
        return "vaultSecrets: [[path: '$path', engineVersion: $engineVersion, secretValues: [[envVar: '$envVar', vaultKey: '$vaultKey']]]]"
    }
}
