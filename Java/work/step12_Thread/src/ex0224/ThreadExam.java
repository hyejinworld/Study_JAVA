package ex0224;

//숫자를 출력하는 스레드 
//alpha를 출력하는 스레드 

class NumberThread extends Thread{
	//스레드로 동작할 기능을 작성
	
	int sum;
	public NumberThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			System.out.println(super.getName() +"==>" + i);
			sum+=i;
			
			//Thread.yield();
			//1초 정지 상태 1초 지나면 runnable상태로 간다. 
			try {
				Thread.sleep(10); //1000이면 1초
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(super.getName()+"End");
		// TODO Auto-generated method stub
	super.run(); //스레드 안에 메서드 재정이 	
	}

}

class AlphaThread implements Runnable{
	
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		// TODO Auto-generated method stub
		for(char ch='A'; ch<='z'; ch++) {
			System.out.println(th.getName()+ "======>" +ch);
		}
		System.out.println();
	}
}


public class ThreadExam {

	public static void main(String[] args) {
		
		System.out.println("메인 시작합니다.");
		
		NumberThread th1 =  new NumberThread("첫번째 스레드");
		NumberThread th2 =  new NumberThread("첫번째 스레드");
		Thread th3 =  new Thread(new AlphaThread(), "세번째 스레드");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(th1.sum);
		
		System.out.println("메인 끝");
	}
	
}
