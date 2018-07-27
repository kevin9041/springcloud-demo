package com.misrobot.springcloud.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    private CachingConnectionFactory rabbitConnectionFactory;

    @Value("${spring.rabbitmq.host}")
    private String host;
    @Value("${spring.rabbitmq.port}")
    private String port;
    @Value("${spring.rabbitmq.username}")
    private String username;
    @Value("${spring.rabbitmq.password}")
    private String password;

    @Bean
    public Queue testQueue() {
        return new Queue("test");
    }

    @Bean
    public RabbitTemplate rabbitTemplateid() {
        initRabbitConnectionFactory();
        return new RabbitTemplate(rabbitConnectionFactory);
    }

    /**
     * 初始化rabbitmq连接
     */
    private void initRabbitConnectionFactory() {
        rabbitConnectionFactory = new CachingConnectionFactory();
        rabbitConnectionFactory.setHost(host);
        //rabbitConnectionFactory.setChannelCacheSize(config.getEventMsgProcessNum());
        rabbitConnectionFactory.setPort(Integer.valueOf(port));
        rabbitConnectionFactory.setUsername(username);
        rabbitConnectionFactory.setPassword(password);
    }
}