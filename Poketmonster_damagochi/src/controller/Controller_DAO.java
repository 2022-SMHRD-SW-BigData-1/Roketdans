package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Pokemons;
import model.User_Pokemon;

public class Controller_DAO {
	// 저장할 포켓몬 객체 선언
	User_Pokemon up = new User_Pokemon();
	Pokemons[] update_pk = null;
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
			System.out.println("회원가입 실패");
		} finally {
			close();
		}
//		System.out.println(cnt); ==> 0 이 나옴 행이 추가가 되지않음
		return cnt;

	}

	// [로그인]
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

	// 포켓몬 정보 저장
	public void save(Pokemons[] pokemon, String user_id) {
		update_pk = pokemon;
		Bgmplayer bgm = new Bgmplayer();
		bgm.play("저장");
		try {
			
			getCon();
			String sql = "update poke set poke_name = ?, skill_name =? , level_ = ?, max_hp = ?, hp = ?, exp = ? where id = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, update_pk[update_pk.length - 1].getPokemon_Nmae());
			psmt.setString(2, update_pk[update_pk.length - 1].getPokemonSkillName());
			psmt.setInt(3, update_pk[update_pk.length - 1].getLevel());
			psmt.setInt(4, update_pk[update_pk.length - 1].getMax_hp());
			psmt.setInt(5, update_pk[update_pk.length - 1].getHp());
			psmt.setInt(6, update_pk[update_pk.length - 1].getExp());
			psmt.setString(7, user_id);

			int result = psmt.executeUpdate();
			if (!(result > 0)) {
				System.out.println("삽입 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void joininsert(Pokemons[] pokemon, int choose, String id) {
		try {
			update_pk = pokemon;
			choose-=1;
			getCon();
			String sql = "insert into poke values(?,?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, update_pk[choose].getPokemon_Nmae());
			psmt.setString(3, update_pk[choose].getPokemonSkillName());
			psmt.setInt(4, update_pk[choose].getLevel());
			psmt.setString(5, update_pk[choose].getPokemon_type());
			psmt.setInt(6, update_pk[choose].getMax_hp());
			psmt.setInt(7, update_pk[choose].getHp());
			psmt.setInt(8, update_pk[choose].getExp());

			int row = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void call_Pokemon(Pokemons[] pokemon, String user_id) {
		update_pk = pokemon;
		try {
			getCon();
			String sql = "select poke_name, skill_name, level_,types, max_hp, hp, exp from poke where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user_id);
			// sql문에 나온 결과물 rs에 담기
			rs = psmt.executeQuery();

			String pokemon_name = null;
			String skill_name = null;
			int level = 0;
			String type=null;
			int max_hp = 0;
			int hp = 0;
			int exp = 0;
			while (rs.next()) {
				// 해당 결과 변수에 담기
				pokemon_name = rs.getString(1);
				skill_name = rs.getString(2);
				level = rs.getInt(3);
				type = rs.getString(4);
				max_hp = rs.getInt(5);
				hp = rs.getInt(6);
				exp = rs.getInt(7);
			}
			// 로그인 시 해당 유저 포켓몬 정보 불러오기
			update_pk[update_pk.length - 1].setPokemon_Nmae(pokemon_name);
			update_pk[update_pk.length - 1].setPokemonSkillName(skill_name);
			update_pk[update_pk.length - 1].setLevel(level);
			update_pk[update_pk.length - 1].setPokemon_type(type);
			update_pk[update_pk.length - 1].setMax_hp(max_hp);
			update_pk[update_pk.length - 1].setHp(hp);
			update_pk[update_pk.length - 1].setExp(exp);

		} catch (SQLException e) {
			System.out.println("로그인 실패");
		}

	}

	// 로그인 시 포켓몬 정보 꺼내기
	// 유저 아이디 비밀번호를 받아
	// poke라는 테이블에서 아이디와 비밀번호가 일치
//	public int[] return_pokemon(String user_id, String user_pw) {

//	}
}