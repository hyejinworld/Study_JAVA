package ex0225.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {

		public ClientExam() {
			try (Socket sk = new Socket("192.168.0.7", 8000)){
				
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			pw.println("인도개발자분 안녕하세요");
				
			
			//서버가 보내온 내용 읽기
			BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			String data = br.readLine();
			System.out.println("서버가 보내온 내용=" + data);
			
			
			} catch (Exception e) {
			 e.printStackTrace();	// TODO: handle exception
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientExam();
	}

}
