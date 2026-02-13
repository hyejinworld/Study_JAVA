package ex0211.sample02;

import ex0211.sample02.Employee;
import ex0211.sample02.FullTime;
import ex0211.sample02.PartTime;

/**
 * @param args
 */
public class MainAPP{
public static void main(String[] args) {
	
	Employee [] emp = new Employee[5];
	
//	
//	FullTime [] full = new FullTime[3];
//	PartTime [] part = new PartTime[2];

	
	emp[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
	emp[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
	emp[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
	
	emp[3] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
	emp[4] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
	
	//출력화면을 보고 코딩...

	
//	for (int i = 0; i<full.length; i++) {
//		System.out.println(full[i]);
//	}
	
	System.out.println();

		//부모타입이라도 재정이된 메소드는 재정의된 메소드가 호출된다
		
		for (Employee employee : emp) {
		       // 안전하게 다운캐스팅
		        // FullTime 타입 고유 메소드 또는 필드 사용 가능
		        System.out.println(employee);
		       
		 
		}
		System.out.println();
		
	}

	
//	FullTime f0 = full[0];
//	System.out.println(f0.toString());
//	f0.message();
//	
//	FullTime f1 = full[1];
//	System.out.println(f1.toString());
//	f1.message();
//	
//	FullTime f2 = full[2];
//	System.out.println(f2.toString());
//	f2.message();
//	
//	
//	PartTime p0 = part[0];
//	System.out.println(p0.toString());
//	p0.message();
//	
//	PartTime p1 = part[1];
//	System.out.println(p1.toString());
//	p1.message();

	
}

//to

}
}