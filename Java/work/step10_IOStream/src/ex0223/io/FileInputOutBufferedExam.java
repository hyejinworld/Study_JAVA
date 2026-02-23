package ex0223.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutBufferedExam {
	
	public FileInputOutBufferedExam() {
			FileInputStream fis = null;
			FileOutputStream fos = null; //노드스트림 
		 
			BufferedInputStream bis = null;  //성능이 좋아진다. 보조스트림
			BufferedOutputStream bos = null;
			
			try {

				
				fis = new FileInputStream("src/ex0223/test.txt"); //파일을 읽는거 입력 
				bis = new BufferedInputStream(fis); //fis가 들어와서 buffer가 됨 
//					while(true) {
//						
//						int i = fis.read();
//						if(i=-1)break;
//						System.out.println(i + "=" + (char)i);
//					}
				int len = bis.available(); 
				System.out.println("len =" + len);
				
				byte b [] = new byte[100];
				int re = bis.read(b);
			
				System.out.println("re" + re);
				String data = new String(b);
				System.out.println("data"+ data);
				
				//파일에 저장 = 출력
				fos = new FileOutputStream("src/ex0223/write.txt"); //try 블럭 안에 있어서 예외처리안해도됨
				bos = new BufferedOutputStream(fos);
				bos.write(65);
				
				String str = "곧 점심시간이라서 행복한 feeling";
				bos.write(str.getBytes()); //오류가 나기때문에 getbyte 로 수정 
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
			try{
				if(bos!= null)bos.close();
				if(bis!= null)bis.close(); //순서 buffer를 먼저 해줘야 한다. 
				if(fis!= null)fis.close(); //닫기
				if(fos!=null)fos.close(); //닫기
				
			}catch (Exception e) {
				e.printStackTrace();
			
			}
			
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileInputOutBufferedExam();
	}

}
