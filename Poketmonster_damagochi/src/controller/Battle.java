package controller;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	image im = new image();

	public Battle() {

	}

	public void vs() {
		int hp = 100;
		System.out.print("[1]싸운다  [2]도망간다");
		int menu = sc.nextInt();
		if (menu == 1) {

			// 포켓몬 1 이미지
			// vs 이미지
			// 포켓몬 2 이미지
			// (랜덤 포켓몬)
//	for(int i = 0; i< 유저 포켓몬(배열); i++) {
//		if(포켓몬 배열아이디  = temp_id) {
//			String image ="포켓몬 배열. 포켓몬이름";
//					im.("꼬부기");
//		} 
//	
			

			int tempdamage1; // 포켓몬 1 스킬1 데미지
			int tempdamage11; // 포켓몬 1 스킬2 데미지

			int tempdamage2; // 포켓몬 2 스킬1 데미지
			int tempdamage22; // 포켓몬 2 스킬2 데미지
			String temptype1 = "물";
			String temptype2 = "불"; /// --->>>> 속성별 임시 스킬데미지 설정

			if (temptype1.equals("물타입")) {
				if (temptype2.equals("물타입")) {
				} else if (temptype2.equals("불타입")) {
					// 스킬데미지 tempdamage1 = *1.2
					// tempdagame2 = *0.8
				} else if (temptype2.equals("풀타입")) {
					// 스킬데미지 tempdamage1 = *0.8
					// tempdagame2 = *1.2
				}
			}
			if (temptype1.equals("불타입")) {
				if (temptype2.equals("물타입")) {
					// 스킬데미지 tempdamage1 = *0.8
					// tempdagame2 = *1.2
				} else if (temptype2.equals("불타입")) {
				} else if (temptype2.equals("풀타입")) {
					// 스킬데미지 tempdamage1 = *1.2
					// tempdagame2 = *0.8
				}
			}
			if (temptype1.equals("풀타입")) {
				if (temptype2.equals("물타입")) {
					// 스킬데미지 tempdamage1 = *1.2
					// tempdagame2 = *0.8
				} else if (temptype2.equals("불타입")) {
					// 스킬데미지 tempdamage1 = *0.8
					// tempdagame2 = *1.2
				} else if (temptype2.equals("풀타입")) {
				}
			}
			int count1 = 0; // 포켓몬 1의 두번째 스킬 제한
			int count2 = 0; // 포켓몬 2의 두번째 스킬 제한
			while (true) {
				// 포켓몬 2 hp - ( 그 포켓몬의 스킬 데미지 ) 불 물 풀
				System.out.print("[1]몸통 박치기  [2]???포켓몬 스킬 [3]도망간다");
				int menu1 = sc.nextInt();
				if (menu1 == 1) {
					// 포켓몬2 의 hp - ( 포켓몬 1 임시 스킬데미지 )
					// 포켓몬 2의 hp 0되면 승리 !! (break)
				} else if (menu1 == 2) {
					if (count1 < 1) {
						System.out.println("스킬을 사용할수 없습니다");
						continue;
					}
					// 포켓몬2 의 hp - ( 포켓몬 1 임시 스킬데미지 )
					count1++;

					// 포켓몬 2의 hp 0되면 승리 !!
				} else if (menu1 == 3) {
					System.out.println("도망간다");
				}
				menu1 = rd.nextInt(2) + 1;
				if (menu1 == 1) {
					// 포켓몬1 의 hp - ( 포켓몬 2 임시 스킬데미지 )
					// 포켓몬 1의 hp 0되면 패배 !!(break)
				} else if (menu1 == 2) {
					// 포켓몬1 의 hp - ( 포켓몬 2 임시 스킬데미지 )
					// 포켓몬1의 hp 0되면 패배 !!(break)

					if (count2 < 1) {
						System.out.println("스킬을 사용할수 없습니다");
						continue;
					}
					// 포켓몬1 의 hp - ( 포켓몬 2 임시 스킬데미지 )
					count1++;
					// 포켓몬 2의 hp 0되면 승리 !!

				}

			}
		}
	}

}
