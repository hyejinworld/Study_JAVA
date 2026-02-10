package exam.homework;

public class SungJuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//double ns = (int)(Math.random()*12 + 1);
		//System.out.println("난수 = "+ns);
		
		String name = "혜진"; //선언과 동시에 값을 초기화
		
		int total = 0;
		int kor, eng, math;
		char grade;
		

		
		
		kor = (int)(Math.random() * 56) + 45; //100-45+1 최소값 45
		eng = (int)(Math.random() * 56) + 45; //100-45+1 최소값 45
		math = (int)(Math.random() * 56) + 45; //100-45+1 최소값 45
		
		total = kor + eng + math;
		//double avg = ((double)total/3)0.2F;
		
		double avg = (int)((double) total / 3 * 100 + 0.5) / 100.0;
		
		
		//학점 if문, switch 문 
		
	
	/*	 if(avg >= 90 && avg < 100 )grade = 'A'; 
		 else if(avg >= 80 && avg < 90 )grade ='B'; 
		 else if(avg >= 70 && avg <80 )grade = 'C'; 
		 else if(avg >= 90 && avg <100)grade = 'D';
		 
		 default: grade ='F';*/
		
		if(avg >=90) {
			grade = 'A';
		} else if(avg >= 80) {
			grade = 'B';
		}else if(avg >=70) { 
				grade ='C';
		}else if(avg >= 60) { 
				grade ='D';
		}
		else { grade = 'F';
		}
		
		
	// switch문 	
//		switch((int)avg/10) {
//		case 10 : grade ='A'; break;
//		case  9 : grade ='B'; break;
//		case  8 : grade ='C'; break;
//		case  7 : grade ='D'; break;
//	 
//		default: grade ='F';
//		
//		}
		
		System.out.println(name+"님의 성적표");
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" + eng);
		System.out.println("수학 :" + math);
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + avg);
		System.out.println("등급 :" + grade);
	}

}
