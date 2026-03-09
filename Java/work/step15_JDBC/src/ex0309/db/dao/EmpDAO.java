package ex0309.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ex0309.db.util.DbManager;
import ex0309.dto.Emp;

public class EmpDAO {
	
	//사원의 이름 검색하는 SQL 
	
	public void getSelectNames() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		//로드 연결 실행 닫기
	  try {
		con = DbManager.getConnection();
	    // 연결 성공
		st = con.createStatement();
		rs = st.executeQuery("select ename, sal from emp");
		while(rs.next()) {
			//열을 조회 
		String ename =rs.getString(1);
		int sal = rs.getInt(2);
		
		System.out.println(ename + "|"+ sal);
		}
		System.out.println("-----------조회완료 test-------------");
		
	  } catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.dbClose(con, st, rs);
	}
	  
	}
	//사원등록 
	//insert into emp(empno, ename, sal, hiredate)  values(9000, '훈', 2500, now()); 
	
/*	public void insert(Emp emp ) {
		Connection con = null;
		Statement st = null;
		 //인터페이스에는 d가 있고 앞에 대문자
		String sql="insert into emp(empno, ename, sal, hiredate) "
				+ "values("+ emp.getEmpno() +",'"
		+emp.getEname()+"',"
		+emp.getSal()+", now())";
	
	
		
		try {
			 con = DbManager.getConnection();
			
			 
			 st = con.createStatement();
			 int re = st.executeUpdate(sql);
			 
			 System.out.println("re=" + re);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con,st);
			
		}
		
	}
	*/
	// preparedStatement 방식 
	public void preParedinsert(Emp emp ) {
		Connection con = null;
	
		PreparedStatement ps = null;
		String sql="insert into emp(empno, ename, sal, hiredate) values(?,?,?,now())";
	
	
		
		try {
			 con = DbManager.getConnection();
			 ps = con.prepareStatement(sql); // 메소드에는 d가 없다. (쿼리문)이 들어온다
			 //?의 순서대로 개수만큼 setXxx 필요하다
			 ps.setInt(1, emp.getEmpno());
			 ps.setString(2, emp.getEname());
			 ps.setInt(3, emp.getSal());
			 //? 순서대로 이걸 넣어줘야한다.  public void preParedinsert(Emp emp )여기 emp 에서 GET 꺼내는거고 SET 넣어주는거다
			 
			 
			 int re = ps.executeUpdate();
			
			 
			 System.out.println("re=" + re);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con,ps);
			
		}
		
	}
	
	//사원전체 검색하기 
	//select empno, ename, sal, hiredate from emp;
	
	
	public List<Emp> selectAll(){
		  Connection con = null;
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  String sql = "select empno, ename, sal, hiredate from emp";
		    List<Emp> list = new ArrayList<>();
		    //로드 연결 get connction으로 연결  실행 닫기 
		    try {
		        con = DbManager.getConnection();
		        ps = con.prepareStatement(sql); //미리 문장을 만든다 . sql안넣어준다. 자바는 이걸 받을 수 있는 resultset으로 받는다.
		        rs = ps.executeQuery(); //result으로 받는다. 
		        
		        while (rs.next()) { //커서가 내려갈 동안 돌아라 앞으로이동시킨다. 
		        	
		        	//열을 조회한다.
		            int empno = rs.getInt("empno");
		            String ename = rs.getString("ename");
		            int sal = rs.getInt("sal");
		            String hiredate = rs.getString("hiredate");
		            Emp emp = new Emp(empno, ename, sal, hiredate);
		            list.add(emp);
		        }
		        
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        DbManager.dbClose(con, ps, rs);
		    }
		    
		    return list;
		/////
		
//		Connection con = null;
//		PreparedStatement ps = null;
//		String sql = "select * from emp";
//		
//		try {
//			 con = DbManager.getConnection();
//			 ps = con.prepareStatement(sql); 
//	
//			 int re = ps.executeUpdate(sql);
//			 
//			 System.out.println("re=" + re);
//		}catch(Exception e){
//			e.printStackTrace();
//			
//		}finally {
//			DbManager.dbClose(con,ps);
//			
//		}
//		
//		return selectAll();
	}
	
	//사원번호에 해당하는 사원보기 사원정보 있거나 없거나 emㅔ 
	//select empno, ename, sal, hiredate from emp where empno=9000  //9000번호에 해당하는 사람한명 
	public Emp selectByEmp(int empno) {
		  
		Connection con = null;
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  
//		  String sql = "select empno, ename, sal, hiredate from emp where empno=?";
		  String sql = "select empno, ename, sal, hiredate from emp where empno=?";
		  
//		  Emp emp = new Emp();
		  Emp emp = null;
		 
		  try {
			  con = DbManager.getConnection();
		        ps = con.prepareStatement(sql);
		        
		        //?에 값전달
		        ps.setInt(1,empno);
		        rs = ps.executeQuery();
		        
	        if(rs.next()) {
	        	empno = rs.getInt("empno");
	        	 String ename = rs.getString("ename");
		            int sal = rs.getInt("sal");
		            String hiredate = rs.getString("hiredate");
		            
		            emp = new Emp(empno, ename, sal, hiredate);
		            System.out.println(emp);
		            
	        }
			
		
	  } catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.dbClose(con,ps,rs);
	}
		  
		  return emp;
		
	}
	
	//사원삭제
	//delete from emp where empno=?
	//0 실패 1 성공, dao에서는 int로 데이터타입 결정
	public int deleteByEmp(int empno) {
		Connection con = null;
		  PreparedStatement ps = null;
		 // ResultSet rs = null; delete까  ㅍ쓰지 않는다.
		  int result =0;
		  String sql = "delete from emp where empno=?";
		  
		  try {
			  con = DbManager.getConnection();
			  ps = con.prepareStatement(sql);
			  
			  //?순서대로 개수만큼필요하다
			  ps.setInt(1, empno);

			  result = ps.executeUpdate();
			  
		} catch (Exception e) {
			
		}finally {
			DbManager.dbClose(con,ps);
		}
		
		return result;
	}

}
