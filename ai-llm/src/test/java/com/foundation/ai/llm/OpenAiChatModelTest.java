package com.foundation.ai.llm;

import com.foundation.ai.core.context.Context;
import com.foundation.ai.core.message.Message;
import com.foundation.ai.core.message.MessageRole;
import com.foundation.ai.core.message.TextContent;
import com.foundation.ai.core.metadata.Metadata;
import com.foundation.ai.llm.chat.ChatOptions;
import com.foundation.ai.llm.chat.ChatRequest;
import com.foundation.ai.llm.chat.ChatResponse;
import com.foundation.ai.llm.client.ChatClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @ClassName: OpenAiChatModelTest
 * @description: OpenAI兼容聊天模型集成测试
 * @author: zhangqz
 * @date: 2026/9/6
 */
@SpringBootTest(classes = AiLlmTestApplication.class)
@EnabledIfSystemProperty(named = "orbit.live-tests", matches = "true")
public class OpenAiChatModelTest {

    @Autowired
    private ChatClient chatClient;

    @Test
    public void testChat() {
        Context context = new Context();
        context.addMessage(new Message(MessageRole.SYSTEM, new TextContent("你是一个简洁、准确的AI助手")));
        context.addMessage(new Message(MessageRole.USER, new TextContent("你好，请简单介绍一下你自己")));
        ChatRequest request = new ChatRequest(
                "Qwen/Qwen3-8B",
                context,
                new ChatOptions(0.7, 1024),
                new Metadata()
        );
        ChatResponse response = chatClient.chat(request);
        assertNotNull(response);
        assertNotNull(response.getMessage());
        assertNotNull(response.getMessage().getContent());
        System.out.println("模型：" + response.getModelId());
        System.out.println("回答：" + ((TextContent) response.getMessage().getContent()).getText());
        System.out.println("总Token：" + response.getUsage().getTotalTokens());
        assertFalse(((TextContent) response.getMessage()
                .getContent())
                .getText()
                .trim()
                .isEmpty()
        );
    }
}
