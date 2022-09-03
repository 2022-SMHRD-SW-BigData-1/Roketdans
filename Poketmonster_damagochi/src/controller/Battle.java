package controller;

import java.util.Random;
import java.util.Scanner;

import model.Pokemons;
import model.User_Pokemon;

public class Battle {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	image im = new image();
	User_Pokemon upo = new User_Pokemon();
	Pokemons[] arrpo = upo.getPokemonsArray();

	public Battle() {

	}

	public void vs() {
		System.out.print("[1]싸운다  [2]도망간다");
		int menu = sc.nextInt();
		if (menu == 1) {

			String name1 = arrpo[arrpo.length - 1].getPokemon_Nmae(); // 유저 포켓몬 정보
			int skill11 = arrpo[arrpo.length - 1].getBasic_attack();
			int skill12 = arrpo[arrpo.length - 1].getSkill_attack();
			int hp1 = arrpo[arrpo.length - 1].getHp();
			int ran = 0;
			while (true) {
				ran = rd.nextInt(arrpo.length);
				if (ran == 1) {
					continue;
				} else if (ran == 2) {
					continue;
				} else if (ran == 0) {
					continue;
				} else if (ran == arrpo.length - 1) {
					continue;
				} else {
					break;
				}
			}
			String name2 = arrpo[ran].getPokemon_Nmae(); // 야생 포켓몬
			int skill21 = arrpo[ran].getBasic_attack(); // 야생 포켓몬 기본데미지
			int skill22 = arrpo[ran].getSkill_attack(); // 야생 포켓몬 스킬데미지
			int hp2 = arrpo[ran].getHp();

			// 포켓몬 1 이미지
			// vs 이미지
			// 포켓몬 2 이미지
			// (랜덤 포켓몬)
			im.show(name1);
			im.show("vs");
			im.show(name2);

			String temptype1 = arrpo[arrpo.length - 1].getPokemon_type();
			String temptype2 = arrpo[ran].getPokemon_type();

			if (temptype1.equals("물")) {
				if (temptype2.equals("물")) {
				} else if (temptype2.equals("불")) {
					skill11 *= 1.2;
					skill12 *= 1.2;
					skill21 *= 0.8;
					skill22 *= 0.8;
					// 스킬데미지 tempdamage1 = *1.2
					// tempdagame2 = *0.8
				} else if (temptype2.equals("풀")) {
					skill11 *= 0.8;
					skill12 *= 0.8;
					skill21 *= 1.2;
					skill22 *= 1.2;
					// 스킬데미지 tempdamage1 = *0.8
					// tempdagame2 = *1.2
				}
			}
			if (temptype1.equals("불")) {
				if (temptype2.equals("물")) {
					skill11 *= 0.8;
					skill12 *= 0.8;
					skill21 *= 1.2;
					skill22 *= 1.2;
					// 스킬데미지 tempdamage1 = *0.8
					// tempdagame2 = *0.8
				} else if (temptype2.equals("불")) {
				} else if (temptype2.equals("풀")) {

					skill11 *= 1.2;
					skill12 *= 1.2;
					skill21 *= 0.8;
					skill22 *= 0.8;
					// 스킬데미지 tempdamage1 = *1.2
					// tempdagame2 = *1.2
				}
			}
			if (temptype1.equals("풀")) {
				if (temptype2.equals("물")) {
					skill11 *= 1.2;
					skill12 *= 1.2;
					skill21 *= 0.8;
					skill22 *= 0.8;

					// 스킬데미지 tempdamage1 = *1.2
					// tempdagame2 = *0.8
				} else if (temptype2.equals("불")) {
					skill11 *= 0.8;
					skill12 *= 0.8;
					skill21 *= 1.2;
					skill22 *= 1.2;
					// 스킬데미지 tempdamage1 = *0.8
					// tempdagame2 = *1.2
				} else if (temptype2.equals("풀")) {
				}
			}
			int count1 = 0; // 포켓몬 1의 두번째 스킬 제한
			int count2 = 0; // 포켓몬 2의 두번째 스킬 제한
			while (true) {
				// 포켓몬 2 hp - ( 그 포켓몬의 스킬 데미지 ) 불 물 풀
				System.out.print("[1]몸통 박치기  [2]???포켓몬 스킬 [3]도망간다");
				int menu1 = sc.nextInt();
				if (menu1 == 1) {
					hp2 -= skill11;
					System.out.println(name1 + "의피 : " + hp1);
					System.out.println(name2 + "의피 : " + hp2);
					if (hp2 < 0) {
						im.show("승리");
						win(hp1);
						break;
					}
					// 포켓몬2 의 hp - ( 포켓몬 1 임시 스킬데미지 )
					// 포켓몬 2의 hp 0되면 승리 !! (break)
				} else if (menu1 == 2) {
					if (count1 < 1) {
						System.out.println("스킬을 사용할수 없습니다");
						continue;
					}
					hp2 -= skill12;
					skillname(arrpo.length - 1);
					System.out.println(name1 + "의피 : " + hp1);
					System.out.println(name2 + "의피 : " + hp2);
					if (hp2 < 0) {
						im.show("승리");
						win(hp1);
						break;
					}
					// 포켓몬2 의 hp - ( 포켓몬 1 임시 스킬데미지 )
					count1++;

				} else if (menu1 == 3) {
					System.out.println("도망간다");
					break;
				}
				while (true) {
					menu1 = rd.nextInt(2) + 1;
					if (menu1 == 1) {
						hp1 -= skill21;
						System.out.println(name1 + "의피 : " + hp1);
						System.out.println(name2 + "의피 : " + hp2);
						if (hp1 < 0) {
							im.show("패배");
							lose();
							break;
						}
						// 포켓몬1 의 hp - ( 포켓몬 2 임시 스킬데미지 )
						// 포켓몬 1의 hp 0되면 패배 !!(break)
					} else if (menu1 == 2) {
						if (count2 < 1) {
							System.out.println("스킬을 사용할수 없습니다");
							continue;
						}
						count2++;
						hp1 -= skill22;
						skillname(ran);
						System.out.println(name1 + "의피 : " + hp1);
						System.out.println(name2 + "의피 : " + hp2);
						if (hp1 < 0) { // 포켓몬1 의 hp - ( 포켓몬 2 임시 스킬데미지 )
							im.show("패배"); // 포켓몬1의 hp 0되면 패배 !!(break)
							lose();
							break;
						}
					}
					break; // 야생포켓몬 턴 종료
				}
			}
		}
	}

	public void skillname(int a) {
		System.out.println(arrpo[a].getPokemonSkillName() + "!!!");
	}

	public void win(int hp) {
		int exp = arrpo[arrpo.length - 1].getExp();
		int level = arrpo[arrpo.length - 1].getLevel();
		if (exp >= 2) {
			arrpo[arrpo.length - 1].setLevel(level + 1);
			arrpo[arrpo.length - 1].setExp(0);
		}
		arrpo[arrpo.length - 1].setHp(hp);
	}

	public void lose() {
		arrpo[arrpo.length - 1].setExp(0);
		arrpo[arrpo.length - 1].setHp(0);
	}

	public void status() {
		
		System.out.println(arrpo[arrpo.length - 1].getPokemon_Nmae());
		System.out.println(arrpo[arrpo.length - 1].getPokemon_type());
		System.out.println(arrpo[arrpo.length - 1].getPokemonSkillName());
		System.out.println(arrpo[arrpo.length - 1].getLevel());
		System.out.println(arrpo[arrpo.length - 1].getMax_hp());
		System.out.println(arrpo[arrpo.length - 1].getHp());
		System.out.println(arrpo[arrpo.length - 1].getExp());
	}

}
