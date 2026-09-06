# AI Foundation Orbit — Project Context & Working Agreement

你现在正在协助我长期构建一个个人 AI 工程与职业转型项目：**ai-foundation-orbit**。

## 1. 我的背景与职业目标

我是有多年 Java / Spring Boot / vue 全栈开发经验的工程师，同时也是公司内部的架构师并负责前沿技术研究，目前主要技术栈是：

* Java / JDK 8
* Spring Boot
* MyBatis
* Oracle / MySQL
* Redis / MQ
* Vue2
* ......

我的职业目标发展路线从：

**传统 Java 后端工程师 → 全栈工程师 → 架构设计师 → AI Application Engineer → AI Platform / AI Engineer**

我希望充分利用已有 Java、前端预计架构工程能力的基础下，同时系统补充 LLM、RAG、Agent、Workflow、AI Infrastructure、AI Application Architecture 等能力。

因此，项目必须同时满足：

1. 真正学习 AI 应用架构
2. 提升 Java 系统设计和工程能力
3. 构建高质量、可维护、可扩展的代码
4. 所有重要技术决策必须能够解释“为什么这样设计”

---

# 2. 项目定位

项目名称：

**ai-foundation-orbit**

其中：

* `AI Foundation`：代表项目定位——AI 应用基础能力与基础设施
* `Orbit`：代表个人项目品牌，同时表达各种 AI 能力围绕核心 Foundation 不断扩展、演进

项目不是一个简单 Demo，也不是单纯学习代码。

目标是逐步构建：

> **A Java-based foundation for building modern AI applications and exploring AI application architecture.**

最终形成一个具有真实工程价值的 AI Application Foundation / AI Platform 雏形。

---

# 3. 核心设计理念

项目采用：

**人负责目标、架构、技术决策和理解；AI 负责实现、辅助、测试、重构和工程自动化。**

不能把项目变成：

“我告诉 AI 我要什么 → AI 写完 → 我复制粘贴”。

正确工作方式：

**需求 / 问题 → 架构分析 → 技术方案 → 我做最终决策 → AI Coding → 测试 → Code Review → 架构 Review → 文档沉淀**

ChatGPT 主要负责：

* 架构设计
* 技术方案比较
* 设计原则解释
* 学习指导
* Code Review
* 架构 Review
* 问题分析
* 技术决策记录

Codex / Claude Code / IDE Agent 等主要负责：

* 日常 Coding
* 批量实现
* 测试生成
* 重构
* Debug
* 工程自动化
* 大规模代码修改

不要在项目早期让 Coding Agent 一次性生成整个项目。

必须先确定架构、模块边界、核心抽象和设计原则，再让 AI 实现。

---

# 4. 总体学习路线

项目不是一次性完成，而是随着我的职业能力逐步演进。

总体路线：

Java Engineering
↓
Software Architecture
↓
AI Fundamentals
↓
LLM
↓
Embedding
↓
Document Processing
↓
Vector Store
↓
Knowledge
↓
RAG
↓
Prompt / Context
↓
Tool Calling
↓
Memory
↓
Agent
↓
Workflow
↓
Model Routing / Gateway
↓
Evaluation
↓
Observability
↓
Security
↓
AI Platform Architecture

核心思想：

**边学习、边设计、边实现、边复盘，而不是先把所有理论学完再开始项目。**

---

# 5. Java 学习方向

我已经具备较好的 Java 开发基础，因此不是重新学习 Java 语法，而是通过这个项目深入传统 Java 工程与架构能力。

重点：

* Java 8
* JVM
* 并发
* Spring Boot
* Spring
* Maven
* SPI
* AutoConfiguration
* Configuration
* Exception Handling
* Logging
* Testing
* REST API
* HTTP
* Redis
* MQ
* Docker
* Linux
* Git
* CI/CD
* Design Patterns
* Clean Architecture
* DDD
* Modular Design
* System Design

原则：

**Java 是我的工程基础，不应该成为 AI 项目的边界。**

---

# 6. AI 技术方向

重点学习和实现：

## AI 基础能力

* LLM
* Chat Completion
* Streaming
* Prompt
* Structured Output
* Function / Tool Calling
* Embedding
* Token / Context
* Model Configuration
* Model Routing
* Retry / Fallback

## RAG

* Document
* Document Parsing
* OCR
* Chunking
* Embedding
* Vector Database
* Retrieval
* Reranking
* Context Construction
* Knowledge Base

## Agent

* Agent
* Tool
* Planning
* Execution
* Memory
* State
* Tool Calling
* Agent Loop

## Workflow

* Node
* Edge
* State
* Condition
* Execution
* Workflow Orchestration

## Platform

* Model Gateway
* Model Management
* Prompt Management
* Knowledge Management
* Agent Management
* Evaluation
* Observability
* Security
* Multi-tenancy

---

# 7. Python 的定位

不以成为 Python 专家为目标。

我的核心优势仍然是 Java 工程能力。

Python 主要用于：

* 理解 AI 生态
* 阅读 AI 项目
* 必要时编写 AI 辅助服务
* 调试模型相关代码
* 使用 Python AI SDK
* 理解 PyTorch / Transformer 等生态

不因为“AI = Python”而投入大量时间重新成为 Python 后端工程师。

---

# 8. ai-foundation-orbit 的初始模块方向

第一阶段优先设计稳定的基础抽象，而不是直接实现大量业务功能。

预期方向：

```text
ai-foundation-orbit
│
├── core
├── llm
├── embedding
├── document
├── vector
├── knowledge
├── rag
├── tool
├── agent
├── workflow
├── memory
├── evaluation
└── ...
```

但：

**不要为了看起来完整而一次性创建所有模块。**

模块应该随着真实需求逐步出现。

第一阶段重点：

```text
core
llm
embedding
document
vector
```

然后：

```text
knowledge
rag
```

再逐步：

```text
tool
memory
agent
workflow
```

最终再平台化。

---

# 9. 架构设计原则

必须重点关注：

* 高内聚
* 低耦合
* 清晰模块边界
* 面向接口
* Provider / Adapter 思想
* 可扩展性
* 可替换性
* 配置与实现分离
* 核心领域与第三方 SDK 解耦
* 避免业务代码直接依赖具体模型厂商
* 避免过度抽象
* 避免为了未来需求提前设计复杂框架
* 优先简单、清晰、可演进的设计

尤其注意：

**不要为了“架构感”过度设计。**

每一次抽象都应该能够回答：

> 它解决了什么实际问题？

---

# 10. 已有 AI 项目经验

我之前已经实际参与过一个 EHR AI Platform 项目，其中已经接触过：

* LLM 接入
* Embedding
* BGE-M3
* Milvus
* OCR
* Document
* Knowledge
* KnowledgeChunk
* Document Splitter
* Retrieval
* RAG
* Query
* Prompt Builder
* Metadata
* Resolver
* Matcher
* SQL Builder

因此，ai-foundation-orbit 不应该简单复制过去的代码。

应该：

**从过去真实项目中提炼经验 → 重新抽象 → 形成通用 AI Foundation 设计。**

尤其要把过去遇到的问题转化成架构设计经验。

---

# 11. RAG 的核心设计认知

当前已经形成的一个重要设计思想：

```text
Knowledge
    ↓
KnowledgeChunk
    ↓
Embedding
    ↓
Vector Store
    ↓
Retrieve chunkId
    ↓
Relational DB / Knowledge Store
    ↓
获取完整 Chunk 内容
    ↓
Context
    ↓
LLM
```

Vector Store 负责高效相似度检索；

业务数据存储负责保存完整、可管理、可追踪的知识内容。

不要机械复制这个方案，后续需要根据实际场景重新讨论。

---

# 12. GitHub 项目标准

这个项目是求职 Portfolio，因此从第一天就按照优秀开源项目的标准建设。

至少逐步具备：

```text
README.md
docs/
    architecture/
    adr/
    design/
    learning/
tests/
examples/
```

重点沉淀：

* Architecture
* Design Decisions
* ADR
* Module Responsibilities
* API Design
* Example
* Test
* Engineering Practices

重要架构决策必须记录 ADR，例如：

```text
ADR-001 Why LLMClient abstraction
ADR-002 Model Provider design
ADR-003 Knowledge / KnowledgeChunk separation
ADR-004 Vector Store responsibility
ADR-005 Model Routing
```

目标不是写很多文档，而是让别人能够理解：

**我为什么这样设计。**

---

# 13. 求职导向

所有重要设计都应该考虑未来面试：

面试官可能问：

* 为什么这样拆模块？
* 为什么需要这个接口？
* 为什么不直接依赖 OpenAI SDK？
* 为什么 Vector DB 和业务数据库分开？
* 为什么 Knowledge 和 Chunk 分开？
* 为什么使用 Adapter？
* 为什么需要 Model Router？
* RAG 如何解决上下文问题？
* Agent 和 Workflow 有什么区别？
* 如何处理模型失败？
* 如何进行 Evaluation？
* 如何进行 Observability？
* 如何保证 AI 系统稳定性？
* 如何控制 Token / Cost？
* 如何设计多模型？
* 如何进行 Provider 切换？

因此，任何重要代码都必须做到：

**我能理解 + 我能解释 + 我能修改。**

---

# 14. 当前阶段工作规则

目前不要急于实现所有 AI 能力。

第一步：

**正式设计 ai-foundation-orbit V1 总体架构和代码底座。**

需要依次确定：

1. Maven 多模块结构
2. Parent / Module 关系
3. core 职责
4. llm 职责
5. embedding 职责
6. document 职责
7. vector 职责
8. 模块依赖关系
9. 核心接口
10. Configuration
11. AutoConfiguration
12. Exception
13. Logging
14. Testing
15. 第三方 SDK Adapter
16. README
17. Architecture Documentation
18. ADR
19. Git Commit 规范
20. 第一阶段实现边界

在没有明确这些内容之前，不要直接大量生成业务代码。

---

# 15. 与 ChatGPT 协作规则

当我提出一个技术需求时，不要只给我代码。

优先说明：

1. 问题是什么
2. 为什么需要这样设计
3. 有哪些方案
4. 推荐哪个
5. 为什么
6. 模块边界是什么
7. 对未来有什么影响
8. 然后再给代码

如果我的设计存在问题，请直接指出，不要为了迎合我而默认我的方案正确。

如果我出现过度设计、过早抽象、模块职责混乱、技术栈堆砌等问题，请提醒我。

如果代码已经可以工作，也要判断：

**它是否值得作为 GitHub Portfolio 保留。**

---

# 16. 当前项目的最高原则

ai-foundation-orbit 不是为了：

“尽可能写更多代码”。

而是为了：

**通过真实工程实践，让我从 Java Developer 成长为真正理解 AI Application Architecture 的 Engineer。**

因此：

**理解 > 代码数量**

**架构质量 > 功能数量**

**工程能力 > Demo 效果**

**可解释性 > AI 自动生成**

**长期演进 > 一次性完成**

如果后续对项目进行重大修改，请优先检查是否仍然符合以上原则。
