package view;
import java.util.Scanner;

import controller.Controller_DAO;
import model.User_Pokemon;

public class View_User {

	public static void main(String[] args) {
//=========================================================================================================	
//	로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 
//=========================================================================================================	
		Scanner sc = new Scanner(System.in);

		Controller_DAO dao = new Controller_DAO();
		
		User_Pokemon userPokemon = null;
		
		while (true) {
			System.out.print("[1]회원가입  [2]로그인>>");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("==========등록==========");
				System.out.println("ID : ");
				String id = sc.next();
				System.out.println("PW : ");
				String pw = sc.next();
				System.out.println("nick : ");
				String nick = sc.next();
				
				int cnt = dao.join(id, pw, nick);
				if (cnt > 0) {
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}
				userPokemon = new User_Pokemon(id);
				
			} else if (menu == 2) {
				// 로그인 기능 연결
				System.out.println("ID : ");
				String id = sc.next();
				System.out.println("PW : ");
				String pw = sc.next();
				boolean res = dao.login(id, pw);
				if (res == true) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}

			}
		}
//=========================================================================================================	
//	로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 로그인 
//=========================================================================================================	

	}
}

