package ex0224;

public class SynchronizedExam {
	
	public static void main(String[] args) {
		
		System.out.println("--메인 시작--");
		
		Bank bank = new Bank();
		
		CustomerThread th1 = new CustomerThread(bank, "입금자", true);
		CustomerThread th2 = new CustomerThread(bank, "인출자", false);
		
		th1.start();
		th2.start();
		
		System.out.println("--메인 끝 입니다--");
	}

}

// 여러 스레드가 공유할 객체
// @param state true이면 입금, false이면 출금
class Bank{
	int balance;//잔액
	
	public synchronized void balanceChange(String name, boolean state) {
		if(state) { //입금
			synchronized (this) {
			System.out.println(name + "==> 현재 잔액:"+ balance + "/");
			balance++;
			System.out.println(name + "==> 증가 후 현재 잔액 :"+ balance);
			}
		}else { //인출
			synchronized (this) {
			System.out.println(name + "==> 현재 잔액: "+ balance + "/");
			balance--;
			System.out.println(name + "==> 감소 후 현재 잔액: "+ balance);
			}
			}
	}
}


/*제한자 synchronized 는 특정 스레드 synchronized 블럭안에서 일을 다 마무리 할때까지
     다른 스레드가 제어권을 뺏어가지 못하도록 하는것. synchronized 블럭안에 있는 스레드가
     lock을 가지고 있다고 하고 블럭빠져나가면 잠금이 풀린다.
     
     wait() : 현재 runing중인 스레드를 중지상태로 만듦
     notify(), notifyAll() : wait()에 의해 중지상태인 스레드를 runnable상태로 만듦
     주의 : wait(),notify(), notifyAll()는 반드시 synchronized블럭안에서 사용한다. */

//outer class 입금 or 출금을 하게 된 스레드 객체 
class CustomerThread extends Thread{
	//Bank bank = new Bank()
   Bank bank;
   boolean state;
   CustomerThread(Bank bank, String name, boolean state){
	   super(name);
	   this.bank = bank;
	   this.state =state;
   }
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			bank.balanceChange( super.getName(), state);
		}
	}
}