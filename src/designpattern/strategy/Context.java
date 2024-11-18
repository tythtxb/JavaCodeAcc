package designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 *
 * @author liu yuning
 */
public  class Context {
    private static Map<Integer, Strategy> strategyMap=new HashMap<>();

    static  {
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        ConcreteStrategyB concreteStrategyB = new ConcreteStrategyB();
        ConcreteStrategyC concreteStrategyC = new ConcreteStrategyC();
        strategyMap.put(concreteStrategyA.getType(), concreteStrategyA);
        strategyMap.put(concreteStrategyB.getType(), concreteStrategyB);
        strategyMap.put(concreteStrategyC.getType(), concreteStrategyB);
    }


    /**
     * 上下文接口
     */
    public static Strategy getStrategy(Integer type) {
        return strategyMap.get(type);
    }

}