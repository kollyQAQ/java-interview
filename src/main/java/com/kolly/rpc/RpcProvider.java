package com.kolly.rpc;

/**
 * @Author kolly
 * @Date 2018/4/10
 * Modified Logs:
 * Created by kolly on 2018/4/10.
 */
public class RpcProvider {

    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }
}
