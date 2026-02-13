package ex0213;

public class ShoppingException {

 public void checkAge(int age) throws ReadAgeException {
	 if(age <18) {
		 //
		// ReadAgeException e =  new ReadAgeException();
		 throw new ReadAgeException();
	 }else {
		System.out.println("입장하신걸 환영합니다");
		 
	 }
 }
}
