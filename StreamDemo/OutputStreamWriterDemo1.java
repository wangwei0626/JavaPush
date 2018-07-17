//处理流：OutputStreamWriter/InputStreamWriter：可将流从字节流转换为字符流，指定字符编码。
/**
 * 将字符数据写入文件，读取文件
 * 1首先使用节点流对象读取文件
 * 2使用处理流来转换将流从字节流转换为字符流，并制定字符编码
 * 3
 * */
package StreamDemo;

import java.io.*;

public class OutputStreamWriterDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//创建文件对象，将字符流写入到文件里
File f = new File("a.txt");	
//构建FileOutputStream节点流对象，文件不存在会自动创建
FileOutputStream fop = new FileOutputStream(f);
//构建OutputStreamWriter处理流对象,参数可以指定编码
OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
//写入到缓存区
writer.append("中文输入");
//换行
writer.append("\r\n");
//写入到缓存区
writer.append("English");
//关闭写入流,同时会将缓存区内容写入到文件里
//writer.close();不关闭时也可以将字符流的内容全部输出，则可以使用Writer类中的flush()方法完成
writer.flush();
//关闭输出流，释放系统资源
fop.close();

//读取文件中的字符，输出到控制台
FileInputStream fip = new FileInputStream(f);
//构建InputStreamWriter对象,参数可以指定编码
InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
StringBuffer str = new StringBuffer();
while(reader.ready()) {
	//将char加到stringbuffer中
	str.append((char)reader.read());
}
System.out.println(str.toString());
//关闭读取流
reader.close();
//关闭输入流,释放系统资源
fip.close();
}
}

