package ex0211.overriding.goods;
/**
  ??ì²? ê²°ê³¼ë¥? ì¶??¥í?? view
*/
public class EndView{
   /**
     ?±ê³µ?¬ë? ë©???ì§?ë¥? ì¶??¥í???? ë©????? 
   */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
     ??ì²´ê??? ê²°ê³¼ë¥? ì¶??¥í???? ë©?????
   */
   public static void printSelectAll(Goods [] arr){//service?? ???? ì£¼ì??ê°? ???¬ë??????.
	   //System.out.println("arr = " + arr);
      System.out.println("*******???? LIST ("+GoodsService.count+")ê°? ************");
   
       //??ë³? ì¶???
	   for(int i=0; i < GoodsService.count ; i++){
             System.out.println( arr[i].getCode() +" | " + arr[i].getName()  +" | "
		                  + arr[i].getPrice() +" | " + arr[i].getExplain() );
		   
		  // System.out.println("test....");
             
	   }

		   System.out.println();

   }

   /**
     ????ì½????? ?´ë?¹í???? ???¸ì??ë³? ì¶??¥í???? ë©????? 
   */
   public static void printSelectByCode(Goods goods){//ì£¼ì??????
      System.out.println("******" + goods.getCode() +"?? ???¸ë³´ê¸? *****");
      System.out.println(  goods.getName()  +" | " + goods.getPrice() +" | " + goods.getExplain() );
   
   }



}








