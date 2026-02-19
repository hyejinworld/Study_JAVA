package ex0219.list;

//사원정보 

public class Emp implements Comparable<Emp> {

	private int empno;
	private String name;
	private int age;
	private String addr;
	
	public Emp() {}

	public Emp(int empno, String name, int age, String addr) {
		super();
		this.empno = empno;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [empno=");
		builder.append(empno);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Emp o) {
		
		//return empno - o.getEmpno(); //양수니까 왼쪽이 크다
	  return o.getEmpno() - empno; //내림차순
	}

	
	

	
	
}
