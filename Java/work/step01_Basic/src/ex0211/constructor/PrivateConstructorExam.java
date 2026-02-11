package ex0211.constructor;

class Test{
	
	//만약 주소값이 같게 하려면 아래 new를 생성해야 한다.  static붙임	
	private static Test t = new Test();
	
	//외부에서 객체를 직접 생성하지 못하도록 막음
	private Test() {
		//현재 객체를 직접 생성해서 리턴해주는 메서드 제공
	}
	public static Test getInstance() {
	 //	return new Test();
		return t;
	}
}
public class PrivateConstructorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//t1, t1 다른 주소를 가지고 온다. 객체를 새로 생성할때마다 가지고온다.
		Test t1 = Test.getInstance(); 
		Test t2 = Test.getInstance(); 
		//테스트 객체를 반환 받을 수 있고 테스트 객체를 얻어온다
		System.out.println("t1 ="+ t1);
		System.out.println("t2 ="+ t2);
		Test obj1 = Test.getInstance();
		Test obj2 = Test.getInstance();
		if (obj1 == obj2) {
			System.out.println("같은객체");
		}else {
			System.out.println("다른 객체");
		}
	}

}
