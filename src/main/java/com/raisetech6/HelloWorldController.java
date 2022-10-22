package com.raisetech6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        String message = "hello world!";
        return message;
    }
    @GetMapping("/time")
    public Map<String, String> time() {

        Map<String, String> replyMap = new HashMap<String, String>();
        replyMap.put("Greeting", "Hello World!!!");

        LocalDateTime nowDate = LocalDateTime.now();
        String formatNowDate = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒 E曜日").format(nowDate);
        replyMap.put("Time", formatNowDate);

        return replyMap;
    }

}
