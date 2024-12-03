package designpattern.proxy.cglib;

import designpattern.proxy.RealSubject;

/**
 * @author tanghuan
 * @date 2024年11月25日
 */
public class CglibProxyClient {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        RealSubject proxy = (RealSubject)new CglibProxy().createProxy(realSubject.getClass());
        proxy.request();
    }
}
