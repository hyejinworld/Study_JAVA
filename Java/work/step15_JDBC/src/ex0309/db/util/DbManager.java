package ex0309.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
	//db연동을 위한 로드 / 연결 / 닫기
	
	//로드
	static {
		try {
			Class.forName(DbProperties.DRIVER_NAME); //mysql driver를 찾는다. 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	//연결
	public static Connection getConnection() throws SQLException{
		//Connection con = 
	return DriverManager.getConnection
			(DbProperties.URL, 
			DbProperties.USER_ID, 
			DbProperties.USER_PASS); //상수들로 만든다.
		
	}
	//닫기
	
	//select 전용
	public static void dbClose(Connection con, Statement st, ResultSet rs) {
	try {
		if (rs!=null)rs.close();
		dbClose(con, st);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 //닫기할때 null이 아닐때 close를 해라 가장 마지막에 했던걸 먼저 닫는다
		//던지면 안된다 try catch로 묶는다.
		
		
	}
	
	// insert update, delete 전용
	public static void dbClose(Connection con, Statement st){
		try {
			if (st!=null) st.close();
			if (con!=null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	}
	

}
