[pipelinekt](../index.md) / [com.code42.jenkins.pipelinekt.dsl.step.declarative](./index.md)

## Package com.code42.jenkins.pipelinekt.dsl.step.declarative

### Functions

| Name | Summary |
|---|---|
| [archiveArtifacts](archive-artifacts.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.archiveArtifacts(artifacts: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fingerprint: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.archiveArtifacts(artifacts: Str, fingerprint: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [bat](bat.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.bat(script: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, returnStdout: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, label: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.bat(script: Str, returnStdout: Bool = false.boolVar(), label: Str? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [booleanBuildParameterValue](boolean-build-parameter-value.md) | `fun booleanBuildParameterValue(name: Str, value: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`): `[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md)<br>`fun booleanBuildParameterValue(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`): `[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md)<br>`fun booleanBuildParameterValue(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md) |
| [build](build.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.build(jobName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md)`>, wait: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.build(jobName: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`, parameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md)`>, wait: Bool): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [checkStyle](check-style.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.checkStyle(pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`RecordIssuesTool`](../com.code42.jenkins.pipelinekt.core.issues/-record-issues-tool/index.md) |
| [cleanWs](clean-ws.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.cleanWs(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [closureDeclaration](closure-declaration.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.closureDeclaration(steps: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [dir](dir.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.dir(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, steps: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.dir(name: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`, steps: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [echo](echo.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.echo(string: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.echo(string: Str): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [emailExt](email-ext.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.emailExt(subject: Str, body: Str, emailRecipients: Str? = null, recipientProviders: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`RecipientProvider`](../com.code42.jenkins.pipelinekt.core.notifications/-recipient-provider/index.md)`>? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [invokeClosure](invoke-closure.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.invokeClosure(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, arguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`> = emptyList()): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.invokeClosure(closureVariable: Variable, arguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`> = emptyList()): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [junit](junit.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.junit(testResults: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.junit(testResults: Str): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [literal](literal.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.literal(codeBlock: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [publishHtml](publish-html.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.publishHtml(reportDir: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, reportFiles: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, reportName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, allowMissing: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, alwaysLinkToLastBuild: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, keepAll: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.publishHtml(reportDir: Str, reportFiles: Str, reportName: Str, allowMissing: Bool = true.boolVar(), alwaysLinkToLastBuild: Bool = true.boolVar(), keepAll: Bool = true.boolVar()): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [recordIssues](record-issues.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.recordIssues(aggregateResults: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, tool: `[`RecordIssuesTool`](../com.code42.jenkins.pipelinekt.core.issues/-record-issues-tool/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.recordIssues(aggregateResults: Bool = false.boolVar(), tool: `[`RecordIssuesTool`](../com.code42.jenkins.pipelinekt.core.issues/-record-issues-tool/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [rtDownload](rt-download.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.rtDownload(serverId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, buildName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, buildNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, failNoOp: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, spec: `[`RTSpec`](../com.code42.jenkins.pipelinekt.core.artifactory/-r-t-spec/index.md)`? = null, specPath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.rtDownload(serverId: Str, buildName: Str? = null, buildNumber: Str? = null, failNoOp: Bool = false.boolVar(), spec: `[`RTSpec`](../com.code42.jenkins.pipelinekt.core.artifactory/-r-t-spec/index.md)`? = null, specPath: Str? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [rtUpload](rt-upload.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.rtUpload(serverId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, buildName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, buildNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, failNoOp: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, spec: `[`RTSpec`](../com.code42.jenkins.pipelinekt.core.artifactory/-r-t-spec/index.md)`? = null, specPath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.rtUpload(serverId: Str, buildName: Str? = null, buildNumber: Str? = null, failNoOp: Bool = false.boolVar(), spec: `[`RTSpec`](../com.code42.jenkins.pipelinekt.core.artifactory/-r-t-spec/index.md)`? = null, specPath: Str? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [sh](sh.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.sh(script: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, returnStdout: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, label: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.sh(script: Str, returnStdout: Bool = false.boolVar(), label: Str? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [spotBugs](spot-bugs.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.spotBugs(pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`RecordIssuesTool`](../com.code42.jenkins.pipelinekt.core.issues/-record-issues-tool/index.md) |
| [sshAgent](ssh-agent.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.sshAgent(credentals: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, steps: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, ignoreMissing: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.sshAgent(credentals: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Str>, steps: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, ignoreMissing: Bool? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [stash](stash.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.stash(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, includes: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, allowEmpty: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, excludes: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, useDefaultExcludes: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.stash(name: Str, allowEmpty: Bool? = null, excludes: Str? = null, includes: Str? = null, useDefaultExcludes: Bool? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [stringBuildParameterValue](string-build-parameter-value.md) | `fun stringBuildParameterValue(name: Str, value: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`): `[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md)<br>`fun stringBuildParameterValue(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`): `[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md)<br>`fun stringBuildParameterValue(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md) |
| [tool](tool.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.tool(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.tool(name: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`, type: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [transitiveBooleanBuildParameterValue](transitive-boolean-build-parameter-value.md) | `fun transitiveBooleanBuildParameterValue(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md) |
| [transitiveStringBuildParameterValue](transitive-string-build-parameter-value.md) | `fun transitiveStringBuildParameterValue(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`BuildParameterValue`](../com.code42.jenkins.pipelinekt.core.build-parameter/-build-parameter-value/index.md) |
| [unstash](unstash.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.unstash(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.unstash(name: Str): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [withCredentials](with-credentials.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.withCredentials(credentials: `[`JenkinsCredentials`](../com.code42.jenkins.pipelinekt.core.credentials/-jenkins-credentials/index.md)`, steps: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [withEnv](with-env.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.withEnv(envs: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, steps: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [withEnvVars](with-env-vars.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.withEnvVars(envs: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`>, steps: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`Step`](../com.code42.jenkins.pipelinekt.core.step/-step/index.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |