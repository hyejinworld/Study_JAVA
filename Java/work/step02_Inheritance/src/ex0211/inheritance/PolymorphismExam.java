package ex0211.inheritance;


class CarCenter{
	//매개 변수를 이용한 다형성 -> 접근범위 제약, car타입 부분만 접근가능
	public void engineer(Car cd){
		System.out.println("cd 주소"+ cd);
	//	System.out.println(i);
		
		//접근이 가능하도록 부모타입을 자식타입으로 형변환 
		// 부모 > 자식
		
		//EfSonata efs = cd;
		//오브젝트다운캐스팅을 해야한다. 
		
		if(cd instanceof EfSonata) {
		 EfSonata efs = (EfSonata)cd;
		 System.out.println("efs 주소"+ efs);
		 System.out.println("efs 주소"+ efs.i);
		System.out.println("=====================");
		 
		}
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car c= new Car();
		
		cc.engineer(c);//
		cc.engineer(ef);//
		cc.engineer(ca);//
		cc.engineer(ex);//
		
		
	
	}
}