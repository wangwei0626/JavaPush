//list集合下 ArrayList实现类的使用和遍历;有序可重复
package CollectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();
list.add("Hello");
list.add("World");
list.add("wangwei");
//第一种，方法foreach遍历list
for (String str : list) {
	System.out.println(str);
}
//第二种，把链表变为数组进行遍历
String[] strArray = new String[list.size()]; 
//toArray方法将集合转换为数组
list.toArray(strArray);
for (String string : strArray) {
	System.out.println(string);
}
//使用迭代器遍历list
Iterator<String> st = list.iterator();
while(st.hasNext()){
	System.out.println(st.next());
}
	}

}
