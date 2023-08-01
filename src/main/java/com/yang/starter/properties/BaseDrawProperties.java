package com.yang.starter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = BaseDrawProperties.PREFIX)
@Data
@Validated
public class BaseDrawProperties {

    public static final String PREFIX = "com.draw";

    private boolean enable = false;
    private String url;

}
