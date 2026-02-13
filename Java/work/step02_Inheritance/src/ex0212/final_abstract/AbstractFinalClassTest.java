package ex0212.final_abstract;

final class FinalClassExam{ //상속 불가 생성가능 
 final int i = -999999;  //반드시 초기화, 값변경 불가
}


abstract class AbstractClassExam{ //상속 가능, 생성불가
    abstract String abstractMethodExam(int i,String s);    //재정의를 위한 메소드
    final int finalMethodExam(int i, int j){ //재정의 불가 
//    	 int finalMethodExam(int i, int j){ //재정의 불가 
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
//	int finalMethodExam(int i, int j){
//		return i*j;
//	}
	
}

class Sample02{ /* extends FinalClassExam{ */
	
}


 
 abstract class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(String s,int i){ //오버로딩
		return s+i;
	 }
	abstract String abstractMethodExam(int i,String s);    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() ȣ�� ��");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace; /*= new AbstractClassExam(); */
		FinalClassExam fce = new FinalClassExam();
	//	fce.i=100000;
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
