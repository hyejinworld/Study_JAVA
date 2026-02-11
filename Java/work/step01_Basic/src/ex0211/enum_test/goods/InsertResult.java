package ex0211.enum_test.goods;

public enum InsertResult {

	//상품 코드 중복되었을때
	INSERT_DUPLICATE,
	
	//배열의 길이를 벗어났을때

	INSERT_OUTINDEX,
	
	//등록이 성공했을때
	INSERT_SUCCESS;
}
