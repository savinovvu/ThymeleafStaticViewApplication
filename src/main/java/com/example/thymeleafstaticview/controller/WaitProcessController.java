package com.example.thymeleafstaticview.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class WaitProcessController {

    @GetMapping("/getErrors")
    public ResponseEntity getItems() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(HttpStatus.BAD_GATEWAY);
    }
}
