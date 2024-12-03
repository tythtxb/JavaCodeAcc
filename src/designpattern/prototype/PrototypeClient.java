package designpattern.prototype;

import java.io.IOException;

/**
 * 原型模式客户端 演示深度拷贝和浅度拷贝
 *
 * @author liu yuning
 * @Todo 考虑优化此处的重复代码
 */
public class PrototypeClient {
    public static void shallowCopy() throws CloneNotSupportedException {
        Resume aResume = new Resume();
        aResume.setName("大鸟 ").setGender("男 ").setAge(25);
        aResume.setWorkExperience("1999-2002, ", "XX公司");

        Resume bResume = (Resume) aResume.clone();
        bResume.setName("黑鸟 ").setGender("女 ").setAge(27);

        bResume.setWorkExperience("1999-2002, ", "YY公司");

        Resume cResume = (Resume) aResume.clone();
        cResume.setName("火鸟 ").setGender("女 ").setAge(28);
        cResume.setWorkExperience("1999-2002, ", "ZZ公司");

        System.out.println(">>>>>>浅度拷贝:");
        aResume.display();
        bResume.display();
        cResume.display();
    }

    public static void deepCopy() throws CloneNotSupportedException,
            ClassNotFoundException, IOException {
        Resume aResume = new Resume();
        aResume.setName("大鸟 ").setGender("男 ").setAge(25);
        aResume.setWorkExperience("1999-2002, ", "XX公司");

        Resume bResume = (Resume) aResume.deepClone();
        bResume.setName("黑鸟 ").setGender("女 ").setAge(27);
        bResume.setWorkExperience("1999-2002, ", "YY公司");

        Resume cResume = (Resume) aResume.deepClone();
        cResume.setName("火鸟 ").setGender("女 ").setAge(28);
        cResume.setWorkExperience("1999-2002, ", "ZZ公司");

        System.out.println(">>>>>>深度拷贝:");
        aResume.display();
        bResume.display();
        cResume.display();

    }

    public static void main(String[] args) throws CloneNotSupportedException,
            ClassNotFoundException, IOException {

        // 浅度拷贝
        shallowCopy();

        System.out.println("==================================");

        // 深度拷贝
        deepCopy();

    }

}
