package club.chenzhong;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: my_dubbo_test
 * @description: consumer springboot application
 * @author: aihao
 * @create: 2020-03-19 15:02:55
 **/
@EnableDubbo
@SpringBootApplication
public class ConsumerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringBootApplication.class, args);
    }

}
