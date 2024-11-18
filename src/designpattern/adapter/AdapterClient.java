package designpattern.adapter;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 适配器客户端
 * 
 * @author liu yuning
 *
 */
public class AdapterClient {

    public static void main(String[] args) {
		//字节流转字符流
	new ByteInputStream();
	new InputStreamReader(new ByteInputStream());
	new OutputStreamWriter(new ByteOutputStream());
	Target target;

	target = new Adapter();
	target.request();
    }
}
