package com.foundation.ai.llm.chat;

import com.foundation.ai.core.message.Message;
import com.foundation.ai.core.metadata.Metadata;

/**
 * @ClassName: ChatResponse
 * @description: 大语言模型聊天响应，封装模型生成的消息、模型标识、Token使用情况及响应元数据
 * @author: zhangqz
 * @date: 2026/9/6
 */
public final class ChatResponse {

    private final Message message;

    private final String modelId;

    private final ChatUsage usage;

    private final Metadata metadata;

    public ChatResponse(Message message, String modelId, ChatUsage usage) {
        this(message, modelId, usage, new Metadata());
    }

    public ChatResponse(Message message, String modelId, ChatUsage usage, Metadata metadata) {

        if (message == null) {
            throw new IllegalArgumentException("Chat response message must not be null");
        }

        if (modelId == null || modelId.trim().isEmpty()) {
            throw new IllegalArgumentException("Chat response modelId must not be empty");
        }

        if (usage == null) {
            throw new IllegalArgumentException("Chat response usage must not be null");
        }

        if (metadata == null) {
            throw new IllegalArgumentException("Chat response metadata must not be null");
        }

        this.message = message;
        this.modelId = modelId;
        this.usage = usage;
        this.metadata = metadata;
    }

    public Message getMessage() {
        return message;
    }

    public String getModelId() {
        return modelId;
    }

    public ChatUsage getUsage() {
        return usage;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}