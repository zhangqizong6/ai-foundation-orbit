package com.foundation.ai.llm.provider.openai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @ClassName: OpenAiChatRequest
 * @description: OpenAI兼容聊天接口请求对象
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class OpenAiChatRequest {

    private String model;

    private List<OpenAiMessage> messages;

    private Double temperature;

    @JsonProperty("max_tokens")
    private Integer maxTokens;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<OpenAiMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<OpenAiMessage> messages) {
        this.messages = messages;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }
}