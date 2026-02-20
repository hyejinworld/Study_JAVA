package ex0220.set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {

	Set<Member> set = new HashSet<Member>();
	
	public MemberSetExam() {
		

		set.add(new Member("루이", 20, "부산"));
		set.add(new Member("루이", 10, "광주"));
		set.add(new Member("루이", 10, "광주"));
	
		//다 저장된다 
		//member hashcode와 equals에 false리턴  overide하면 한개 밖에 안들어간다 
		
		System.out.println("저장된 개수 = " +set.size());
	}
	public static void main(String[] args) {
		 new MemberSetExam();
	}
}
