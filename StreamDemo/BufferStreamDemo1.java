//处理流：BufferedInputStream字节流的使用
/**Demo演示mark和reset方法的使用，mark标记当前读取的位置;reset方法返回到当前位置，实现重复读取的功能*/
package StreamDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileInputStream fis = null;
	        try {
	            fis = new FileInputStream("test.java");
	            // 在FileInputStream节点流的外面套接一层处理流BufferedInputStream
	            BufferedInputStream bis = new BufferedInputStream(fis);
	            int c = 0;
	            System.out.println((char)bis.read());
	            bis.mark(100);// 在第100个字符处做一个标记
	            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
	                System.out.print((char)c);
	            }
	            System.out.println();
	            bis.reset();// 重新回到原来标记的地方
	            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
	                System.out.print((char)c);
	            }
	            bis.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (Exception e1) {
	            e1.printStackTrace();
	        }
	}

}
/**执行结果：
 * 
p
ackageStrea
ackageStrea
将第一个字符之后的11个字符读取了两遍
 * */
