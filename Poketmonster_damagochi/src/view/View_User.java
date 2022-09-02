package view;

import java.util.Scanner;

import controller.Controller_DAO;
import model.User_Pokemon;
import model.User_VO;
import model.story;

public class View_User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Controller_DAO dao = new Controller_DAO();
		// 유저 가입, 로그인에 따른 포켓몬 생성
		User_Pokemon userPokemon = null;
		// 유저 가입, 로그인에 따른 정보 초기화 차이
		User_VO userVO = null;
		story s = new story();

		// 메인 타이틀
		s.title();

		// 회원가입 , 로그인

		while (true) {
			System.out.print("[1]회원가입  [2]로그인 >> ");
			int menu = sc.nextInt();
			System.out.println();

			if (menu == 1) {
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
					s.choose();
				} else {
					System.out.println("등록 실패");
					System.out.println("=======================");
					System.out.println();
				}
				System.out.println();
				userPokemon = new User_Pokemon();
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
		System.out.print("===================== < 선택해주세요 > =====================");
		System.out.println();
		System.out.println();
		System.out.println("[1]사냥터 [2]체육관도전 [3]상태창 확인 [4]치료센터 [5]세이브 [6]종료");
		System.out.print("입력해주세요 : ");
		int move = sc.nextInt();
		if (move == 1) {
			System.out.println();
			System.out.print("사냥터로 이동합니다.");
			System.out.println();
			s.field();
		} else if (move == 2) {
			while (true) {
				System.out.println();
				System.out.print("[1] 첫번째 체육관 [2] 두번째 체육관");
				System.out.print("어떤 체육관에 도전하시겠습니까? : ");
				int gymchoice = sc.nextInt();
				if (gymchoice == 1) {
					System.out.println();
					s.gym1();
					break;
				} else if (gymchoice == 2) {
					System.out.println();
					s.gym2();
					break;
				} else {
					System.out.println();
					System.out.print("잘못 입력하셨습니다.");
				}
			}
		} else if (move == 3) {
			System.out.println();
			System.out.print("상태창을 출력합니다.");
		} else if (move == 4) {
			System.out.println();
			System.out.print("치료센터로 이동합니다.");
		} else if (move == 5) {
			System.out.println();
			System.out.print("현재까지 플레이 내역을 저장합니다.");
		} else if (move == 6) {
			System.out.println();
			System.out.print("게임을 종료합니다.");
		} else {
			System.out.println();
			System.out.print("잘못 입력하셨습니다!!");
		}

	}
}
