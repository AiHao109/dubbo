package club.chenzhong;

import club.chenzhong.api.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: my_dubbo_test
 * @description: test consumer
 * @author: aihao
 * @create: 2020-03-18 16:43:34
 **/
public class Consumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        TestService bean = (TestService)context.getBean("testService");
        String s = bean.sayAndAnswer("你在哪？");
        System.out.println("reply: " + s);
        System.in.read();
    }

}
