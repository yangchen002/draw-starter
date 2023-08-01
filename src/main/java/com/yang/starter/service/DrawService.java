package com.yang.starter.service;

import com.yang.starter.properties.BaseDrawProperties;

/**
 * TODO
 *
 * @author yangchen
 * @version 1.0
 * @date 2023-07-31 17:56
 */
public class DrawService {

    private final BaseDrawProperties baseDrawProperties;

    public DrawService(BaseDrawProperties baseDrawProperties) {
        this.baseDrawProperties = baseDrawProperties;
    }

    public String getUrl() {
        return baseDrawProperties.getUrl();
    }
}
