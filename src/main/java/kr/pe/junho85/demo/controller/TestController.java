package kr.pe.junho85.demo.controller;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("hello")
    public Mono<String> hello(
            @Parameter(example = "junho85") @RequestParam String name) {
        return Mono.just("안녕하세요. " + name + "님!");
    }
}
