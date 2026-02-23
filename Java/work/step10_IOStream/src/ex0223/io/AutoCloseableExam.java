package ex0223.io;

class Test implements AutoCloseable{
	@Override
	public void close() {
		System.out.println();
	}
}
public class AutoCloseableExam {
	
	public static void main(String[] args) {
		System.out.println();
		
//		try(Test t = new Test()){
			try{ Test t = new Test();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

}
