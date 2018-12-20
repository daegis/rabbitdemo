package cn.aegisa.rabbitdemo.controller;

import cn.aegisa.rabbitdemo.vo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/12/20 12:22
 */
@Controller
@Slf4j
public class TestController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/queue/{msg}")
    @ResponseBody
    public Object testQueue(@PathVariable String msg) {
        Person person = new Person();
        person.setName(msg);
        person.setAge(17);
        LocalDateTime now = LocalDateTime.now();
        person.setTime(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        rabbitTemplate.convertAndSend("bbb", person);
        return "ok";
    }
}
