package designpattern.flyweight;

/**
 * 所有具体享元类的超类，接受并作用于外部状态
 * 
 * @author liu yuning
 *
 */
public abstract class FlyWeight {
    protected String name;
    public abstract void operation(int extrinsicState);

}

class ConcreteFlyWeight extends FlyWeight {

    public ConcreteFlyWeight(String name){
        System.out.println("初始化"+name);
        super.name=name;
    }
    @Override
    public void operation(int extrinsicState) {
	System.out.println(name+"具体FlyWeight：" + extrinsicState);
    }

}

class UnsharedConcreteFlyWeight extends FlyWeight {

    public UnsharedConcreteFlyWeight(String name){
        System.out.println("初始化"+name);
        super.name=name;
    }
    @Override
    public void operation(int extrinsicState) {
	System.out.println(name+"不共享的具体FlyWeight：" + extrinsicState);
    }

}