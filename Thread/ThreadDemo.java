//继承Thread类实现多线程，实质Thread也是实现的Runnable接口
package Thread;

import java.util.Iterator;

public class ThreadDemo extends Thread {
    private String name;
    private int count=50;
	public ThreadDemo(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0;i < 5;i++) {
			try {
				//线程的休眠，每间隔2秒钟执行一次线程
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println(name + "运行" + i + "\n" + this.count--);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建线程对象
		ThreadDemo T1 = new ThreadDemo("test1");
		ThreadDemo T2 = new ThreadDemo("test2");
		//执行start方法，获取CPU资源之后会自动 执行run方法。
		T1.start();
		T2.start();
	}

}
