package com.kolly.proxy.staticProxy;

/**
 * 代理类
 *
 * @Author kolly
 * @Date 2018/4/12.li
 * Modified Logs:
 * Created by kolly.li on 2018/4/12.
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userImpl;

    public UserServiceProxy(UserServiceImpl countImpl) {
        this.userImpl = countImpl;
    }

    public void addUser() {
        System.out.println("代理类方法，进行了增强。。。");
        System.out.println("事务开始。。。");
        // 调用委托类的方法;
        userImpl.addUser();
        System.out.println("处理结束。。。");
    }

    public void editUser() {
        System.out.println("代理类方法，进行了增强。。。");
        System.out.println("事务开始。。。");
        // 调用委托类的方法;
        userImpl.editUser();
        System.out.println("事务结束。。。");
    }

}
