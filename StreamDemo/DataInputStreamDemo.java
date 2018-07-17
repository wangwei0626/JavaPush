//处理流：DataOutputStream和DataInputStream 字节流，首先需要创建字节数组节点流去嵌套；用来存取java基本数据类型的数据
package StreamDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//首先创建一个字节数组节点流
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		//嵌套data数据处理流，来用处理基本类型的数据
		DataOutputStream dos = new DataOutputStream(bs);
		try {
			//写入
			dos.writeDouble(Math.random());//float占8个字节，boolean占1个字节
			dos.writeBoolean(true);
			ByteArrayInputStream bis = new ByteArrayInputStream(bs.toByteArray());
			//查看流中有多少个字节
			System.out.println(bis.available());
			//读取
			DataInputStream dis = new DataInputStream(bis);
			System.out.println(dis.readDouble());//先写进去先读出来
			System.out.println(dis.readBoolean());//后写进去后读出来，顺序不能改变，否则会打印错误的结果
			dos.close();
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
