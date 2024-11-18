package designpattern.visitor;

/**
 * 客户端
 * 
 * @author liu yuning
 *
 */
public class VisitorClient {

    public static void main(String[] args) {
	ObjectStructure o = new ObjectStructure();

	o.attach(new ConcreteElementA());
	o.attach(new ConcreteElementB());

	ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
	ConcreteVisitor2 visitor2 = new ConcreteVisitor2();

	//在不改变元素的结构前提下，由访问者去实现对各元素的不同操作，
	o.accept(visitor1);
	o.accept(visitor2);
    }
}
