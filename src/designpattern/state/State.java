package designpattern.state;

/**
 * 抽象状态类
 * 
 * @author liu yuning
 *
 */
public abstract class State {
    public abstract void handle(Context context);

}

/**
 * 不同的状态做不同的事，并且控制状态流转
 */
class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
	System.out.println("现在是在状态A");
	context.setState(new ConcreteStateB());
    }

}

class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
	System.out.println("现在是在状态B");
	context.setState(new ConcreteStateC());

    }

}

class ConcreteStateC extends State {

    @Override
    public void handle(Context context) {
	System.out.println("现在是在状态C");
	context.setState(new ConcreteStateA());

    }

}
