package com.foundation.ai.llm.provider.openai.dto;

/**
 * @ClassName: OpenAiChoice
 * @description: OpenAI兼容聊天接口响应选项
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class OpenAiChoice {

    private Integer index;

    private OpenAiMessage message;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public OpenAiMessage getMessage() {
        return message;
    }

    public void setMessage(OpenAiMessage message) {
        this.message = message;
    }
}