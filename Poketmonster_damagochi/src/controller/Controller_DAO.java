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
	
	// 포켓몬 정보 저장le, i
	public void save(int id, int now_hp, int now_levnt now_exp) {
		try {
			getCon();
			String sql = "update poke set (hp,level,exp)=(?,?,?) where id = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, now_exp);
			psmt.setInt(2, now_levle);
			psmt.setInt(3, now_exp);
			psmt.setInt(4, id);
			
			int result = psmt.executeUpdate();
			if(!(result>0)) {
				System.out.println("삽입 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	// 로그인 시 포켓몬 정보 꺼내기
	// 유저 아이디 비밀번호를 받아 
	//poke라는 테이블에서 아이디와 비밀번호가 일치 
//	public int[] return_pokemon(String user_id, String user_pw) {
		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
