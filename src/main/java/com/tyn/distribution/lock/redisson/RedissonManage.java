package com.tyn.distribution.lock.redisson;


import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class RedissonManage {
    private static final String REDIS_SERVER = "redis://120.27.228.21:6379";
    private static final String REDIS_PASSWORD = "woaiwojia";

    @Bean
    public RedissonClient initRedisson() {
        Config config = new Config();
        config.useSingleServer().setAddress(REDIS_SERVER).setPassword(REDIS_PASSWORD);
        RedissonClient redisson = Redisson.create(config);
        return redisson;
    }

}
