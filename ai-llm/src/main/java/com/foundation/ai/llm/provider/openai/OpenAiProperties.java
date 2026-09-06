package com.foundation.ai.llm.provider.openai;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: OpenAiProperties
 * @description: OpenAI兼容模型服务配置
 * @author: zhangqz
 * @date: 2026/9/6
 */
@ConfigurationProperties(prefix = "ai.llm.openai")
public class OpenAiProperties {

    /**
     * OpenAI兼容接口基础地址
     */
    private String baseUrl;

    /**
     * API密钥
     */
    private String apiKey;

    /**
     * 配置的聊天模型
     */
    private List<ModelProperties> models = new ArrayList<>();

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public List<ModelProperties> getModels() {
        return models;
    }

    public void setModels(List<ModelProperties> models) {
        this.models = models;
    }

    public static class ModelProperties {

        private String modelId;

        public String getModelId() {
            return modelId;
        }

        public void setModelId(String modelId) {
            this.modelId = modelId;
        }
    }
}