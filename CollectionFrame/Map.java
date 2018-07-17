//map集合框架的使用和遍历；存储键和值
package CollectionFrame;

import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String, String> map = new HashMap<String,String>();
	map.put("1","hello");
	map.put("2", "world");
	map.put("3", "wangwei");
	//第一种-使用foreach,通过map.keySet()遍历key和value
	for (String key : map.keySet()) {
		System.out.println("一：key="+key+" and values="+map.get(key));
	}
    //第二种-使用构造器遍历,通过map.entrySet()遍历key和values；
	Iterator<Entry<String,String>> it =  map.entrySet().iterator();
	while(it.hasNext()) {
		Entry<String,String> entry=	it.next();
		System.out.println("二：key="+entry.getKey()+" and values="+entry.getValue());
	}
	//第三种,容量大的时候推荐使用
	for (Entry<String,String> en : map.entrySet()) {
		System.out.println("三：key="+en.getKey()+" and values="+en.getValue());
	}	
	//第四种,遍历所有的value,但不能遍历key
	for (String v : map.values()) {
		System.out.println("四：value="+v);
	
	
	}
	}

}
