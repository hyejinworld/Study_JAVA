package exam.homework;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5.0;
		double y = 0.0;
		double z =  x % y;
		
		if(z%0 == 1) {
			System.out.println("0.0으로 나눌 수 없습니다");
			System.out.println(z);
		} else {
			double result = z +10;
			System.out.println("결과" + result);
		}

	}

}
