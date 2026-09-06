package com.foundation.ai.core.metadata;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Metadata
 * @description: AI领域对象的附加元数据，Metadata以键值对形式保存对象的附加信息
 * @author: zhangqz
 * @date: 2026/9/6 19:18
 */
public class Metadata {

    private final Map<String, Object> values;

    /**
     * 创建空Metadata
     */
    public Metadata() {
        this.values = new HashMap<>();
    }

    /**
     * 根据已有数据创建Metadata
     *
     * @param values 初始数据
     */
    public Metadata(Map<String, Object> values) {
        if (values == null) {
            throw new IllegalArgumentException("Metadata values must not be null");
        }

        this.values = new HashMap<>(values);
    }

    /**
     * 设置元数据
     *
     * @param key 元数据名称
     * @param value 元数据值
     */
    public void put(String key, Object value) {
        if (key == null) {
            throw new IllegalArgumentException("Metadata key must not be null");
        }

        values.put(key, value);
    }

    /**
     * 获取元数据
     *
     * @param key 元数据名称
     * @return 元数据值
     */
    public Object get(String key) {
        return values.get(key);
    }

    /**
     * 判断是否存在指定元数据
     *
     * @param key 元数据名称
     * @return 是否存在
     */
    public boolean contains(String key) {
        return values.containsKey(key);
    }

    /**
     * 删除元数据
     *
     * @param key 元数据名称
     * @return 被删除的值
     */
    public Object remove(String key) {
        return values.remove(key);
    }

    /**
     * 判断Metadata是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return values.isEmpty();
    }

    /**
     * 获取Metadata数量
     *
     * @return 元数据数量
     */
    public int size() {
        return values.size();
    }

    /**
     * 获取只读的元数据集合
     *
     * @return 只读Map
     */
    public Map<String, Object> asMap() {
        return Collections.unmodifiableMap(values);
    }
}