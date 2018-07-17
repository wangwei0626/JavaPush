/**
 *线程的最大优先级为10，最小优先级为1，默认优先级为5
 *通过getPriority()和setPriority方法获取和得到优先级*/
package Thread;

public class PriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread4 B1 =new Mythread4();
		Mythread5 B2 =new Mythread5();
		Thread t1 = new Thread(B1);
		Thread t2 = new Thread(B2);
		//设置优先级
		t2.setPriority(Thread.NORM_PRIORITY - 4);
		t1.setPriority(Thread.NORM_PRIORITY + 5);
		t1.start();
		t2.start();
		System.out.println("t1线程优先级是：" + t1.getPriority());
		System.out.println("t2线程优先级是：" + t2.getPriority());
	}

}

class Mythread4 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("t1:"+ i);
		}
	}
}

class Mythread5 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("====t2:"+ i);
		}
	}
}
