package com.foundation.ai.llm.provider.openai.dto;

import java.util.List;

/**
 * @ClassName: OpenAiChatResponse
 * @description: OpenAI兼容聊天接口响应对象
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class OpenAiChatResponse {

    private String id;

    private String model;

    private List<OpenAiChoice> choices;

    private OpenAiUsage usage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<OpenAiChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<OpenAiChoice> choices) {
        this.choices = choices;
    }

    public OpenAiUsage getUsage() {
        return usage;
    }

    public void setUsage(OpenAiUsage usage) {
        this.usage = usage;
    }
}