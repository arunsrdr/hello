package com.arun.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloController {
    @GetMapping("/api/v1/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("Hello Arun It worked", HttpStatus.ACCEPTED);
    }
}
