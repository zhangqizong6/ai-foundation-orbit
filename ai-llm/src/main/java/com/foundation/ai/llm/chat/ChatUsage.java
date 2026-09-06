package com.foundation.ai.llm.chat;

/**
 * @ClassName: ChatUsage
 * @description: 大语言模型聊天调用的Token使用统计
 * @author: zhangqz
 * @date: 2026/9/6
 */
public final class ChatUsage {

    private final Integer promptTokens;

    private final Integer completionTokens;

    private final Integer totalTokens;

    public ChatUsage(Integer promptTokens, Integer completionTokens, Integer totalTokens) {
        this.promptTokens = promptTokens;
        this.completionTokens = completionTokens;
        this.totalTokens = totalTokens;
    }

    public Integer getPromptTokens() {
        return promptTokens;
    }

    public Integer getCompletionTokens() {
        return completionTokens;
    }

    public Integer getTotalTokens() {
        return totalTokens;
    }
}