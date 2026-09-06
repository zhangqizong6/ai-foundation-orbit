package com.foundation.ai.core.context;

import com.foundation.ai.core.message.Message;
import com.foundation.ai.core.metadata.Metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: Context
 * @description: AI处理过程中的运行上下文，用于保存消息及处理过程中的附加元数据
 * @author: zhangqz
 * @date: 2026/9/6 19:18
 */
public class Context {

    /**
     * 当前上下文中的消息
     */
    private final List<Message> messages;

    /**
     * 当前上下文的附加元数据
     */
    private final Metadata metadata;

    /**
     * 创建空Context
     */
    public Context() {
        this.messages = new ArrayList<>();
        this.metadata = new Metadata();
    }

    /**
     * 添加消息
     *
     * @param message 消息
     */
    public void addMessage(Message message) {
        if (message == null) {
            throw new IllegalArgumentException("Context message must not be null");
        }

        messages.add(message);
    }

    /**
     * 获取当前上下文中的所有消息
     *
     * @return 只读消息列表
     */
    public List<Message> getMessages() {
        return Collections.unmodifiableList(messages);
    }

    /**
     * 获取当前上下文中的消息数量
     *
     * @return 消息数量
     */
    public int messageCount() {
        return messages.size();
    }

    /**
     * 清空当前上下文中的所有消息
     */
    public void clearMessages() {
        messages.clear();
    }

    /**
     * 获取上下文元数据
     *
     * @return 上下文元数据
     */
    public Metadata getMetadata() {
        return metadata;
    }
}