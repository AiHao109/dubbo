package club.chenzhong;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: my_dubbo_test
 * @description: main provider
 * @author: aihao
 * @create: 2020-03-18 15:24:20
 **/
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }
}
