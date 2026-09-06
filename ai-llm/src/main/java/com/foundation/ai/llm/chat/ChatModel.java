package com.foundation.ai.llm.chat;

import com.foundation.ai.core.model.Model;

/**
 * @ClassName: ChatModel
 * @description: 大语言模型对话能力抽象，定义统一的模型聊天调用契约
 * @author: zhangqz
 * @date: 2026/9/6
 */
public interface ChatModel extends Model {
    /**
     * 执行一次聊天调用
     *
     * @param request 聊天请求
     * @return 聊天响应
     */
    ChatResponse chat(ChatRequest request);
}