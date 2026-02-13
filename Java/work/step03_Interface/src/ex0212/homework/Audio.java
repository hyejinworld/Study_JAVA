package ex0212.homework;

public class Audio extends Elec implements ElecFunction {

	private int volumn;
	
	
	public Audio() {
		
	}
	
	

	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		// TODO Auto-generated constructor stub
	this.volumn = volumn;
	}





	@Override //컴파일러가 일을 덜할 수 있다. 
	public void start() {
		// TODO Auto-generated method stub
		 System.out.println(super.getCode()+"제품");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
   
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}





	@Override
	
	public String toString() {
	    return getCode() + "의 Audio를" + volumn+"으로 듣다";
	}
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Audio [volumn=");
//		builder.append(volumn);
//		builder.append("]");
//		return builder.toString();
//	}
	
	

}
