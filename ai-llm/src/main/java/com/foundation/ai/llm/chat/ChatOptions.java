package com.foundation.ai.llm.chat;

/**
 * @ClassName: ChatOptions
 * @description: 大语言模型聊天调用参数，定义影响模型生成行为的基础配置
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class ChatOptions {

    private final Double temperature;

    private final Integer maxTokens;

    public ChatOptions() {
        this(null, null);
    }

    public ChatOptions(Double temperature, Integer maxTokens) {
        this.temperature = temperature;
        this.maxTokens = maxTokens;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Integer getMaxTokens() {
        return maxTokens;
    }
}