package ex0223.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriter {
	
	public BufferedReaderWriter() {
		try(BufferedReader br = new BufferedReader(new FileReader("src/ex0223/test.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0223/test2.txt"))
				) {
			
			//한문자읽기
//			//int i = br.read();
//			int i = 0;
//			while((i= br.read()) !=-1) {
//			System.out.println(i + "=" +(char)i);
			
			String data= null;
			while((data = br.readLine()) !=null) {
			System.out.println(data);
			bw.write(data);
			bw.newLine();
			bw.flush();
			
			
			
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new BufferedReaderWriter();
	}

}
