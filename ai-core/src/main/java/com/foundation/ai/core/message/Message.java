package com.foundation.ai.core.message;

import com.foundation.ai.core.metadata.Metadata;

/**
 * @ClassName: Message
 * @description: AI交互消息，表示AI应用中的一条基础消息
 * @author: zhangqz
 * @date: 2026/9/6 19:18
 */
public final class Message {

    private final MessageRole role;

    private final MessageContent content;

    private final Metadata metadata;

    public Message(MessageRole role, MessageContent content) {
        this(role, content, new Metadata());
    }

    public Message(MessageRole role,
                   MessageContent content,
                   Metadata metadata) {

        if (role == null) {
            throw new IllegalArgumentException("Message role must not be null");
        }

        if (content == null) {
            throw new IllegalArgumentException("Message content must not be null");
        }

        if (metadata == null) {
            throw new IllegalArgumentException("Message metadata must not be null");
        }

        this.role = role;
        this.content = content;
        this.metadata = metadata;
    }

    public MessageRole getRole() {
        return role;
    }

    public MessageContent getContent() {
        return content;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}