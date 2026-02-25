package ex0225.multiChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServletGUIChatExam {

	Socket sk;
	List<ClientSkThread> list = new ArrayList<>();
	
	public ServletGUIChatExam(){
		
		try(ServerSocket server = new ServerSocket(8002)) {
			while(true) {
			System.out.println("Client 접속 대기중입니다.");
			sk =server.accept();
			System.out.println(sk.getInetAddress()+"님 접속 하셨습니다");
			
			ClientSkThread th = new ClientSkThread();
			list.add(th);
			th.start();
			
			System.out.println("현재 접속 인원 :" +list);
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}// 생성자 끝
	
	
	//메소드 접속한 클라이언트 메세지 전송하는 메소드 
	
	public void sendMessage(String message) {
		for (ClientSkThread th : list) {
			th.pw.println(message);
			
		}
	}
	
	class ClientSkThread extends Thread{
		
		PrintWriter pw;
		BufferedReader br;
		String nickName; //닉네임
		
		public ClientSkThread() {
			
			
			try {
			pw = new PrintWriter(sk.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		@Override
		public void run() { //클라이언트가 보내온 내용을 읽어서 접속한 모든 클라이언트에게 전송
			
		try {
			nickName = br.readLine();
			sendMessage("["+nickName+"]"+"님 입장하셨습니다");
			
			while (true) {
				String inputData = br.readLine();
				sendMessage("["+nickName+"]" + inputData);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //잠시 예외처리 
			//현재 스레드에 문제가 생겼다.
			//현재 스레드를 list에서 제거 
			list.remove(this);
			
			//남아있는 클라이언트에게 알린다. 
			sendMessage("["+nickName+"]"+ "님 퇴장하셨습니다.");
			//서버 콘솔에 인원수 출력
			
			System.out.println("["+nickName+"]" + "님 퇴장하셨습니다." + "현재인원"+ list.size()+"명");
		} //대화명 저장
		}
	}
	
	public static void main(String[] args) {
		new ServletGUIChatExam();

	}

}
