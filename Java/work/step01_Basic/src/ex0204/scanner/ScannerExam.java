package ex0204.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
  	int no = sc.nextInt();
  	
  	
  	System.out.println("국어?");
//  		System.out.println(no);
  		int kor = sc.nextInt();
  
  		System.out.println("영어?");
//  		System.out.println(no);
  		int eng = sc.nextInt();
  		
  		sc.nextLine();
  		
  		System.out.println("이름?");
//  		System.out.println(no);
  		String name = sc.nextLine();
  		
  		System.out.println(name + "," + kor + "," + eng );
  		
	}

}
