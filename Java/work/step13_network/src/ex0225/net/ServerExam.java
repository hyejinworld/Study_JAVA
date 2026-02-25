package ex0225.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
	
	public ServerExam(){
		
		try (ServerSocket server = new ServerSocket(8000)) {
			while(true) {
				System.out.println("클라이언트 접속 대기중");
				Socket sk  = server.accept();
				String ip = sk.getInetAddress().toString();
				
				System.out.println(ip+ "님 접속되었습니다");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				String clientData = br.readLine();
				System.out.println("클라이언트가 보내온 내용="+ clientData);
				
				//클라이언트에게 데이터를 보내기 = 전송 
				PrintWriter pw = new PrintWriter(sk.getOutputStream(),true);
				pw.println("자바 세상에 오신걸 환영합니다!!");
			}
			// TODO: handle exception
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}
	
	public static void main(String[] args) {
		new ServerExam();
	}

}
