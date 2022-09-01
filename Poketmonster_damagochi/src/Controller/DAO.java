package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DAO {

	Connection conn = null;
	Scanner sc = new Scanner(System.in);
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void getCon() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_h_0830_1";
			String db_pw = "smhrd1";

			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("접속 성공");
			} else {
				System.out.println("접속 실패");
			}
			String sql = " create table Poke (poke_name varchar2(20),skill_name varchar2(20),max_hp number(10) not null,hp number(10),level_ number(10) default 1,exp number(10) default 0,max_exp number(10) not null,type varchar2(20),constraint Poke_name_pk primary key(poke_name),constraint Poke_type check(type in ('물타입','불타입','풀타입')))";

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
