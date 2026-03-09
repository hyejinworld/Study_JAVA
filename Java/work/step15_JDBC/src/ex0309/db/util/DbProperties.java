package ex0309.db.util;

//db설정 정보를 상수로 관리
public interface DbProperties {
	
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/ex0304";
	String USER_ID = "root";
	String USER_PASS = "admin";
	

}
