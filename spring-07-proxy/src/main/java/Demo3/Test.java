package Demo3;

import Demo2.UserService;
import Demo2.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        //设置要代理的对象
        invocationHandler.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.query();

    }
}
