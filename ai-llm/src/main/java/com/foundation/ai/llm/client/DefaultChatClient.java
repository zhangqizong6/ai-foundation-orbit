package com.foundation.ai.llm.client;

import com.foundation.ai.llm.chat.ChatModel;
import com.foundation.ai.llm.chat.ChatRequest;
import com.foundation.ai.llm.chat.ChatResponse;
import com.foundation.ai.llm.registry.ChatModelRegistry;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DefaultChatClient
 * @description: ChatClient默认实现，负责根据请求选择聊天模型并执行模型调用
 * @author: zhangqz
 * @date: 2026/9/6
 */
@Component
public class DefaultChatClient implements ChatClient {

    private final ChatModelRegistry modelRegistry;

    public DefaultChatClient(ChatModelRegistry modelRegistry) {
        if (modelRegistry == null) {
            throw new IllegalArgumentException("Chat model registry must not be null");
        }

        this.modelRegistry = modelRegistry;
    }

    @Override
    public ChatResponse chat(ChatRequest request) {

        if (request == null) {
            throw new IllegalArgumentException("Chat request must not be null");
        }

        ChatModel model = modelRegistry.get(request.getModelId());

        if (model == null) {
            throw new IllegalArgumentException("Chat model not found: " + request.getModelId());
        }

        return model.chat(request);
    }
}