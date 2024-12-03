package designpattern.adapter;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 适配器模式用于将不兼容的接口适配到客户端所需要的接口。
 *
 * @author liu yuning
 */
public class AdapterClient {

    public static void main(String[] args) {
        //字节流转字符流
        new ByteInputStream();
        new InputStreamReader(new ByteInputStream());
        new OutputStreamWriter(new ByteOutputStream());
        Target target;
        Adaptee adaptee = new Adaptee();
        target = new Adapter(adaptee);
        target.request();
    }
}
