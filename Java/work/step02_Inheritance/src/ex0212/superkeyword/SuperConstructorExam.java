package ex0212.superkeyword;


class Parent {
	Parent(){
		System.out.println(1);
	}
	Parent(int i ){
		System.out.println(2);
	}
	Parent(String s){
		System.out.println(3);
	}
	
	
}

class Child extends Parent { //chil는 parant object이다.
	Child(){
		System.out.println(4);
	}
	Child(int i ){
		System.out.println(5);
	}
	Child(boolean b){
		System.out.println(6);
	}
	
}


public class SuperConstructorExam {

	public static void main(String[] args) {
		System.out.println("-------------------------------");
		//모든 자식생성자 구현부 첫번째 줄에 super()가 생략되어있다. 
		//new Child();
		//new Child(10);
		new Child(true);
		System.out.println("-------------------------------");
		//만약 부모 생성자가 없으면 
		new Child();  //4
		new Child(10); //5
		
		System.out.println("-------------------------------");
		//만약 부모의 기본생성자 없고 다른 생성자를 추가했다면
		//Parent(){} 주석처리하면 child()ㅇ서 this()로 다른생성자를 추가해야지만 에러가 나지 않는다. 
		new Child();
	
	}

}
