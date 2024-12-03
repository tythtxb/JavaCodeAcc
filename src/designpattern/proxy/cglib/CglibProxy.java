package designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理
 *
 * @author tanghuan
 * @date 2024年11月25日
 */
public class CglibProxy implements MethodInterceptor {
    private static Enhancer enhancer = new Enhancer();

    public Object createProxy(Class<?> clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CglibProxy:before operation");
        Object result = methodProxy.invokeSuper(obj, objects);
        System.out.println("CglibProxy:after operation");
        return result;
    }
}
