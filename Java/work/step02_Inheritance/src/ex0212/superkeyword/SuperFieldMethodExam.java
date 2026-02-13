package ex0212.superkeyword;



class Animal {
	
	int age = 5;
	String bodyColor;
	public void sound() {
		System.out.println("super의 sound call");
	}
	public void eat() {
		System.out.println("super의 eat call");
	}
}

class Cat extends Animal{
	
	int age =10;
	int weight ; //10
	
	public void sound() {
		System.out.println("cat의  sound call");
	}
	public void run() {
		System.out.println("cat의 run call");
	}
	public void test() {
		
		System.out.println("필드테스트");
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		
		System.out.println(this.weight);
		//System.out.println(super.weight);

System.out.println("메소드");
sound();
this.sound();
super.sound();

eat();
this.eat();
super.eat();

run();
this.run();
//super.run();
System.out.println("---------");

		
		
		
		
		
	}
	
	
}
public class SuperFieldMethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Cat().test();
		
		System.out.println("외부에서 객체 생성해서 접근");
		Cat cat = new Cat();
		System.out.println(cat.age);
		System.out.println(cat.bodyColor);
		System.out.println(cat.weight);
		
		cat.sound();
		cat.eat();
		cat.run();
		
		System.out.println();
		Animal an = new Cat();
		System.out.println(an.age);
		System.out.println(an.bodyColor);
		//System.out.println(an.weight);

		an.sound(); //재정의된 메소드는 부모타입으로 접근해도 재정의된 메소드 호출
		
		an.eat();
		//an.run(); //부모타입으로 자식 부분 접근 불가
	
		System.out.println("an = " + an);
		//an으로 접근할 수 없는 자식 부분을 접근하기 위해서 ObjectDownCastion이 필요하다. 
		Cat c = (Cat)an; 
		//부모>자식관계
		System.out.println("c="+c);
		System.out.println(c.weight);
		c.run();
		
		System.out.println("-------------------------------------");
		Animal a = new Animal();
		Cat cc = (Cat)a; //ClassCationgException 발생 실행도중
	}

}
