package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller_DAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_h_0830_1";
			String db_pw = "smhrd1";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (Exception e) {
			System.out.println("드라이버 연결 실패");
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("자원반납 시 오류");
			e.printStackTrace();

		}

	}

	// [회원가입]
	public int join(String id, String pw, String nick) {
		String input_null = null;
		int cnt = 0;
		try {
			getCon();
			String sql = "insert into join values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setString(4, input_null);
			
			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
//		System.out.println(cnt); ==> 0 이 나옴 행이 추가가 되지않음
		return cnt;
		
	}
	//[로그인]
	public boolean login(String id, String pw) {
		try {
			getCon();
			String sql = "select * from join where id = ? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();

			if (rs.next()) {
					return true;
				}
					return false;
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return false;
	}
	
	//가입날짜가 현재날짜일 경우 신규가입으로 => true 반환 신규가입이 아닐시 false
//	public boolean check_user(String id) {
//		getCon();
//		String sql = "select id from join where id = id and join_date = sysdate";
//		
//		return false;
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
