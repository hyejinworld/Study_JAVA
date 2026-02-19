package ex0219.exam01;



//public class Box {
//
//	private Object content;
//
//	public Object getContent() {
//		return content; //get을 통해서 얻어온다 
//	}
//
//	public void setContent(Object content) {
//		this.content = content; //set을 통해서 저장
//	}
//	
//	
//	
//}

public class Box<T> {

	private T content;

	public void setContent(T content) {
		
		this.content = content;
		
	}
	public T getContent() {
		 return content;


	}
	 
	
	
	
	
	
	
}

