package Demo5;

import Demo2.UserService;
import Demo2.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        invocationHandler.setTarget(userService);
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.update();
    }
}
