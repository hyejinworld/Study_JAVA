package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam03 extends ArrayList<Emp> {

	public ListExam03() {
		super.add(new Emp(22, "정환", 30, "일본"));
		this.add(new Emp(21, "경민", 32, "제주도"));
		
		add(new Emp(24, "지훈", 33, "유럽"));
		add(new Emp(27, "도훈", 37, "서울"));
		add(new Emp(20, "홍경", 35, "부산"));
		
	}
	
	
	
	//저장된 모든 사원정보 리턴
	public List<Emp> selectAll(){
		return this;
	}
	
	//사원번호에 해당하는 사원정보 리턴
	public Emp selectByEmpno(int empno) {
		for(Emp e: this) {
			if(e.getEmpno() == empno) {
				return e;
			}
		}
		return null;
	}
	
	//주소를 인수로 전달받아 동일한 주소인 모든 사원정보 리턴 
	
	public List<Emp> selectByAddr(String addr){
		List<Emp> findList = new ArrayList<Emp>();
			for(Emp e : this) {
				if(e.getAddr().equals(addr)) {
					//찾았다. 
					findList.add(e);
				}
			}
				return findList;
		
	}
	
	
	//사원번호 기준으로 정렬
	
	
	public List<Emp> sortByEmpno(){
		
		//정렬한 대상을 관리할 List선언
		List<Emp> shallowCopy = new ArrayList<Emp>(this);
		
		//sort는 반드시 comparable를 구현한 객체여야 사용 가능하다 
		//emp 자바 class 에 추가해준다 implements 
//		@Override
//		public int compareTo(Emp o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
		
		//sort는 반드시 comparable 구현한 객체여야 사용ㄴㅇ
		Collections.sort(shallowCopy);
		
		return shallowCopy;
	}
	
	//나이 기준
	public List<Emp> sortByAge(){
		
		List<Emp> shallowCopy = new ArrayList<Emp>(this);
		
		//Collections.sort(shallowCopy, new Test());
		
	//익명타입 
//	Collections.sort(shallowCopy,new Comparator<Emp>() {
//
//		@Override
//		public int compare(Emp o1, Emp o2) {
//			// TODO Auto-generated method stub
//			return o1.getAge() - o2.getAge();
//		}
//	} );
		
		//람다식
		Collections.sort(shallowCopy,(e1,e2)->e1.getAge() - e2.getAge());
		//정렬로 나온다 
		return shallowCopy;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListExam03 e = new ListExam03();
		System.out.println("1.전체검색");
		
		List<Emp> list = e.selectAll();
				for(Emp emp : list) {
					System.out.println(emp);
				}
				
		System.out.println("\n2. 사원번호 검색");
		Emp emp = e.selectByEmpno(20);
		System.out.println(emp);
	
		System.out.println("\n3. 주소로 검색");
		list = e.selectByAddr("서울");
		if(list.size()==0) {
		 System.out.println("주소에 해당하는 사원이 없다");
	}else{
			System.out.println(list);
			
		}
			
			//////
			/// 
		System.out.println("\n4. 주소로 검색");
		list = e.sortByEmpno();
		for(Emp em :list) {
			System.out.println(em);
		}

		
		//원본은 바뀌지 않아야 한다. 
	System.out.println("1.전체검색");
		list = e.selectAll();
				for(Emp emp2 : list) {
					System.out.println(emp2);
				}
				
				
				System.out.println("\n5. 나이로 검색");
				list = e.sortByAge();
				for(Emp em :list) {
					System.out.println(em);
				}
				
	}
				
	//나이로 검색 
class Test implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
				// TODO Auto-generated method stub
				return e1.getAge() - e2.getAge();
			}
			
		
	}

}
