package com.fuzzychin.blog.Controllers;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}