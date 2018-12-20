package cn.aegisa.rabbitdemo.listener;

import cn.aegisa.rabbitdemo.vo.Person;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/12/20 12:20
 */
@Component
@Slf4j
public class TestQueueListener {

    @RabbitListener(queues = "aaa")
    public void testQueueListener(Person person) {
        log.info("消费端收到消息：{}", JSON.toJSONString(person));
        log.info("当前时间：{}", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
