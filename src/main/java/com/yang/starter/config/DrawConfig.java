package com.yang.starter.config;

import com.yang.starter.properties.BaseDrawProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author yangchen
 * @version 1.0
 * @date 2023-07-31 14:45
 */
@Configuration
@EnableConfigurationProperties(BaseDrawProperties.class)
@ConditionalOnProperty(prefix = BaseDrawProperties.PREFIX, name = "enable", havingValue = "true", matchIfMissing = false)
public class DrawConfig {
}
