//处理流：PrintStream字符流的使用，重新设置打印输出的窗口，指定为其他的打印显示窗口
package StreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class PrintStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		try {
			FileOutputStream fs = new FileOutputStream("d.txt");
			//嵌套一层处理流，用来控制打印输出
			ps  =  new PrintStream(fs);
			if(ps != null) {
				System.setOut(ps);//调用setout方法改变了输出窗口，指定为ps指定的文件里，相当于log文件
			}
			for(char c=0;c<=60000;c++) {
				System.out.println(c+"\t");//把世界各国的文字打印到log.txt这个文件中去
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
