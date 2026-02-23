package ex0223.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutExam {
	
	public FileInputOutExam() {
			FileInputStream fis = null;
			FileOutputStream fos = null;
		try {
		//byte 단위 파일 읽기 (InputStream -> FileInputStream)
		//예외처리를 해줘야 한다. 
			
			fis = new FileInputStream("src/ex0223/test.txt"); //파일을 읽는거 입력 
//			while(true) {
//				
//				int i = fis.read();
//				if(i=-1)break;
//				System.out.println(i + "=" + (char)i);
//			}
			
			int len = fis.available(); //읽을 수 있는 btye수 반환
			System.out.println("len =" + len);
		
			byte b [] = new byte[100];
			int re = fis.read(b);
		
			System.out.println("re" + re);
			String data = new String(b);
			System.out.println("data"+ data);
			
			//파일에 저장 = 출력
			fos = new FileOutputStream("src/ex0223/write.txt" , true); //try 블럭 안에 있어서 예외처리안해도됨
			fos.write(65);
			
			String str = "투어스월드";
			fos.write(str.getBytes()); //오류가 나기때문에 getbyte 로 수정 
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
		try{
			if(fis!= null)fis.close(); //닫기
			if(fos!=null)fos.close(); //닫기
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileInputOutExam();
	}

}
