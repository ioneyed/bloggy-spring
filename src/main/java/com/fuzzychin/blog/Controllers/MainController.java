package com.fuzzychin.blog.Controllers;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class MainController {

    //Index is the global base entry point on the web, Entirely preferential.
    @RequestMapping("/")
    //RestController automatically adds @ResponseBody
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
