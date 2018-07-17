//处理流：outputstreamwriter字符流，可以将字节流转换为字符流，并指定字符编码；以字符串的方式写入，提高写入速度，减少了对磁盘的访问
package StreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("c.txt"));
			//写入
			ow.write("MircosoftsunIBMOracleApplet");
			//获取字符编码
			System.out.println(ow.getEncoding());
			ow.close();
			//没有true，新的字符串会替换掉旧的字符串
			ow = new OutputStreamWriter(new FileOutputStream("c.txt",true),"ISO8859_1");
			ow.write("MircosoftsunIBMOracleApplet");//此时字符串会加到原来字符串的后面
			System.out.println(ow.getEncoding());
			ow.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
