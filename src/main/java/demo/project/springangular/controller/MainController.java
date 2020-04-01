package demo.project.springangular.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
//todo   Make main controller here!!!
    @GetMapping("/")
     public String hello(){
        return "hello";
     }
}

