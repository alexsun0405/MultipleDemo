package com.multiple.test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ludi on 16/12/22.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }
}
