# AI Foundation Orbit 工程规范

## 作用域

- 本规范适用于 Orbit 仓库及其模块。涉及多个工作区时，按解析符号链接后的目标文件路径判断各自适用的规范。公司项目的专属 Skill、SVN 流程和业务约定由对应工作区管理。
- Orbit 使用 Git 和 GitHub。架构设计、AI 能力开发和 Provider 审查使用 [Orbit Development Skill](.agents/skills/orbit-development/SKILL.md)。

## 技术基线

- 以根 [pom.xml](pom.xml) 为准。当前使用 JDK 8、Spring Boot 2.7.18、Maven 多模块结构，父工程版本为 `1.0`，基础包名为 `com.foundation`。变更 Java 或 Spring Boot 基线前先讨论兼容性和迁移影响。
- `ai-core` 提供跨模块的领域抽象，保持对上层能力和厂商实现的独立性。`ai-llm` 依赖 `ai-core`，提供聊天契约，并在 Provider 边界接入厂商实现。
- 基于实际用例判断是否需要扩展接口、抽象或模块。影响公开契约、模块职责或依赖方向的决定应记录设计理由。

## 构建和交付

- 从仓库根目录执行 [README 中的构建命令](README.md#本地构建与测试)。默认验证应能在没有模型凭据的环境中运行。真实服务测试由开发者显式开启。
- 模型凭据通过环境变量或本地配置注入。提交前检查差异中的凭据、公司资料和本机构建产物，说明验证结果及未执行的检查。
