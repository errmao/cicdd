package top.tinybook.cicdd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author you.jiu
 * @date 2020/9/21 9:39
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @GetMapping("action1")
    public String action1() {
        return new Date().toString();
    }

    @GetMapping("action2")
    public String action2() {
        return new Date().toString() + "=======d2222222";
    }
}
