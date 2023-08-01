package com.yang.starter.config;

import com.yang.starter.properties.BaseDrawProperties;
import com.yang.starter.service.DrawService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
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
@AllArgsConstructor
@Slf4j
public class DrawConfig {

    private BaseDrawProperties drawProperties;


    @Bean
    public DrawService drawService() {

        return new DrawService(drawProperties);
    }
}
