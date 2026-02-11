package ex0211.overriding;

class ObjectExam{
	String str;
	public ObjectExam(){   }
	public ObjectExam(String str){ 
		this.str = str;
	}
		//주소값안나오게 하려면 아래 toString 어노테이션 해준다.
		
		@Override
		public String toString() {
			//return "집에 가고싶다";
			return str + super.toString();
		}
	}

class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="이름"; 
			String s02="Java";
			String s03=new String("월요일");
			ObjectExam oe1=new ObjectExam();
			
			// objectExam();
			
			//oe1 = (oe1.toString());
			ObjectExam oe2=new ObjectExam("하이");
			
			//print(Object obj) or println(Object obj)메소드는 인수전달된 객체 .toString()을
			//호출한다. toString()리턴하는 값을 출력하게 된다. 
			//object에 정의된 toString은 객체 주소(class이름@hashcode)를 문자열로 리턴 
			//object상속받은 String 은 toString을 재정의 -> 자신의 문자열
			
			System.out.println(c);//
			System.out.println(s01);//
			System.out.println(s02.toString());// 이거나 그냥 s02나 같다
			System.out.println(s03);//
			System.out.println(oe1);//
			System.out.println(oe2);//
			
	}
}
