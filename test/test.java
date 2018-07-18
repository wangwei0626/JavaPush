//test递归调用
package test;

public class test {
	public static int method(int i) {
		if (i==1) {
			return 1;
		}else {
			return i*method(i-1);
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(method(5));
	}

}
