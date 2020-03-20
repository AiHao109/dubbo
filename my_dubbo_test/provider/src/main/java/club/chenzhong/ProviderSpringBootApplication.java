package club.chenzhong;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: my_dubbo_test
 * @description: provider springboot
 * @author: aihao
 * @create: 2020-03-19 11:34:29
 **/
@SpringBootApplication
@EnableDubbo
public class ProviderSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderSpringBootApplication.class, args);
    }
}
