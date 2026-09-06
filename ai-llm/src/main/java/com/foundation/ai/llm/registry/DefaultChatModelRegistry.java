package com.foundation.ai.llm.registry;

import com.foundation.ai.llm.chat.ChatModel;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: DefaultChatModelRegistry
 * @description: ChatModel默认注册中心，负责管理及查找系统中的聊天模型
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class DefaultChatModelRegistry implements ChatModelRegistry {

    private final Map<String, ChatModel> models;

    public DefaultChatModelRegistry(List<? extends ChatModel> chatModels) {

        this.models = new HashMap<>();

        if (chatModels == null) {
            return;
        }

        for (ChatModel chatModel : chatModels) {
            register(chatModel);
        }
    }

    @Override
    public void register(ChatModel model) {

        if (model == null) {
            throw new IllegalArgumentException("Chat model must not be null");
        }

        String modelId = model.getModelId();

        if (modelId == null || modelId.trim().isEmpty()) {
            throw new IllegalArgumentException("Chat modelId must not be empty");
        }

        if (models.containsKey(modelId)) {
            throw new IllegalArgumentException("Chat model already registered: " + modelId);
        }

        models.put(modelId, model);
    }

    @Override
    public ChatModel get(String modelId) {

        if (modelId == null || modelId.trim().isEmpty()) {
            throw new IllegalArgumentException("Chat modelId must not be empty");
        }

        return models.get(modelId);
    }

    public Map<String, ChatModel> getModels() {
        return Collections.unmodifiableMap(models);
    }
}