package ex0225.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import ex0225.net.SendThread;

public class ClientChatExam {
	
	public ClientChatExam() {
		try {
			Socket sk = new Socket("192.168.0.7", 8001);
		
		//보내는 스레드
			new SendThread(sk, "[혜진]").start();	
			
			//받는 스레드
			new Thread(()->{
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
					
					while(true) {
						String readData = br.readLine();
						if(readData.equals("exit"))break;
						System.out.println(readData);
					}//while 빠져가나면 종료하는 알림
					
					System.out.println("Client 받는 스레드 종료합니다.");
					
				} catch (Exception e) {
					// TODO: handle exception
				e.printStackTrace();
				System.out.println("client의 받는 스레드 예외 발생했어요");
				}
				finally {
					System.out.println("-----모든 프로그램 종료 ");
					System.exit(0);
				}
			}).start();
		
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ClientChatExam();
	}
}
