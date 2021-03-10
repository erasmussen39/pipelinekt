[pipelinekt-external](../../index.md) / [com.code42.jenkins.pipelinekt.core.secrets](../index.md) / [VaultSecret](./index.md)

# VaultSecret

`data class VaultSecret : `[`VaultSecrets`](../-vault-secrets/index.md) [(source)](https://github.com/code42/pipelinekt/tree/master/core/src/main/kotlin/com/code42/jenkins/pipelinekt/core/secrets/VaultSecret.kt#L5)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `VaultSecret(path: Str, engineVersion: Str, envVar: Str, vaultKey: Str)` |

### Properties

| Name | Summary |
|---|---|
| [engineVersion](engine-version.md) | `val engineVersion: Str` |
| [envVar](env-var.md) | `val envVar: Str` |
| [path](path.md) | `val path: Str` |
| [vaultKey](vault-key.md) | `val vaultKey: Str` |

### Functions

| Name | Summary |
|---|---|
| [toGroovy](to-groovy.md) | `fun toGroovy(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
