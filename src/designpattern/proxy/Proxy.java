package designpattern.proxy;

/**
 * 代理类
 * 
 * @author liu yuning
 *
 */
public class Proxy implements Subject {

    // 保存一个引用，使得代理可以访问真实实体
    Subject subject;

    public Proxy(Subject realSubject) {
	subject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("Proxy:before operation");
        subject.request();
        System.out.println("Proxy:after operation");
    }

}
