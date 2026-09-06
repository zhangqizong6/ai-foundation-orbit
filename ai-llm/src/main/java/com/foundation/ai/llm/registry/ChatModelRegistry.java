package com.foundation.ai.llm.registry;

import com.foundation.ai.llm.chat.ChatModel;

/**
 * @ClassName: ChatModelRegistry
 * @description: 聊天模型注册中心，负责管理及查找可用的ChatModel
 * @author: zhangqz
 * @date: 2026/9/6
 */
public interface ChatModelRegistry {

    /**
     * 注册聊天模型。
     *
     * @param model 聊天模型
     */
    void register(ChatModel model);

    /**
     * 根据模型标识获取聊天模型。
     *
     * @param modelId 模型标识
     * @return 聊天模型
     */
    ChatModel get(String modelId);
}