package ex0224;

public class InterruptedExam03 {

	public static void main(String[] args) {
		System.out.println("****메인 시작합니다.****");
		
		Thread th1 = new Thread(()->{
				while(true) { //이게 추가됐다.
					System.out.println("곧 집에간다~~~~");
					
				try { 
						Thread.sleep(500);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					 
				}
			
		});
		
		th1.setDaemon(true);// 메인 스레드 
		th1.start();
		
		
		try {
		 Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//3초 후에 th1스레드 멈추게하고 싶다!!!
		th1.interrupt(); //InterruptedException 발생하려면 잠시라도 일시정지상태가 되어야 한다.
		
		
		System.out.println("****메인 종료합니다.****");

	}

}
