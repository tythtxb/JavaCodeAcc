package designpattern.flyweight;

/**
 * 客户端
 *
 * @author liu yuning
 */
public class FlyWeightClient {
    public static void main(String[] args) {
        int extrinsicState = 22;

        FlyWeightFactory f = new FlyWeightFactory();

        FlyWeight fx = f.getFlyWeight("X");
        fx.operation(--extrinsicState);

        FlyWeight fy = f.getFlyWeight("Y");
        fy.operation(--extrinsicState);

        FlyWeight fy1 = f.getFlyWeight("Y");
        fy1.operation(--extrinsicState);//我们采用享元模式获取同类型对象只初始化一次

        FlyWeight fz = f.getFlyWeight("Z");
        fz.operation(--extrinsicState);

        FlyWeight uf = new UnsharedConcreteFlyWeight("A");
        uf.operation(--extrinsicState);

        FlyWeight uf1 = new UnsharedConcreteFlyWeight("A");
        uf1.operation(--extrinsicState);

    }

}
