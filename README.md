# 🛰️ AI Foundation Orbit

> **构建属于自己的 AI 应用基础。**

**AI Foundation Orbit** 是一个基于 Java 的 AI 应用架构实践项目。

从成熟的 Java 工程能力出发，探索 **LLM、Embedding、RAG、Knowledge、Agent、Workflow** 等 AI 技术背后的工程设计与架构思想。

它不追求堆砌 AI Demo，而是尝试回答一个更核心的问题：

> **一个真正可扩展、可维护的 AI 应用，应该如何被设计和构建？**

**Foundation 是基础，Orbit 是不断扩展的能力边界。**

---

## 🧩 Modules

### AI Core

`ai-core` 是项目的 AI 基础领域模块，提供各 AI 能力模块共同使用的核心概念。

目前包含：

* `Model`：AI 模型基础抽象
* `Message`：AI 交互消息
* `MessageRole`：消息角色
* `MessageContent`：消息内容抽象
* `TextContent`：文本消息内容
* `Context`：AI 处理上下文
* `Metadata`：对象附加元数据

---

### AI LLM

`ai-llm` 提供大语言模型聊天能力，并基于 `ai-core` 建立统一的 LLM 调用抽象。

核心能力包括：

* `ChatModel`：聊天模型抽象
* `ChatRequest`：聊天请求
* `ChatResponse`：聊天响应
* `ChatOptions`：模型生成参数
* `ChatUsage`：Token 使用统计
* `ChatClient`：统一聊天调用入口
* `ChatModelRegistry`：聊天模型注册与管理

当前已实现 OpenAI-compatible Provider：

```text
ChatClient
    ↓
ChatModelRegistry
    ↓
ChatModel
    ↓
OpenAiChatModel
    ↓
OpenAiClient
    ↓
OpenAI-compatible API
```

支持通过 Spring Boot 配置注册多个聊天模型，并通过统一的 `ChatClient` 进行调用。

---

## 🏗️ Project Structure

```text
ai-foundation-orbit
├── ai-core
│   └── AI 核心领域模型
│
├── ai-llm
│   └── LLM 聊天能力
│       └── OpenAI-compatible Provider
│
└── ...
```

---

## 本地构建与测试

使用 JDK 8 和支持 Java 8 的 Maven 3.9.x，在仓库根目录执行：

```bash
mvn --batch-mode --no-transfer-progress verify
```

默认验证无需模型凭据。GitHub Actions 对推送到 `main` 的提交以及以 `main` 为目标的 PR 执行相同命令。

OpenAI 兼容服务集成测试需要显式启用。配置环境变量 `AI_LLM_API_KEY` 后，可使用仓库的 `show` 配置运行：

```bash
mvn --batch-mode --no-transfer-progress -Dorbit.live-tests=true -Dspring.profiles.active=show test
```

仓库协作约定见 [AGENTS.md](AGENTS.md)。

---

> 🛰️ **Build the foundation. Explore the orbit.**
