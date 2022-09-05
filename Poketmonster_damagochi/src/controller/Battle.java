package controller;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import model.Pokemons;
import model.User_Pokemon;

public class Battle {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	image im = new image();
	User_Pokemon up = new User_Pokemon();
	Pokemons[] update_pk = null;
	

	public Battle(Pokemons[] pokemon) {
		update_pk = pokemon;
	}

	public void vs(Pokemons[] pokemon) {
		Bgmplayer bgm = new Bgmplayer();
		bgm.play("타격");
		System.out.println("\n");
		System.out.print("[1]싸운다  [2]도망간다");
		System.out.println("\n");
		System.out.print("입력해주세요 : ");
		int menu = sc.nextInt();
		update_pk = pokemon;
		if (menu == 1) {
			String name1 = update_pk[update_pk.length - 1].getPokemon_Nmae(); // 유저 포켓몬 정보
			int skill11 = update_pk[update_pk.length - 1].getBasic_attack();
			int skill12 = update_pk[update_pk.length - 1].getSkill_attack();
			String skillname1 = update_pk[update_pk.length - 1].getPokemonSkillName();
			int hp1 = update_pk[update_pk.length - 1].getHp();
			int ran = 0;
			while (true) {
				ran = rd.nextInt(update_pk.length - 1);
				if (ran == 1) {
					continue;
				} else if (ran == 2) {
					continue;
				} else if (ran == 0) {
					continue;
				} else if (ran == update_pk.length - 1) {
					continue;
				} else {
					break;
				}
			}
			int temp = update_pk[update_pk.length - 1].getLevel();
			update_pk[ran].setLevel(rd.nextInt(3) + temp - 1);       // 야생포켓몬 스텟 설정 
			int level23=update_pk[ran].getLevel();
			update_pk[ran].setMax_hp(level23*8+(rd.nextInt(3)+1));
			update_pk[ran].setBasic_attack(level23+1);
			update_pk[ran].setSkill_attack(level23*2);
			
			
			String name2 = update_pk[ran].getPokemon_Nmae(); // 야생 포켓몬
			int skill21 = update_pk[ran].getBasic_attack(); // 야생 포켓몬 기본데미지
			int skill22 = update_pk[ran].getSkill_attack(); // 야생 포켓몬 스킬데미지
			String skillname2 = update_pk[ran].getPokemonSkillName();
			int hp2 = update_pk[ran].getMax_hp();
			
			im.show("vs");
			im.show(name2);
			System.out.println();
			System.out.println();
			System.out.println(name2 + "의 LEVEL : " + level23);
			String temptype1 = update_pk[update_pk.length - 1].getPokemon_type();
			String temptype2 = update_pk[ran].getPokemon_type();
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
					skill21 *= 1.2;
					skill22 *= 1.2;
					// 스킬데미지 tempdamage1 = *0.8
					// tempdagame2 = *1.2
				}
			}
			if (temptype1.equals("불")) {
				if (temptype2.equals("물")) {
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
				System.out.println("\n");
				System.out.print("[1]몸통 박치기  [2]" + skillname1 + "  [3]도망간다");
				System.out.println("\n");
				System.out.print("입력해주세요 : ");
				int menu1 = sc.nextInt();
				if (menu1 == 1) {
					
					bgm.play("타격");
					System.out.println("========================");
					System.out.println("\n");
					System.out.println(name1 + "몸통 박치기 !!!!");
					System.out.println(name1 + "의피 : " + hp1);
					System.out.print(name2 + "의피 : " + hp2);
					hp2 -= skill11;
					System.out.println(" -- > "+hp2);
					System.out.println("\n");
					System.out.println("========================");
					bgm.stop();
					if (hp2 <= 0) {
						im.show("승리");
						System.out.println("\n");
						win(update_pk, hp1);
						break;
					}
					// 포켓몬2 의 hp - ( 포켓몬 1 임시 스킬데미지 )
					// 포켓몬 2의 hp 0되면 승리 !! (break)
				} else if (menu1 == 2) {
					if (count1 >= 1) {
						System.out.println("스킬을 사용할수 없습니다");
						continue;
					}
					
					bgm.play("타격");
					System.out.println("========================");
					System.out.println("\n");
					System.out.println(name1 + "!!  " + skillname1 + "!!");
					System.out.println(name1 + "의피 : " + hp1);
					System.out.print(name2 + "의피 : " + hp2);
					hp2 -= skill12;
					System.out.println(" -- > "+hp2);
					System.out.println("\n");
					System.out.println("========================");
					bgm.stop();
					if (hp2 <= 0) {
						im.show("승리");
						win(update_pk, hp1);
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
						System.out.println("\n");
						System.out.println("========================");
						System.out.println("\n");
						System.out.println(name2 + " 몸통 박치기");
						System.out.print(name1 + "의피 : " + hp1);
						hp1 -= skill21;
						System.out.println(" -- > "+hp1);
						System.out.println(name2 + "의피 : " + hp2);
						System.out.println("\n");
						System.out.println("========================");
						if (hp1 <= 0) {
							im.show("패배");
							System.out.println("\n");
							lose(update_pk);
							break;
						}
						// 포켓몬1 의 hp - ( 포켓몬 2 임시 스킬데미지 )
						// 포켓몬 1의 hp 0되면 패배 !!(break)
					} else if (menu1 == 2) {
						if (count2 >= 1) {
							continue;
						}
						count2++;
						System.out.println("\n");
						System.out.println("========================");
						System.out.println("\n");
						System.out.println(name2 + "의 " + skillname2);
						System.out.print(name1 + "의피 : " + hp1);
						hp1 -= skill22;
						System.out.println(" -- > "+hp2);
						System.out.println(name2 + "의피 : " + hp2);
						System.out.println("\n");
						System.out.println("========================");
						if (hp1 <= 0) { // 포켓몬1 의 hp - ( 포켓몬 2 임시 스킬데미지 )
							im.show("패배"); // 포켓몬1의 hp 0되면 패배 !!(break)
							lose(update_pk);
							break;
						}
					}
					break; // 야생포켓몬 턴 종료
				}
				if (hp1 <= 0 || hp2 <= 0) {
					break;
				} //

			}
		}
	}

	public void skillname(Pokemons[] pokemon, int a) {
		update_pk = pokemon;
		System.out.println(update_pk[a].getPokemonSkillName() + "!!!");
	}

	public void win(Pokemons[] pokemon, int hp) {
		update_pk = pokemon;
		Bgmplayer bgm = new Bgmplayer();
		bgm.play("레벨업");
		int exp = update_pk[update_pk.length - 1].getExp();
		int level = update_pk[update_pk.length - 1].getLevel();
		update_pk[update_pk.length - 1].setExp(exp + 1);
		exp = update_pk[update_pk.length - 1].getExp();
		if (exp >=1) {
			if(level<5) {
			level ++;
			update_pk[update_pk.length - 1].setLevel(level );
			update_pk[update_pk.length - 1].setMax_hp((level)*12+(rd.nextInt(3)+1));
			update_pk[update_pk.length - 1].setBasic_attack(level+3);
			update_pk[update_pk.length - 1].setSkill_attack(level*2);
			update_pk[update_pk.length - 1].setExp(0);
			int lev = update_pk[update_pk.length - 1].getLevel();
			System.out.println("축하 합니다 !!  " +"레벨 : "+ lev + "달성 !!");}
		}
		update_pk[update_pk.length - 1].setHp(hp);
	}

	public void lose(Pokemons[] pokemon) {
		Bgmplayer bgm = new Bgmplayer();
		bgm.play("패배");
		update_pk = pokemon;
		update_pk[update_pk.length - 1].setExp(0);
		update_pk[update_pk.length - 1].setHp(0);
		System.out.println("패널티로 경험치가 초기화 됩니다.");
	}

	public void status(Pokemons[] pokemon) {
		update_pk = pokemon;
		String na = update_pk[update_pk.length - 1].getPokemon_Nmae();
		im.show(na);
		System.out.println("포켓몬 이름 : " + update_pk[update_pk.length - 1].getPokemon_Nmae());
		System.out.println("타입 : " + update_pk[update_pk.length - 1].getPokemon_type());
		System.out.println("스킬명 : " + update_pk[update_pk.length - 1].getPokemonSkillName());
		System.out.println("LEVEL : " + update_pk[update_pk.length - 1].getLevel());
		System.out.println("최대 체력 : " + update_pk[update_pk.length - 1].getMax_hp());
		System.out.println("현재 체력 : " + update_pk[update_pk.length - 1].getHp());
		System.out.println("EXP : " + update_pk[update_pk.length - 1].getExp());
	}
	public void endheal(Pokemons[] pokemon) {
		update_pk = pokemon;
		int temp = update_pk[update_pk.length - 1].getHp();
		int max = update_pk[update_pk.length - 1].getMax_hp();
		update_pk[update_pk.length - 1].setHp(max);
		
	}

	public void heal(Pokemons[] pokemon) {
		Bgmplayer bgm = new Bgmplayer();
		update_pk = pokemon;
		int temp = update_pk[update_pk.length - 1].getHp();
		int max = update_pk[update_pk.length - 1].getMax_hp();
		update_pk[update_pk.length - 1].setHp(max);
		System.out.println("============");
		System.out.println(temp + " -----> " + max);
		System.out.println("치료가 완료 되었습니다");
		bgm.play("치료");
	}

	public void arrinsert(Pokemons[] pokemon, int s) {
		update_pk = pokemon;
		s -= 1;
		String name = update_pk[s].getPokemon_Nmae();
		String skillname = update_pk[s].getPokemonSkillName();
		String type = update_pk[s].getPokemon_type();
		update_pk[update_pk.length - 1].setPokemon_Nmae(name);
		update_pk[update_pk.length - 1].setPokemonSkillName(skillname);
		update_pk[update_pk.length - 1].setPokemon_type(type);
	
	}
	
	public void bgmstop() {
		Bgmplayer bgm = new Bgmplayer();
		bgm.stop();
	}
	private static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
		}
	}
}