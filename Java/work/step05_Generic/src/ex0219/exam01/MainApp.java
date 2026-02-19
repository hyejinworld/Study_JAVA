package ex0219.exam01;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//제네릭 사용하지 않은 경우 
//		Box box = new Box();
//		box.setContent("상품");
//		
//		//String str = (String)box.getContent("상품");
//		
//		if(box.getContent() instanceof String s) {
//		}
//		box.setContent(new Board());
//		Board board =(Board)box.getContent();	
			
		
		//box에 제네릭 사용한 경우
		
		Box<String> box = new Box<>();
		box.setContent("상품");
		
		String str = box.getContent();
		
		Box<Board> box2 = new Box<>();
		box2.setContent(new Board());
		
		Board b = box2.getContent();
		
		}
		
		
	}


