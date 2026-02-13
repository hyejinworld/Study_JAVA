package ex0211.sample01;

/**
 * @param args
 */
public class MainAPP{
public static void main(String[] args) {
	
	FullTime [] full = new FullTime[3];
	PartTime [] part = new PartTime[2];

	
	full[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
	full[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
	full[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
	
	part[0] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
	part[1] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
	
	//출력화면을 보고 코딩...

	
//	for (int i = 0; i<full.length; i++) {
//		System.out.println(full[i]);
//	}
	
	for( FullTime f : full) {
		System.out.println(f);
	}
	
	for( PartTime p : part) {
		System.out.println(p);
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