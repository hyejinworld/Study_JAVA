package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam01 extends ArrayList<Integer>{
	
	public ListExam01() {
		super(5);
		
		super.add(10);
		this.add(14);
		add(20);
		super.add(10);
		super.add(30);
		this.add(5);
		
		//add로 넣고 get으로 꺼낸다. 
		
		System.out.println("저장된 개수 ="+super.size());
	
		//중복도 가능하고 순서도 보장되고 
	 for(int i = 0; i<size(); i++) {
		int no = super.get(0);
	  System.out.println("no="+ no);
	}
	 
	 System.out.println("------개선된 for------");
	 for( int no  : this) {
		 System.out.println("no = " + no);
	 }
	
	
	
	//제거 
	 int i = this.remove(2);
	 System.out.println("제거 후 = "  + i);
	
	//this.remove(20);
	
	 boolean b = this.remove((Object)5);
	 System.out.println("b =" + b);
	 
	
	//정렬
	 
	 System.out.println("---------정렬하기---------");
	 System.out.println("정렬 전 : " + this.toString()); //this.toString
	
	 //오름차순 
	
	 Collections.sort(this);
	
	 //내림차순 - comparator를 리턴한다
	 
	 System.out.println("정렬 후 오름차순:" + this);
	 Collections.sort(this, Collections.reverseOrder());
	 System.out.println("정렬 후 내림차순:" + this);
	}
	
	
	
	
	public static void main(String[] args) {
		new ListExam01();
	}

	
	
	
}
