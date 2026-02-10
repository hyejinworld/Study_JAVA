package ex0203.casting;

class CastingExam{
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1= (byte) i1;
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte) (b2+b1);

		System.out.println("byte b3="+b3);
		
		long lo=56897L; //데이터타입 promotion
		System.out.println("long lo="+lo);

		long i4=lo+i1; 
		System.out.println("int i4="+i4);
		
		boolean boo;
		boo = true;
		 //boo= 0; 
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;
		System.out.println("double d="+d);

		float f1=lo; //실수형은 정수보다 크게 본다. 
		System.out.println("float f1="+f1);
				
		
	    float f2=(float) d;
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0167';
		System.out.println("char c1="+c1);

		 b2=(byte) c1; 
		System.out.println("byte b2="+b2);
		
		c2 ='A';
		System.out.println("char c2="+c2);
		
		
		c3=(char) (c2+2);
		System.out.println("char c3="+c3);
		
		
		
		char ch1 = 65;
		char ch2 = 0x0041;
		char ch3 = '\u0041';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
	//	System.out.println(ch1);
		
	}

}