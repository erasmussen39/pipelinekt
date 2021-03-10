[pipelinekt-external](../../index.md) / [com.code42.jenkins.pipelinekt.internal.step.declarative](../index.md) / [WithVault](./index.md)

# WithVault

`data class WithVault : `[`DeclarativeStep`](../../com.code42.jenkins.pipelinekt.core.step/-declarative-step.md)`, `[`NestedStep`](../../com.code42.jenkins.pipelinekt.core.step/-nested-step/index.md) [(source)](https://github.com/code42/pipelinekt/tree/master/internal/src/main/kotlin/com/code42/jenkins/pipelinekt/internal/step/declarative/WithVault.kt#L15)

Inject secrets to some steps

### Parameters

`secrets` - the secrets to inject

`steps` - the steps to inject

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Inject secrets to some steps`WithVault(secrets: `[`VaultSecrets`](../../com.code42.jenkins.pipelinekt.core.secrets/-vault-secrets/index.md)`, steps: `[`Step`](../../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [secrets](secrets.md) | the secrets to inject`val secrets: `[`VaultSecrets`](../../com.code42.jenkins.pipelinekt.core.secrets/-vault-secrets/index.md) |
| [steps](steps.md) | the steps to inject`val steps: `[`Step`](../../com.code42.jenkins.pipelinekt.core.step/-step/index.md) |

### Functions

| Name | Summary |
|---|---|
| [toGroovy](to-groovy.md) | `fun toGroovy(writer: `[`GroovyWriter`](../../com.code42.jenkins.pipelinekt.core.writer/-groovy-writer/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
