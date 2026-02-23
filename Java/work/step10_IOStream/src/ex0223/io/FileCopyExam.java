package ex0223.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileCopyExam {
	
//	FileInputStream fis = null;
//	FileOutputStream fos = null;
	BufferedInputStream bis = null;  //성능이 좋아진다. 보조스트림
	BufferedOutputStream bos = null;
	
	public FileCopyExam(String readFile, String writeFile) {
	
		
	long start = System.nanoTime();
	long end = System.nanoTime();
	System.out.println((end-start) +"ns");

	
	try {
		bis = new BufferedInputStream(new FileInputStream(readFile));
		bos = new BufferedOutputStream(new FileOutputStream(writeFile));
		
		int i = 0;
		while((i=bis.read()) != -1) {
			bos.write(i); // 저장= 쓰기
		}
		bos.flush(); //버퍼를 비워라
		System.out.println("파일 복사 완료 입니다");
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try{
			if(bos!= null)bos.close();
			if(bis!= null)bis.close(); //순서 buffer를 먼저 해줘야 한다. 

			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	/////////////////////////////////////////////////////////
	}


	public static void main(String[] args) {
		
		
		String readFile = JOptionPane.showInputDialog("파일명");
		String writeFile = JOptionPane.showInputDialog("읽을 파일명");
		
		new FileCopyExam(readFile, writeFile);
		

	}

	
}
