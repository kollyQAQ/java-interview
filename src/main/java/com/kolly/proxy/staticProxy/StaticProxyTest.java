package com.kolly.proxy.staticProxy;

/**
 * @Author kolly
 * @Date 2018/4/12.li
 * Modified Logs:
 * Created by kolly.li on 2018/4/12.
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        UserServiceImpl userImpl = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userImpl);
        proxy.addUser();
        System.out.println("----------分割线----------");
        proxy.editUser();
    }

}
