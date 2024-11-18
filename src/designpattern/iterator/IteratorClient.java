package designpattern.iterator;

import designpattern.interpreter.Context;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 迭代器客户端
 *
 * @author liu yuning
 */
public class IteratorClient {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ConcreteAggregate<String> bus = new ConcreteAggregate<String>();
        bus.setItems("大鸟");
        bus.setItems("小菜");
        bus.setItems("行李");
        bus.setItems("老外");
        bus.setItems("公交内部员工");
        bus.setItems("小偷");

        Iterator<String> iterator = new ConcreteIterator<String>(bus);

        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + "请买票！");
            iterator.next();
        }

        ArrayList<String> objects = new ArrayList<>();
        objects.add("大鸟");
        objects.add("小菜");
        objects.add("行李");
        objects.add("老外");
        objects.add("公交内部员工");
        objects.add("小偷");
        ListIterator<String> stringListIterator = objects.listIterator();

        int count = 1;
        while (stringListIterator.hasNext()) {
            if (count == 3) {
                stringListIterator.add("三三");
                stringListIterator.add("思思");
            }
            count++;
            String next = stringListIterator.next();
            System.out.println(next);
            stringListIterator.remove();

        }
        System.out.println(">>>>>>>>");
        stringListIterator = objects.listIterator();
        while (stringListIterator.hasNext()) {
            String next = stringListIterator.next();
            System.out.println(next);

        }

    }

}
