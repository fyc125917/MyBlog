package com.ryan.daily.delayQueue.redis;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisKeyExpiredEvent;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName RedisConfiguration
 * @Description
 * Redis实现的延迟队列：
 *      此种方式，对Redis配置的过期数据的清除方式有关
 *          惰性删除  过期后，等下次获取该条数据时，进行删除操作
 *          定时删除  固定时间间隔，去删除过期的key值
 *      1、也就是说，key的过期事件，RedisKeyExpiredEvent 并不是等过期时间一到就会发布。而是在当前key被删除时触发。
 *      2、Redis的发布订阅模式，不像其他MQ工具，有消息持久化动作。容易造成消息的丢失。
 *          比如，在消费者重启过程中，有生产者向channel中推入数据，此时，就会导致该条消息丢失
 *      3、redis的消息模型，只有广播模式。多个消费者订阅同一通道时，同一条消息会进行多次消费。此处还需要避免【消息重复消费】的问题
 *          重复消费的问题，可以给【消息】本身添加标志等方式进行区分实现
 * 更好的使用redis实现延时队列的方案，可以依靠 redisson 进行实现
 *
 * @Author fengyc
 * @Date 2023/6/2
 * @Version 1.0
 **/
@Configuration
public class RedisConfiguration {

    @Bean
    public RedisMessageListenerContainer redisMessageListenerContainer(RedisConnectionFactory factory) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(factory);
        return container;
    }

//    keyExpirationEventMessageListener 对象 会自动监听  __keyevent@*__:expired 动作。当有相关消息过期时，会发布 RedisKeyExpiredEvent 事件，
    // 所以需要对该事件进行实现，并实现自己的处理逻辑。达到延时队列的效果
    @Bean
    public KeyExpirationEventMessageListener keyExpirationEventMessageListener(RedisMessageListenerContainer container) {
        KeyExpirationEventMessageListener listener = new KeyExpirationEventMessageListener(container);
        return listener;
    }

}

@Component
class MyRedisKeyExpiredListener implements ApplicationListener<RedisKeyExpiredEvent> {

    @Override
    public void onApplicationEvent(RedisKeyExpiredEvent redisKeyExpiredEvent) {
        String keyspace = redisKeyExpiredEvent.getKeyspace();
        byte[] id = redisKeyExpiredEvent.getId();
        Object value = redisKeyExpiredEvent.getValue();
        byte[] source = redisKeyExpiredEvent.getSource();
        try {
            //redis中过期的 value
            String redisValue = new String(source, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //TODD  此处获取redis过期的key，并进行下一步操作
    }

}
