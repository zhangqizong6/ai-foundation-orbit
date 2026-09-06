package com.foundation.ai.llm.provider.openai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @ClassName: OpenAiUsage
 * @description: OpenAI兼容聊天接口Token使用统计
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class OpenAiUsage {

    @JsonProperty("prompt_tokens")
    private Integer promptTokens;

    @JsonProperty("completion_tokens")
    private Integer completionTokens;

    @JsonProperty("total_tokens")
    private Integer totalTokens;

    public Integer getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    public Integer getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Integer getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }
}