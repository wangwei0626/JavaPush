//处理流：BufferedReader字符流读取字符或字符串，控制标准输出
package StreamDemo;
import java.io.*;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		String str;
//使用BufferedReader创建字符流,system.in这里的in是一个标准输入流，用来获取从键盘输入的数据
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//使用read读取字符
System.out.println("输入字符，按‘q’键退出");
do {
	c = (char)br.read();//read读入单个字符
	System.out.println(c);
} while (c !='q');
//使用readline读取字符串
System.out.println("Enter lines of text.");
System.out.println("Enter 'end' to quit.");
do {
	str = br.readLine();
	System.out.println(str);
}while(!str.equals("end"));
	}

}

/**使用BufferedReader创建字符流,read和readline分别读取字符和字符串*/
