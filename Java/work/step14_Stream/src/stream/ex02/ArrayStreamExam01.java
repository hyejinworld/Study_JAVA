package stream.ex02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamExam01 {
	 
	
	public static int sum;
	 
	
	public static void main(String[] args) {
		System.out.println("1.String Array Stream ------------");
		String [] strArr = {"희정","현준","정화","민지","경찬"};
		/*for(String s:strArr) { //자료구조의 Iterator를 이용한 방식
			System.out.println(s);
		}*/
		
		//Stream을 이용해서  출력해보자
		 //1) 람다식
		System.out.println("1)람다식 -----------------");
		Stream<String> stream = Arrays.stream(strArr);
		stream.forEach((s)->System.out.println(s));
		
		//2) 메소드 참조
		System.out.println("2)메소드 참조 -----------------");
		//stream.forEach(System.out :: println); //이미사용한  stream은 두번은 못쓴다. 
		Arrays.stream(strArr).forEach(System.out :: println); 
		
		//3) 한번 사용한 Stream을 다시 사용해보자(사용불가x)
		
		
		System.out.println("2.int Array Stream ------------");
		int [] intArr = {1,2,3,4,5,6,7,8,9};
		Arrays.stream(intArr) //filter를 쓰고 그다음 최종연산 
		.filter(i-> i%2 ==0)
		.forEach(System.out ::println);
		
		
		System.out.println("3.range()  vs rangeClosed() ------------");
		 //IntStream.range(0, 10).forEach(System.out ::println);
		 
		//총합 구하기 
		
		 IntStream.rangeClosed(0, 10)
		 .forEach(i -> sum+= i);
		 
		 System.out.println("합계=" +sum);
		 
		 int re = IntStream.rangeClosed(0, 10).sum(); //sum으로도 가능 
		 System.out.println("re=" +re);
		 
//		 .forEach(System.out ::println);
//		 
//		 IntStream stream = IntStream.range(1, 100);
//		 stream.forEach(a-> sum+= a);
//		 System.out.println("총합: " + sum);
		 
		 
		 
	}

}






