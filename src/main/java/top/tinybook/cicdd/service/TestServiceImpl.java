package top.tinybook.cicdd.service;

import org.springframework.stereotype.Service;

/**
 * @author you.jiu
 * @date 2020/9/28 9:56
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String rest1() {
        return "test1";
    }

    @Override
    public String test2() {
        return "test2";
    }
}

