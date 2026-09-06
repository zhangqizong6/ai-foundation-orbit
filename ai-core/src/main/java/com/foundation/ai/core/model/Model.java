package com.foundation.ai.core.model;

import com.foundation.ai.core.metadata.Metadata;

/**
 * @ClassName: Model
 * @description: AI模型的基础抽象，定义模型的身份信息及附加元数据
 * @author: zhangqz
 * @date: 2026/9/6 19:18
 */
public interface Model {

    /**
     * 获取模型唯一标识
     *
     * @return 模型唯一标识
     */
    String getModelId();

    /**
     * 获取模型提供方
     *
     * @return 模型提供方
     */
    String getProvider();

    /**
     * 获取模型元数据
     *
     * @return 模型元数据
     */
    Metadata getMetadata();
}