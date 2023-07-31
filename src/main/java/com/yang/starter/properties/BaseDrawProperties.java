package com.yang.starter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = BaseDrawProperties.PREFIX)
@Data
public class BaseDrawProperties {

    public static final String PREFIX = "com.draw";

    private String url;

}
