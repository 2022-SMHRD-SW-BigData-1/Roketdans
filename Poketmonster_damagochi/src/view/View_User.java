package view;

import java.util.Scanner;

import controller.Controller_DAO;
import model.Pokemons;
import model.User_Pokemon;
import model.User_VO;
import model.Wild_pokemon;
import model.story;

public class View_User {

	public static void main(String[] args) {
		
//		User_Pokemon up = new User_Pokemon();
//		Pokemons[] thisp = up.getPokemonsArray();
//		System.out.println(thisp[1].getPokemon_type());

		Scanner sc = new Scanner(System.in);

		Controller_DAO dao = new Controller_DAO();
		// 유저 가입, 로그인에 따른 포켓몬 생성
		User_Pokemon userPokemon = null;
		// 유저 가입, 로그인에 따른 정보 초기화 차이
		story s = new story();
		User_VO userVO = null;
		Wild_pokemon wildPokemon = null;

		// 메인 타이틀
		 s.title();

		// 회원가입 , 로그인

		while (true) {
			System.out.print("[1]회원가입  [2]로그인 >> ");
			int menu = sc.nextInt();
			System.out.println();

			if (menu == 1) {
				int choose;
				s.opening();
				System.out.println("==========등록==========");
				System.out.println();
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("nick : ");
				String nick = sc.next();

				int cnt = dao.join(id, pw, nick);
				if (cnt > 0) {
					System.out.println("등록 성공");
					System.out.println("=======================");
					System.out.println();
					choose = s.choose();
				} else {
					System.out.println("등록 실패");
					System.out.println("=======================");
					System.out.println();
				}
				System.out.println();
//				userPokemon = new User_Pokemon(choose);
				userVO = new User_VO(id, pw, nick);
				break;

			} else if (menu == 2) {
				// 로그인 기능 연결
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				boolean res = dao.login(id, pw);
				if (res == true) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				userPokemon = new User_Pokemon(id, pw);
				userVO = new User_VO(id, pw);
				break;
			}
		}
	}
}
