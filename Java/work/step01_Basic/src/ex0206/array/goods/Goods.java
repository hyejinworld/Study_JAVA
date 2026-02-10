package ex0206.array.goods;

/**
 * 상품 정보를 관리하는 클래스
 */
public class Goods {

    private String code;    // 상품코드
    private String name;    // 상품이름
    private int price;      // 가격
    private String explain; // 설명

    // 기본 생성자
    public Goods() {}

    // 모든 필드를 초기화하는 생성자 (선택사항이지만 있으면 좋음)
    public Goods(String code, String name, int price, String explain) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    // setter
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    // getter
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }

    public String toString() {
        return "상품코드: " + code +
               ", 상품명: " + name +
               ", 가격: " + price +
               ", 설명: " + explain;
    }
}
