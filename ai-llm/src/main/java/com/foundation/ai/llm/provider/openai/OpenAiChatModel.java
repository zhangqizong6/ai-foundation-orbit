package com.foundation.ai.llm.provider.openai;

import com.foundation.ai.core.message.Message;
import com.foundation.ai.core.message.MessageRole;
import com.foundation.ai.core.message.TextContent;
import com.foundation.ai.core.metadata.Metadata;
import com.foundation.ai.llm.chat.ChatModel;
import com.foundation.ai.llm.chat.ChatRequest;
import com.foundation.ai.llm.chat.ChatResponse;
import com.foundation.ai.llm.chat.ChatUsage;
import com.foundation.ai.llm.provider.openai.dto.OpenAiChatRequest;
import com.foundation.ai.llm.provider.openai.dto.OpenAiChatResponse;
import com.foundation.ai.llm.provider.openai.dto.OpenAiChoice;
import com.foundation.ai.llm.provider.openai.dto.OpenAiMessage;
import com.foundation.ai.llm.provider.openai.dto.OpenAiUsage;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: OpenAiChatModel
 * @description: OpenAI兼容聊天模型实现，将AI领域聊天请求转换为OpenAI兼容接口调用
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class OpenAiChatModel implements ChatModel {

    private final String modelId;

    private final OpenAiClient client;

    public OpenAiChatModel(String modelId, OpenAiClient client) {

        if (modelId == null || modelId.trim().isEmpty()) {
            throw new IllegalArgumentException("OpenAI modelId must not be empty");
        }

        if (client == null) {
            throw new IllegalArgumentException("OpenAiClient must not be null");
        }

        this.modelId = modelId;
        this.client = client;
    }

    @Override
    public ChatResponse chat(ChatRequest request) {

        OpenAiChatRequest openAiRequest = new OpenAiChatRequest();

        openAiRequest.setModel(modelId);

        List<OpenAiMessage> messages = new ArrayList<>();

        request.getContext()
                .getMessages()
                .forEach(message -> {
                    TextContent content = (TextContent) message.getContent();
                    messages.add(new OpenAiMessage(message.getRole()
                                    .name()
                                    .toLowerCase(),
                                    content.getText()
                            )
                    );
                });

        openAiRequest.setMessages(messages);

        if (request.getOptions().getTemperature() != null) {
            openAiRequest.setTemperature(request.getOptions().getTemperature());
        }

        if (request.getOptions().getMaxTokens() != null) {
            openAiRequest.setMaxTokens(request.getOptions().getMaxTokens());
        }

        OpenAiChatResponse response = client.chat(openAiRequest);

        return convertResponse(response);
    }

    private ChatResponse convertResponse(OpenAiChatResponse response) {

        if (response == null) {
            throw new IllegalStateException("OpenAI response must not be null");
        }

        if (response.getChoices() == null || response.getChoices().isEmpty()) {
            throw new IllegalStateException("OpenAI response does not contain choices");
        }

        OpenAiChoice choice = response.getChoices().get(0);

        if (choice.getMessage() == null) {
            throw new IllegalStateException("OpenAI response message must not be null");
        }

        OpenAiMessage responseMessage = choice.getMessage();

        Message message = new Message(MessageRole.ASSISTANT, new TextContent(responseMessage.getContent()));

        OpenAiUsage usage = response.getUsage();

        ChatUsage chatUsage = new ChatUsage(
                usage == null ? null : usage.getPromptTokens(),
                usage == null ? null : usage.getCompletionTokens(),
                usage == null ? null : usage.getTotalTokens()
        );

        Metadata metadata = new Metadata();

        if (response.getId() != null) {
            metadata.put("responseId", response.getId());
        }

        return new ChatResponse(message, modelId, chatUsage, metadata);
    }

    @Override
    public String getModelId() {
        return modelId;
    }

    @Override
    public String getProvider() {
        return "openai";
    }

    @Override
    public Metadata getMetadata() {
        return new Metadata();
    }
}