//sleep方法的应用,sleep是Thread中的静态方法，可以使用类名.方法名进行调用
package Thread;

import java.util.Date;

public class SleepDemo {

	public static void main(String[] args) {
		Mythread2 thread = new Mythread2();
		//开辟新线程
		thread.start();
		try {
			//使用类名.方法名调用sleep方法，让主线程暂停10秒
			Mythread2.sleep(10000);
			System.out.println("主线程睡眠了10秒后启动了");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			thread.flag = false;
       
	}
	
}

class Mythread2  extends Thread{
	//控制循环条件
	boolean flag = true;
	public void run() {
		//run不能直接使用throws抛出异常，重写的方法不能抛出比被重写的方法还不同的异常
		while(flag) {
			System.out.println("=====" + new Date().toString() + "=====");
			try {
				//线程每隔一秒重新启动
				sleep(1000);
				//如果睡眠被打断会抛出InterruptedException异常
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
				//线程中断后返回，相当于结束线程
			}
		}
	}
	
}
