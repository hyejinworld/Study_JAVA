package ex0219.exam06;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//기존 방식
//		Ainterface ai = new Test();
//		ai.aa();
		
		//익명의 타입 사용, annoymousInner type 작성 익명타입 선ㅅ언

//		Ainterface ai =new Ainterface() {
//			
//			@Override
//			public void aa() {
//				// TODO Auto-generated method stub
//				System.out.println("익명의 타입 호출됨");
//			}
//		};
//			
//		ai.aa();
	
		//3.람다식
		
//		Ainterface ai = ()->{
//			System.out.println("인수와 리턴없는 라마식");
//		};
//		
//		ai.aa();
		
		//한문장일 때 {} 삭제
		Ainterface ai = ()->System.out.println("인수와 리턴 없는 람다식");
		ai.aa();
		
		//인수가 있는 람다식 
		Bintercaxe bi  = (a)->System.out.println("전달된 a =: " +a);
		bi.bb(5);
	
		//인수와 리턴이 있는 경우 
		Cinterface ci = (a,b) -> {return a*b;};
//		Cinterface ci = (a,b) -> a*b;
		int re = ci.cc(5, 7);
		System.out.println("re = " + re);
		
	}

}


class Test implements Ainterface{

		@Override
		public void aa() {
		System.out.println("TEST");
}

}