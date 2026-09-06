package com.foundation.ai.llm.provider.openai.dto;

/**
 * @ClassName: OpenAiMessage
 * @description: OpenAI兼容聊天接口消息对象
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class OpenAiMessage {

    private String role;

    private String content;

    public OpenAiMessage() {
    }

    public OpenAiMessage(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}