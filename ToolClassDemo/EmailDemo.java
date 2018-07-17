package ToolClassDemo;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailDemo {
	/***
	 *@author wangwei
	 *@version 1.2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//收件人电子邮箱
		String to = "541086759@qq.com";
		//发件人电子邮箱
		String from = "541086759@qq.com";	
		//指定发邮件的主机为
		String host = "smtp.qq.com";
		//获取系统属性
		Properties pro = System.getProperties();
		//设置邮件服务器
		pro.setProperty("mail.smtp.host", host);
		pro.put("mail.smtp.auth", "true");
		//获取默认的session对象
		
		Session session = Session.getDefaultInstance(pro,new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("541086759@qq.com", "tjfipnyqopgsbcgb");
			}
		});
		try {
			//创建默认的MimeMessage对象
			MimeMessage message = new MimeMessage(session);
			//setFrom：头部头字段
			message.setFrom(new InternetAddress(from));
			//set To：头部头字段
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			//set Subject：头部头字段
			message.setSubject("This is the Subject Line!");
			message.setText("This is a message test");
			Transport.send(message);
			System.out.println("sent message successful");
		} catch (MessagingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
