package cn.aegisa.rabbitdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/12/20 14:04
 */
@Controller
@Slf4j
public class WebController {

    @RequestMapping("/build")
    @ResponseBody
    public Object testBuild() {
        Map<String, Object> map = new HashMap<>();
        map.put("time", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        map.put("version", "111111");
        return map;
    }
}
