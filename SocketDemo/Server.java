//先使用java命令执行 Server文件，再执行Client文件；注意包名问题
//服务端程序
package SocketDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server extends Thread {
	
	private ServerSocket serverSocket;
	
	public Server(int port) throws IOException{
		//实例化serversocket对象
		serverSocket = new ServerSocket(port);
		//服务器等待的时间，10秒后超时并抛出异常
		serverSocket.setSoTimeout(10000);
			
	}
	public void run(){
		while(true) {
			try {
				System.out.println("等待远程连接，端口号为" + serverSocket.getLocalPort() + ".....");
				//调用accept方法，等待客户端连接
				Socket server = serverSocket.accept();
				System.out.println("远程主机地址为" + server.getRemoteSocketAddress() );
				//获取服务端的输入流
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				//获取服务端的输出流
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("谢谢连接我:" + server.getLocalSocketAddress() + "\nGoodBye" );
				server.close();
			} catch (SocketTimeoutException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port  = Integer.parseInt(args[0]);
		try {
			Thread t = 	new Server(port);
			t.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
/**执行结果：
等待远程连接，端口号为6066.....
java.net.SocketTimeoutException: Accept timed out
等待远程连接，端口号为6066.....
远程主机地址为/127.0.0.1:54926
hello from/127.0.0.1:54926
等待远程连接，端口号为6066.....*/

