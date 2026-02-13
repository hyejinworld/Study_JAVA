package ex0213;

class Test{
	public void aa(int i) {
		System.out.println("aa 시작");
		try {
		this.bb(i);
		}catch (ArithmeticException e) {
			
		System.out.println("aa 끝" + e.getMessage());
	}
	}
	public void bb(int i) throws ArithmeticException {
		try{
			System.out.println("bb 시작");
		int result  = 100/i; //arihemticexeption 가능성 있는 코드
		System.out.println("result =" + result);
	}finally{
		System.out.println("bb 끝");
	}
}
}
public class ThrowsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---메인 시작 ---");
		try {
			new Test().aa(0);
		}catch(ArithmeticException e) {
			System.out.println("예외가 났음" + e.getMessage());
		}
	//	new Test().aa(5);
		//new Test().aa(0);  //0으로 바꿀경우
		
		System.out.println("---메인 끝 ---");
	}

}
