//调用join方法合并线程，将子线程mt和并到main主线程中；合并后程序的执行过程相当于方法的执行过程
package Thread;

public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mythread1 mt = new Mythread1("thread");
       mt.start();
       try {
		mt.join();
	} catch (InterruptedException e) {
		// TODO: handle exception
		return;
	}
       for (int i = 0; i < 5; i++) {
		System.out.println("main"+ i );
	}
	}

}

class Mythread1 extends Thread{
//调用父类的构造方法，便于线程的命名
 Mythread1(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
 public void run() {
	 for (int i = 0; i < 5; i++) {
		 System.out.println(this.getName() + i);
		 try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			return;
		}
		
	}
 }
	
}
