package Thread;

public class MainDemo implements Runnable {
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("runner:"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个线程类对象
		MainDemo main = new MainDemo();
		//启动一个新线程必须要new一个thread对象出来
		Thread runner = new Thread(main);
		//执行新线程，新线程和主线程并行执行
		runner.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main:"+i);
		}
		System.out.println();

	}

}
