package ex0213;


public class MainShopping {

	public static void main(String[] args) {
	ShoppingException se = new ShoppingException();
	
	
	//난수발생 전용 클래스
//	Random r = new Random();
//	int age = r.nextInt(55) +1

    for (int i = 0; i < 10; i++) {
        int age = (int)(Math.random() * 55) + 1;  
        System.out.println("나이확인" + age);
   
	        try {
	    se.checkAge(age);
	        } catch (ReadAgeException e) {
	   System.out.println("★예외 발생: " + e.getMessage());
	        }
	    }

    System.out.println("예외개수" +ReadAgeException.getCount());
}
}
