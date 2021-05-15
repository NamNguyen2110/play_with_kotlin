package com.audio.book.config

import lombok.Getter
import lombok.Setter
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "book")
@Getter
@Setter
class ConfigurationProperties {

}