package com.code42.jenkins.pipelinekt.core.secrets

interface VaultSecrets {
    fun toGroovy(): String
}
