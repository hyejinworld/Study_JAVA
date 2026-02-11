package ex0211.enum_test;

/**
 * enum은 열거형으로 안에 정의된 정보는 static final상수이다. 
 * 
 */
public enum Grade {
		//BASIC,SILVER,GOLD
	BASIC(0,"일반"),SILVER(1, "우수"),GOLD(2,"일반"); //이 값들을 내가 초기화
	private final int code;
	private final String name;
	
	 Grade(int code, String name){
		this.code = code;
		this.name = name;
		
	 }

	 public int getCode() {
		return code;
	}

	 public String getName() {
		return name;
	}

	 
	 //SET은 필요없다 값변경이 일어나서 
	 
}
