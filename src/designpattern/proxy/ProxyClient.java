package designpattern.proxy;

/**
 * 代理客户端
 *
 * @author liu yuning
 */
public class ProxyClient {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
