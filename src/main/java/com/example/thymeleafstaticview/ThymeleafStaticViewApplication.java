package com.example.thymeleafstaticview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
@Controller
public class ThymeleafStaticViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafStaticViewApplication.class, args);
    }

    @GetMapping("/")
    public String getThymeleafPage() {
        return "thymeleaftemplate";
    }

    @GetMapping("/{anyUrl}")
    public ResponseEntity getStaticPage() {
        ClassPathResource classPathResource = new ClassPathResource("static/index.html");
        return ResponseEntity.ok(classPathResource);
    }
}
