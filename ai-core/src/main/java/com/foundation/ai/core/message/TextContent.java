package com.foundation.ai.core.message;

/**
 * @ClassName: TextContent
 * @description: AI消息中的文本内容
 * @author: zhangqz
 * @date: 2026/9/6 19:18
 */
public final class TextContent implements MessageContent {

    private final String text;

    public TextContent(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text content must not be null");
        }

        this.text = text;
    }

    public String getText() {
        return text;
    }
}