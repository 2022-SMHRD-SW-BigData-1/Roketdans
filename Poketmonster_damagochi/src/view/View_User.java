package view;

import java.util.Scanner;
import controller.Battle;
import controller.Controller_DAO;
import model.Pokemons;
import model.User_Pokemon;
import model.User_VO;
import model.story;

public class View_User {
	public static void main(String[] args) {

		User_Pokemon up = new User_Pokemon();
		Pokemons[] first_pokemon = up.getPokemonsArray();
		Battle battle = new Battle(first_pokemon);
		Scanner sc = new Scanner(System.in);
		Controller_DAO dao = new Controller_DAO();
		// 유저 가입, 로그인에 따른 포켓몬 생성
		User_Pokemon userPokemon = null;
		// 유저 가입, 로그인에 따른 정보 초기화 차이
		story s = new story();
		User_VO userVO = null;
		// 메인 타이틀
		s.title();
		// 회원가입 , 로그인
		System.out.print("[1]회원가입  [2]로그인 >> ");
		int menu = sc.nextInt();
		System.out.println();
		if (menu == 1) {
			s.opening();
			while (true) {
				int choose;
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
					System.out.println("\n");
					userVO = new User_VO(id, pw, nick);
					choose = s.choose();
					battle.arrinsert(first_pokemon, choose); // 선택한 포켓몬 배열 저장
					s.Menu();
					break;
				} else {
					System.out.println("등록 실패");
					System.out.println("=======================");
					System.out.println("/n");
				}
			}
		}while(true){ 
		if (menu == 2) {
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			boolean res = dao.login(id, pw);
			if (res == true) {
				// call_Pokemon 메소드 사용시 포켓몬 담긴 배열 마지막에 유저의 포켓몬 저장
				userVO = new User_VO(id, pw);
				dao.call_Pokemon(first_pokemon, userVO.getId());
				System.out.println("로그인 성공");
				System.out.println("\n");
				s.Menu();
			} else {
				System.out.println("로그인 실패");
				System.out.println("\n");
			}

		}
		}
	}
}
