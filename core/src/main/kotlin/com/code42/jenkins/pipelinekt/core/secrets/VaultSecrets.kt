package com.code42.jenkins.pipelinekt.core.secrets

data class VaultSecrets(
    val path: String,
    val engineVersion: String,
    val secrets: List<VaultSecret>
) :
    Secrets {
    override fun toGroovy(): String {
        val builder = StringBuilder("vaultSecrets: [[path: '$path', engineVersion: $engineVersion, secretValues: [")
        val listIterator = secrets.listIterator()
        while (listIterator.hasNext()) {
            builder.appendln("    " + listIterator.next().toGroovy())
            if (listIterator.hasNext())
                builder.append(",")
        }
        builder.appendln("]]]")
        return builder.toString()
    }
}
