package club.chenzhong.api.service;

/**
 * @program: my_dubbo_test
 * @description: dubbo api 测试服务接口
 * @author: aihao
 * @create: 2020-03-18 11:32:04
 **/
public interface TestService {

    /**
     * 接受消息并回答
     * @param message 消息
     * @return 回答
     */
    String sayAndAnswer(String message);
}
