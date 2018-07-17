//处理流： ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含反序列化和序列化对象的方法。

//Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型。

//将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。

//整个过程都是 Java 虚拟机（JVM）独立的，也就是说，在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象。
package SerializeDemo;

import java.io.*;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//创建对象
Employee e = new Employee();
Employee f = null;
e.name="wangwei";
e.address="beijing";
e.SSN=110;
e.number=10086;
//捕获异常
try {
//创建文件输出流
FileOutputStream fileout = new FileOutputStream("object.ser");
//创建ObjectOutputStream对象
ObjectOutputStream out = new ObjectOutputStream(fileout);
//将对象序列化
out.writeObject(e);
out.close();
//关闭输出流
fileout.close();
} catch (Exception e2) {
	// TODO: handle exception
}
//反序列化
try {
	//创建文件输入流
	FileInputStream filein = new FileInputStream("object.ser");
	//创建ObjectInputStream对象
	ObjectInputStream in = new ObjectInputStream(filein);
	//将对象in反序列化
	f = (Employee) in.readObject();
	in.close();
	filein.close();
} catch (ClassNotFoundException e2) {
	e2.printStackTrace();
}catch(IOException i) {
	i.printStackTrace();
}
//输出结果
System.out.println(f.SSN);
System.out.println(f.name);
System.out.println(f.address);
System.out.println(f.number);
}

}
