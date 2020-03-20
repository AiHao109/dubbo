package club.chenzhong.web.controller;

import club.chenzhong.api.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: my_dubbo_test
 * @description: test consumer controller
 * @author: aihao
 * @create: 2020-03-19 15:27:35
 **/
@Controller
public class TestController {

    @Reference(version = "*", loadbalance = "random")
    TestService testService;


    @ResponseBody
    @RequestMapping("/testRpc")
    public String testRpc(@RequestParam("par") String par){
        String answer = testService.sayAndAnswer(par);
        return "reply=" + answer;
    }

}
