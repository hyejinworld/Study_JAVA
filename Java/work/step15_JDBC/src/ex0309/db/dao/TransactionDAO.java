package ex0309.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ex0309.db.util.DbManager;

public class TransactionDAO {
	  /**
	   * 계좌이체 기능 구현
	   * */
	public void transfer(String inputAccount, String outputAccount, int money) { //출금 output , 입금 input
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DbManager.getConnection();
			//connection얻어와서 오토커밋 해지 
			//auto commit 을 해지한다. 
			con.setAutoCommit(false); //오토커밋을 해제한다. 
			
			//출금하기 
			int result = this.withdraw(con, outputAccount, money);
			if(result ==0) throw new SQLException("출금계좌 오류로 계좌이체 실패하였습니다");
			//else
			
			
			//입금하기 
			//this.deposit(con, inputAccount, money);
			
		    result = this.deposit(con, inputAccount, money);
			if(result ==0) throw new SQLException("입금계좌 오류로 계좌이체 실패하였습니다");
			
			if(this.balanceCheck(con, inputAccount)) {
				throw new SQLException("입금계좌 총 금액 초과로 계좌이체 실패하였습니다");
			}
			
			//모두 성공하면
			System.out.println("계좌 이체 완료되었습니다");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			try {
			con.rollback();
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
		}finally {
			try {
				
				con.commit(); //저장완료 
			} catch (Exception e) {
				e.printStackTrace();
			}
			DbManager.dbClose(con, null);
			
		}
		
		//인출하기 하고 입금하고 잔액확인
	}
	
	//잔액확인하기
	
	
	/*출금하기*/
	public int withdraw(Connection con, String outputAccount, int money)throws SQLException {
		int result = 0;
		PreparedStatement ps  = null;
		String sql ="update bank set balance = balance-? where account =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, outputAccount);
			
			result = ps.executeUpdate();
		} finally {
			DbManager.dbClose(null, ps); // null이면 일을 안한다. 
		}
		return result;
		
		
	}
	
	/*입금하기*/
	public int deposit(Connection con,String inputAccount, int money)throws SQLException {
		int result = 0;
		PreparedStatement ps  = null;
		String sql ="update bank set balance = balance+? where account =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, inputAccount);
			
			result = ps.executeUpdate();
		} finally {
			DbManager.dbClose(null, ps); // null이면 일을 안한다. 
		}
		return result;
		
		
	}

	public boolean balanceCheck(Connection con, String inputAccount )throws SQLException{
		boolean result = false;
		PreparedStatement ps  = null;
		ResultSet rs = null;
		String sql ="select balance from bank where account=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, inputAccount);
			//setString(2, inputAccount);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				int balance = rs.getInt(1);
				if(balance >1000) result = true;
			}
		} finally {
			DbManager.dbClose(null, ps, rs); // null이면 일을 안한다. 
		}
		return result;
}
	
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("-1. 출금계좌 오류-----");
		//dao.transfer("A02", "A05",200);//입금, 출금, 금액
		
		System.out.println("--2. 입금계좌 오류----");
		//dao.transfer("A04", "A01",200);//입금, 출금, 금액
		
		
		System.out.println("--3. 입금계좌의 총액 1000원 이상인경우-----");
		//dao.transfer("A02", "A01",700);//입금, 출금, 금액
		
		System.out.println("--4. 성공----------");
		dao.transfer("A02", "A01",100);//입금, 출금, 금액
	}
}











