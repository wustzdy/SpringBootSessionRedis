package com.wustzdy.springboot.ression.redis.second.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * session托管到redis
 */
@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 3600 * 24, redisFlushMode = RedisFlushMode.ON_SAVE, redisNamespace = "aurora-web")
@EnableRedisHttpSession
public class RedisSessionConfig {
    @Bean
    public JedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }
}

