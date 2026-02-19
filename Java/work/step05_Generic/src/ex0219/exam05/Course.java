package ex0219.exam05;

public class Course {

	//모든 사람들 허용
	
	public void register01(Applicant<?> applicant) {
		
		System.out.println(applicant.getKind().getClass().getSimpleName()+ "신청완료");

	}
	//직장 
	public void register02(Applicant<? super Worker > applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName()+ "신청완료 + register02");
		System.out.println(applicant.getClass().getSimpleName()+ "신청완료 + register02");
	}	
	//학생들만 허용
	public void register03(Applicant<? extends Student > applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName()+ "신청완료 + register03");
	}	
}
