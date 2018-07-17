/**节点流   字节流fileinputstream和字符流filereaderd的使用
 * 1.使用fileinputstream读取出来的中文内容有乱码，字节流中的read是一个字符一个字符的读取,而一个中文有两个字节，所以汉字无法正确显示
 * 2.使用filereader读取，read是一个字符一个字符的读取，可正常显示读取的中文汉字*/
package StreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//变量b装载read()方法返回的整数
		int b = 0;
		//FileInputStream in = null;
		FileReader in =null;
		//使用filereader会抛出异常，需要捕获
		try {
			//in = new FileInputStream("a.txt");
			in = new FileReader("a.txt");
		} catch (Exception e) {
			// TODO: handle exception
		   System.out.println("找不到此文件");
		}
		long num = 0;
		//read方法会抛出异常，需要捕获
	    try {
	    	//循环结束，会返回-1
			while((b = in.read()) != -1){
				//使用char装换，不然打印出来的就是数字
				System.out.println((char)b);
				num++;
			}
			//关闭输入流
			in.close();
			System.out.println("共输出了"+num + "个字符");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件读取错误");
		}

	}

}

