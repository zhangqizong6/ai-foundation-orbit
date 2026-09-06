package com.foundation.ai.llm.provider.openai;

import com.foundation.ai.llm.chat.ChatModel;
import com.foundation.ai.llm.registry.ChatModelRegistry;
import com.foundation.ai.llm.registry.DefaultChatModelRegistry;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: OpenAiAutoConfiguration
 * @description: OpenAI兼容模型自动配置，负责组装模型服务及聊天模型注册中心
 * @author: zhangqz
 * @date: 2026/9/6
 */
@Configuration
@EnableConfigurationProperties(OpenAiProperties.class)
public class OpenAiAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public RestTemplate openAiRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    @ConditionalOnMissingBean
    public OpenAiClient openAiClient(RestTemplate restTemplate, OpenAiProperties properties) {
        return new OpenAiClient(restTemplate, properties);
    }

    @Bean
    @ConditionalOnMissingBean(ChatModelRegistry.class)
    public ChatModelRegistry chatModelRegistry(OpenAiProperties properties, OpenAiClient client) {

        List<ChatModel> models = new ArrayList<>();

        if (properties.getModels() != null) {

            for (OpenAiProperties.ModelProperties modelProperties : properties.getModels()) {

                if (modelProperties == null) {
                    continue;
                }

                String modelId = modelProperties.getModelId();

                if (modelId == null || modelId.trim().isEmpty()) {
                    continue;
                }

                models.add(new OpenAiChatModel(modelId, client)
                );
            }
        }

        return new DefaultChatModelRegistry(models);
    }
}