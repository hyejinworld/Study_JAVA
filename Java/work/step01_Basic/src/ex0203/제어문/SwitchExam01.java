package ex0203.제어문;

public class SwitchExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ns = (int)(Math.random()*12 + 1);
		System.out.println("난수 = "+ns);

			 int month = (int) ns;
			 System.out.println("변환" + month );
			 
			 int day =0;
			 
/*			 switch(month){
				 case 1 : day = 31;break;
				 case 2 : day = 28;break;
				 case 3 : day = 31;break;
				 case 4 : day = 30;break;
				 case 5 : day = 31;break;
				 case 6 : day = 30;break;
				 case 7 : day = 31;break;
				 case 8 : day = 31;break;
				 case 9 : day = 30;break;
				 case 10 : day = 31;break;
				 case 11 : day = 31;break;
				 case 12 : day = 31;break;
				 
				 default:
					 System.out.println("");
					 
			 } */
//			 
//			 if(month==1) {
//				day =30; 
//			 } else if(month==2) {
//				 day = 28;
//				 }else if(month==3) {
//					 day =31;
//			 }else if(month==4) {
//			  day =30;
//			 }else if(month==5) {
//				 day =31;
//			 }else if(month==6) {
//				 day =31;
//			 }else if(month==7) {
//				 day =31;
//			 }else if(month==8) {
//				 day =31;
//			 }else if(month==9) {
//				 day =30;
//			 }else if(month==10) {
//				 day =31;
//			 }else if(month==11) {
//				 day =30;
//			 }else if(month==12) {
//				 day =31;
//			 }else {
//				 
//				
//			  
//}
			 
//			 if (month ==2) { day =28;
//			 } else if(month ==4 || month ==6 || month ==9 || month ==11) {
//	}else { }day=31;
//	
	
/*
 * switch(month) { case 2: day =28; break; case 4,6,8,11 : day =30; break;
 * default : day = 31;
 * 
 * }
 */
	
	
	
	day = switch(month) {
	case 2 -> 28;
	case 4,6,9,11 -> {
	System.out.println("하이하이");
	yield 30;
	}
	default  ->  31; 
	
};



	
			 System.out.println(month+"월은" + day + "일까지 있습니다.");
			 
	}
	
	

}
