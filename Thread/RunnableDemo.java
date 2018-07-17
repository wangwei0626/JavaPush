//实现Runnable实现多线程
/**建议使用线程的时候可以继承接口，Runnable适合相同的代码资源处理同一个资源*/
package Thread;

public class RunnableDemo implements Runnable {
    private String name;
    private int count = 50;
	public RunnableDemo(String name) {
		
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i < 5; i++) {
		
			System.out.println(name + "运行" + i + "\n" + this.count--);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建线程对象
		RunnableDemo R1 = new RunnableDemo("A");
		//继承接口的线程类需要通过创建Thread实例执行
		Thread D1 = new Thread(R1,"S");
		Thread D2 = new Thread(R1,"x");
		D2.start();
		D1.start();
	}

}
