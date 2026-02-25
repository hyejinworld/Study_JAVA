package ex0225.net;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//키보드 입력을 받아서 상대측에게 데이터를 전송하는 스레드
public class SendThread extends Thread{
	Socket sk;
	String name; 
	
	public SendThread(Socket sk, String name) {
		super(name);
		this.name = name;
		this.sk = sk;
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			while(true) {
				String input = sc.nextLine();
				if(input.equals("exit")){
					pw.println(input);
					break;
			}
				pw.println(name + "보낸내용 =" +input);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println(name + "의 예외가 발생했어요");
		
		}finally {
			System.out.println("-----모든 프로그램 종료 ");
			System.exit(0);
	}
	

}
	
}
