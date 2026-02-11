package ex0211.final_field;

public class FinalFieldExam {
	
	int i; //인스턴스 필드 
	
	//final 필드는 반드시 명시적 초기화 필수(자동 초기화안됨)
	final int j; // 인스턴스 필드
	
	//어떻게 객체를 생성하든 즉 누가 사용하면 항상 동일한 값
	static final int k; // static 필드, 생성자에서 초기화 안됨
	
	static {
		k =100;
		
	}
	public FinalFieldExam() {
		j= 10; //인스턴스필드는 객체가 생성한 시점에 초기화만 되면된다.
		
	}
	
	public FinalFieldExam(int j) {
		this.j = j;
	}
	
	public static void main(String[] args) {
		//static 필드 접근
		System.out.println(FinalFieldExam.k);
		
		FinalFieldExam fe = new FinalFieldExam(200);
		System.out.println(fe.i);
		System.out.println(fe.j);
		System.out.println(fe.k);
	
		System.out.println();
	
		//final은 고정값으로 값 변경
		//fe.j = 20;
	}
	
	

}
