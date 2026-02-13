package ex0211.sample02;

public class FullTime extends Employee{

 private int salary;
 private int bonus;
 private String eName;
 
	
    public FullTime() {
    
    }
    public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName,
    		int salary, int bonus) {
   

    }
	
	
		public void message() {
		System.out.println(eName+ "은 정규직 사원입니다");
	}

	

}
