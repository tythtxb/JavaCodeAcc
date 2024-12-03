package designpattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理
 * @author tanghuan
 * @date 2024年11月25日
 */
public class JdkProxy implements InvocationHandler {

    private Object target;

    public  JdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JdkProxy:before operation");
        Object result = method.invoke(target, args);
        System.out.println("JdkProxy:after operation");
        return result;
    }
}
