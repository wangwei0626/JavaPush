//set集合 HashSet实现类的使用和遍历；无序不可重复
package CollectionFrame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set = new HashSet<String>();
set.add("hello");
set.add("world");
set.add("wangwei");
//使用迭代器输出
Iterator<String> s = set.iterator();
while(s.hasNext()) {
	System.out.println(s.next());
}
//转换为数组输出
String[] str = new String[set.size()];
set.toArray(str);
for (String a : str) {
	System.out.println(a);
}
	}

}
	