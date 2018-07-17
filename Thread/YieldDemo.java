//yield方法，当前线程让出CPU,进入就绪队列等待调度
package Thread;

public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread3 t1 = new Mythread3("t1");
		Mythread3 t2 = new Mythread3("t2");
		t1.start();
		t2.start();
	}

}

class Mythread3 extends Thread{
	public Mythread3(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()+"："+i);
			if(i % 2 == 0) {
				//当能被2整除时，此线程将进入就绪状态，重新分配资源进行调用
				yield();
			}
		}
	}
	
	
}
