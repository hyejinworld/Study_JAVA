package ex0220.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class SetExam {
	//Set<String> set = new HashSet<String>();
	
//	Set<String> set = new TreeSet<String>(); //정렬할때는 treeset으로 사용한다 hashset은 정렬이 안된다. 
	//내림차순으로 하고 싶다 

	Set<String> set = new TreeSet<String>(Collections.reverseOrder());
	
	public SetExam(String[] args) {
		//추가 
		for(String s: args) {
			
			boolean re = set.add(s); //중복이 안됨
			System.out.println(s + "추가 결과 =" + re);
		}
		
		System.out.println("저장된 개수=" + set.size() );
		//저장된 정보를 조회 출력 
		System.out.println("정보출력");
		Iterator<String> it = set.iterator();
		//이인터페이스에서 꺼내는 역할을 해주는
		while(it.hasNext()) { //어떤 순서로 꺼내는지는 모른다 순서보장이 안됨 , 정렬 안됨 
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("요소 제거");
		
		boolean re = set.remove("경민");
		System.out.println("제거 결과" +re);
		System.out.println("제거 후 " + set);
		
		System.out.println("존재 여부 ");
		re = set.contains("지훈");
		System.out.println("결과=" + re);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new SetExam(args);
	}

}
