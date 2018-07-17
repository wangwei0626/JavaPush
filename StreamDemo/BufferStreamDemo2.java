//处理流：BufferedWriter和BufferedReader字符流的使用，和newLine,readLine方法的使用
/**缓冲区(Buffer)就是内存里面的一小块区域，读写数据时都是先把数据放到这块缓冲区域里面，减少io对硬盘的访问次数，提高读取效率，保护我们的硬盘*/
package StreamDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
			String s = null;
			for (int i = 0; i < 100; i++) {
				//生成0-1之间的随机数
				//String.valueof将double类型转换为字符串 
				s = String.valueOf(Math.random());
				//写入
				bw.write(s);
				//每写入一个随机数便换行显示
				bw.newLine();
			}
			//清空缓冲区，将缓冲区的内容输出到文件里
			bw.flush();
			BufferedReader br = new BufferedReader(new FileReader("b.txt"));
			while((s = br.readLine()) != null) {
				//readLine一行一行的读取数据，返回空值则读取到了文件的末尾
				System.out.println(s);
			}
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件未找到");
		}
		
		
	}

}
