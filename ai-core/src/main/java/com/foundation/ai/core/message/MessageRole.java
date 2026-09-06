package com.foundation.ai.core.message;

/**
 * @ClassName: MessageRole
 * @description: AI消息角色，定义消息在AI交互过程中的角色类型
 * @author: zhangqz
 * @date: 2026/9/6 19:18
 */
public enum MessageRole {
    /**
     * 系统消息
     */
    SYSTEM,

    /**
     * 用户消息
     */
    USER,

    /**
     * AI助手消息
     */
    ASSISTANT,

    /**
     * 工具消息
     */
    TOOL
}