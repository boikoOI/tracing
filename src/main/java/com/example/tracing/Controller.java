package com.example.tracing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @RequestMapping("/test")
    public String test() {
        log.info("test");
        return "test";
    }

    @RequestMapping("/ping")
    public String ping() {
        log.info("pong");
        return "pong";
    }

    @RequestMapping("/hello")
    public String hello() {
        log.info("hello");
        return "hello";
    }
}
