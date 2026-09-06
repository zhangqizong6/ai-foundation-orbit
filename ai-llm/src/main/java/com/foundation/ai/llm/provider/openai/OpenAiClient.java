package com.foundation.ai.llm.provider.openai;

import com.foundation.ai.llm.provider.openai.dto.OpenAiChatRequest;
import com.foundation.ai.llm.provider.openai.dto.OpenAiChatResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OpenAiClient
 * @description: OpenAI兼容接口HTTP客户端，负责与外部模型服务进行通信
 * @author: zhangqz
 * @date: 2026/9/6
 */
public class OpenAiClient {

    private final RestTemplate restTemplate;

    private final OpenAiProperties properties;

    public OpenAiClient(RestTemplate restTemplate, OpenAiProperties properties) {

        if (restTemplate == null) {
            throw new IllegalArgumentException(
                    "RestTemplate must not be null"
            );
        }

        if (properties == null) {
            throw new IllegalArgumentException(
                    "OpenAiProperties must not be null"
            );
        }

        this.restTemplate = restTemplate;
        this.properties = properties;
    }

    public OpenAiChatResponse chat(OpenAiChatRequest request) {

        String url = buildChatUrl();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(properties.getApiKey());
        HttpEntity<OpenAiChatRequest> entity = new HttpEntity<>(request, headers);
        return restTemplate.postForObject(url, entity, OpenAiChatResponse.class);
    }

    private String buildChatUrl() {
        String baseUrl = properties.getBaseUrl();

        if (baseUrl.endsWith("/")) {
            return baseUrl + "chat/completions";
        }

        return baseUrl + "/chat/completions";
    }
}