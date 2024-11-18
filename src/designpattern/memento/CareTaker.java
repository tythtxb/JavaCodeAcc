package designpattern.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 管理者（CareTaker）类：管理备忘录
 * 
 * @author liu yuning
 *
 */
public class CareTaker {

    private Stack<Memento> memento=new Stack<>();

    public Stack<Memento> getMemento() {
	return memento;
    }

    public void setMemento(Memento memento) {
	this.memento.push(memento) ;
    }

}
