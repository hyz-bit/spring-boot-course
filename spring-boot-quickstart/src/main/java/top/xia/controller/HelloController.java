package top.xia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {return "hello world";}

    @GetMapping("/list")
    public List<String> getList() {
        return List.of("aaa","bbb", "ccc");
    }
}