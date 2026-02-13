package ex0213;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인시작");
		System.out.println("args=" + args);
		//System.out.println("args [0] = "+ args[0]);
		
		try {
			System.out.println("args [0] = "+ args[0]);
			
			int covertNo = Integer.parseInt(args[0]);
			System.out.println("변환 값" + covertNo);
	
			int result = 100/covertNo;
			System.out.println("나눈 결과 = " + result);
			
		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("인수를 전달해주세요" + e);  //객체 찍으면 e.toString
			// TODO: handle exception

		} catch (NullPointerException e) {
			System.out.println("숫자만 입력해주세요" + e.getMessage());
		}
		catch ( Exception e) {  //나머지 에러는 다 여기로 들어온다.
			// 이외에 모든 예외는 여기서 처리한다.
			System.out.println("예외가 발생했어요!");
			
			//개발자가 개발할때 예외에 대한 정보를 추적(디버깅)
			// 반드시 배포(운영환경)에서는 제거해야한다. 
			//이거자체가 출력이다. 
			//보안취약점 점검할때 e.printStackTrace()가 걸려서 지우는게 좋다 
			e.printStackTrace(); //예외정보를 디테일하게 stack에 꺼내서 출력해준다. 
		}finally {
			System.out.println("finally 영역은 예외 상관없이 항상 실행");
		}
		System.out.println("메인끝");
	
	}

}
