package ex0219.exam04;


public class Box<T> {

	private T content;

	public void setContent(T content) {
		
		this.content = content;
		
	}
	public T getContent() {
		 return content;


	}
	
	public <A,B> T test(A a, B b) {
		return null; // api 정의 스트림 api 쪽 ()로들어와서 <>로 나간다 
	}
	 
	
	
	
	
	
	
}

