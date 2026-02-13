package ex0212.homework;

public class Tv extends Elec implements ElecFunction {

	private int chnnel;
	
	public Tv() {
		
	}
	
	



	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		// TODO Auto-generated constructor stub
	 this.chnnel =chnnel;
	}









	public int getChnnel() {
		return chnnel;
	}





	public void setChnnel(int chnnel) {
		this.chnnel = chnnel;
	}





	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
 System.out.println();
	}





	@Override
//	public String toString() {
	
	
//	    return getCode() + "제품 TV를" + chnnel+"을 본다";
//	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getCode());
	builder.append("제품 TV를");
	builder.append(chnnel);
	builder.append("을 본다");

		return builder.toString();
	}

	
}
