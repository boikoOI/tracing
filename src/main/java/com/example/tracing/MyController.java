package com.example.tracing;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final Counter myCounter;

    public MyController(MeterRegistry registry) {
        myCounter = Counter.builder("my.counter")
                .description("Counts requests to /increment path")
                .register(registry);
    }

    @GetMapping("/increment")
    public void incrementCounter() {
        myCounter.increment();
    }
}
