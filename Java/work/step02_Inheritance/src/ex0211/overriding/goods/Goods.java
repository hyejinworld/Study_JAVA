package ex0211.overriding.goods;
/**
  ?????¼ë? ???±ì?? ê´?ë¦¬í???? ê°?ì²?
*/
public class Goods{
	private String code; //????ì½??? null
	private String name;//?????´ë?  null
	private int price;//ê°?ê²? 0 
	private String explain;//?¤ë? null
	
	
	

  	public Goods() {
    }


    public Goods(String code, String name, int price, String explain) {
       // this.code = code;
    	this(code, price, explain);
        this.name = name;
//        this.price = price;
//        this.explain = explain;
    }


	
	public Goods(String code, int price, String explain) {
	
		this.code = code;
        this.price = price;
        this.explain = explain;
	}


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	
	
}