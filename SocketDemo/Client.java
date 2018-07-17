//客户端程序
package SocketDemo;

import java.io.*;

import java.net.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		try {
			System.out.println("连接到主机" + serverName + "，端口为：" + port);
		//创建一个socket对象
		Socket	client = new Socket(serverName,port);
		System.out.println("远程主机地址为：" + client.getRemoteSocketAddress());
		//获取客户端套接字的输出流
		OutputStream outToServer = client.getOutputStream();
		//创建数据输出流对象
		DataOutputStream out = new DataOutputStream(outToServer);
		
		out.writeUTF("hello from" + client.getLocalSocketAddress());
		//创建客户端输入流
		InputStream inFromServer = client.getInputStream();
		//创建数据输入流
		DataInputStream in = new DataInputStream(inFromServer);
		System.out.println("服务端响应:" + in.readUTF());
		client.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
/**连接到主机localhost，端口为：6066
远程主机地址为：localhost/127.0.0.1:6066
服务端响应:谢谢连接我:/127.0.0.1:6066
GoodBye*/