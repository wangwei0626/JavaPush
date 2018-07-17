// synchronized修饰对象时，表明该对象在任意时刻只能由一个线程访问,也可以用来修饰方法
package Thread;

public class Synchronized implements Runnable {
    
	Timer time = new Timer();
	public static void main(String[] args) {
		Synchronized sz = new Synchronized();
		Thread t1 = new Thread(sz);
		Thread t2 = new Thread(sz);
		//设置进程的名字
		t1.setName("t1");
		t1.setName("t2");
		t1.start();
		t2.start();
		// TODO Auto-generated method stub
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		time.add(Thread.currentThread().getName());	
	}

}

class Timer{
	private static int num = 0;
	public synchronized void add(String name) {
	    // synchronized (this) {
			num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			System.out.println("这是第" + num + "次调用此变量");
		//}
	}
}
