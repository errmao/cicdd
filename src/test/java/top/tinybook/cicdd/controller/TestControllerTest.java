package top.tinybook.cicdd.controller;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.tinybook.cicdd.service.TestService;

import javax.annotation.Resource;

/**
 * @author you.jiu
 * @date 2020/9/28 10:03
 */
@SpringBootTest
class TestControllerTest {

    @Resource
    private TestService testService;

    @Test
    public void test1() {
        System.err.println(testService.test2());
    }
}