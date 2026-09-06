package com.foundation.ai.llm.client;

import com.foundation.ai.llm.chat.ChatRequest;
import com.foundation.ai.llm.chat.ChatResponse;

/**
 * @ClassName: ChatClient
 * @description: 大语言模型聊天客户端，提供统一的聊天调用入口
 * @author: zhangqz
 * @date: 2026/9/6
 */
public interface ChatClient {
    /**
     * 执行聊天请求
     *
     * @param request 聊天请求
     * @return 聊天响应
     */
    ChatResponse chat(ChatRequest request);
}