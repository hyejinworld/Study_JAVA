package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//인터페이스 타입으로 접근해야한다 
public class ListExam02 {
	List<Integer> list = new ArrayList<>(5);
 
	public ListExam02() {
		
		list.add(14);
		list.add(10);
		list.add(30);
		list.add(5);
		list.add(50);
		
		//add로 넣고 get으로 꺼낸다. 
		
		System.out.println("저장된 개수 ="+	list.size());
	
		//중복도 가능하고 순서도 보장되고 
	 for(int i = 0; i<	list.size(); i++) {
		int no = list.get(0);
	  System.out.println("no="+ no);
	}
	 
	 System.out.println("------개선된 for------");
	 for( int no  : list) {
		 System.out.println("no = " + no);
	 }
	
	
	
	//제거 
	 int i = list.remove(2);
	 System.out.println("제거 후 = "  + i);
	
	//this.remove(20);
	
	 boolean b = 	list.remove((Object)5);
	 System.out.println("b =" + b);

	
	 Collections.sort(list);
		
	 //내림차순 - comparator를 리턴한다
	 
	 System.out.println("정렬 후 오름차순:" + list);
	 Collections.sort(list, Collections.reverseOrder());
	 System.out.println("정렬 후 내림차순:" + list);
	
	}
 
 
	public static void main(String[] args) {
		new ListExam02();
	}
	
 
}
