---
name: orbit-development
description: "Use for ai-foundation-orbit architecture design, AI capability changes, and reviews of module boundaries or provider integrations. Covers changes in this repository and research tied to its design decisions."
---

# Orbit Development

先阅读仓库根目录的 [AGENTS.md](../../../AGENTS.md) 和 [README.md](../../../README.md)。从相关模块的 POM、调用方和测试核实当前实现。需要理解长期目标或设计背景时，查阅 [项目协作背景](../../../ai-chat-init-context.md)。

## 设计与审查

- 从待解决的实际用例出发，列出调用方需要的输入、输出与错误行为。LLM 改动按实际请求路径检查 `ChatClient → ChatModelRegistry → ChatModel → Provider`，记录会受影响的接口和配置。
- 将跨能力共享的领域概念放在 `ai-core`。将聊天语义和模型调用约定放在 `ai-llm`。在 Provider 边界处理厂商 DTO、认证、HTTP、配置和响应映射。
- 对照现有实现说明改动的必要性、模块归属和验证方式。当选择会改变公开契约、模块依赖或兼容性时，给出实际取舍。形成重要架构决策后，在 `docs/adr/` 记录背景、选项、决定和后果。
- 涉及外部模型时，先用本地测试验证领域行为和请求响应映射。真实模型测试沿用 README 的显式启用方式，凭据从环境注入。
