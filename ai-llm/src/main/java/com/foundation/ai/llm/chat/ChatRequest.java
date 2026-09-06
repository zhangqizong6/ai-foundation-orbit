package com.foundation.ai.llm.chat;

import com.foundation.ai.core.context.Context;
import com.foundation.ai.core.metadata.Metadata;

/**
 * @ClassName: ChatRequest
 * @description: 大语言模型聊天请求，封装模型标识、聊天上下文、模型参数及请求元数据
 * @author: zhangqz
 * @date: 2026/9/6
 */
public final class ChatRequest {

    private final String modelId;

    private final Context context;

    private final ChatOptions options;

    private final Metadata metadata;

    public ChatRequest(String modelId, Context context) {
        this(modelId, context, new ChatOptions(), new Metadata());
    }

    public ChatRequest(String modelId, Context context, ChatOptions options, Metadata metadata) {

        if (modelId == null || modelId.trim().isEmpty()) {
            throw new IllegalArgumentException("Chat modelId must not be empty");
        }

        if (context == null) {
            throw new IllegalArgumentException("Chat context must not be null");
        }

        if (options == null) {
            throw new IllegalArgumentException("Chat options must not be null");
        }

        if (metadata == null) {
            throw new IllegalArgumentException("Chat metadata must not be null");
        }

        this.modelId = modelId;
        this.context = context;
        this.options = options;
        this.metadata = metadata;
    }

    public String getModelId() {
        return modelId;
    }

    public Context getContext() {
        return context;
    }

    public ChatOptions getOptions() {
        return options;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}