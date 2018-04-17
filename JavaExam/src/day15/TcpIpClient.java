package day15;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String serverIp="70.12.114.90";
			System.out.println("������ �������Դϴ�. ���� IP : " +serverIp);
			Socket socket = new Socket(serverIp, 7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("�����κ��� ���� �޽��� :" + dis.readUTF());
			System.out.println("������ �����մϴ�.");
			
			dis.close();
			socket.close();
			System.out.println("������ ����Ǿ����ϴ�.");
		}
		catch(ConnectException ce){
			ce.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
