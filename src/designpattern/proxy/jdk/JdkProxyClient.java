package designpattern.proxy.jdk;

import designpattern.proxy.RealSubject;
import designpattern.proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * @author tanghuan
 * @date 2024年11月25日
 */
public class JdkProxyClient {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        JdkProxy jdkProxy = new JdkProxy(realSubject);
        Subject subject = (Subject)Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), new Class[]{Subject.class}, jdkProxy);
        subject.request();
    }
}
