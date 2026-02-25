package ex0225.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import ex0225.net.SendThread;

public class ServerChatExam {

	public ServerChatExam() {
		try {
			ServerSocket server = new ServerSocket(8001);
			System.out.println("클라이언트 접속 대기중");
			Socket sk = server.accept(); //대기하고 아직 스레드는 시작 x
			System.out.println(sk.getInetAddress().toString()+"님과 대화시작합니다.");
			
			
			//읽기
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
					
						while(true) {
							String readData = br.readLine();
							if(readData.equals("exit"))
								break;
							System.out.println(readData);
						}//while 빠져가나면 종료하는 알림
						
						System.out.println("서버 받는 스레드 종료합니다.");
					
					} catch (IOException e) {
					
						e.printStackTrace();
						System.out.println("서버 읽기 스레드 catch입니다!");
					}
					
				}
			}).start();
	
			//쓰기 = 전송
		new SendThread(sk, "[SERVER]").start();	
		
		} catch (Exception e) {
		e.printStackTrace();

	}
	}
	public static void main(String[] args) {
	
		new ServerChatExam();

	}

}
