package club.chenzhong.service.impl;


import club.chenzhong.api.service.TestService;

/**
 * @program: my_dubbo_test
 * @description: test service impl
 * @author: aihao
 * @create: 2020-03-18 14:03:08
 **/
public class TestServiceImpl implements TestService {

    @Override
    public String sayAndAnswer(String message) {
        System.out.println(message);
        return "你的回答:" + message + " !!!";
    }
}
