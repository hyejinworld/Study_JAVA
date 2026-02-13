package ex0213;

//public class ReadAgeException extends RuntimeException{ 체크예외이므로 예외처리 필수
public class ReadAgeException extends RuntimeException{ //비체크예외이므로 예외처리 선택

	private static int count = 0;
	
 public ReadAgeException(){
	 super("애들은 가라");
	 count++;
 }
 
 
// public ReadAgeException (String message) {
//	 super(message);
// }
 
 public static int getCount() {
	return count;
 }
}

 
//throw new ReadAgeException ();
//throw new ReadAgeException ();
//throw new ReadAgeException ();
//}
