package cn.aegisa.rabbitdemo.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/12/20 12:10
 */
@SpringBootConfiguration
@Slf4j
public class DirectQueueConfig {

    @Bean
    public Queue testQueue() {
        return new Queue("testQueue");
    }

    @Bean
    public Queue aaa() {
        return new Queue("aaa");
    }
}
