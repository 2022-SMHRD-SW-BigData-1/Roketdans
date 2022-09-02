package model;

import java.util.ArrayList;
import java.util.Random;

import view.View_User;

public class User_Pokemon extends Pokemons{
	Random rd = new Random();
	
	// 포켓몬 테이블에 정보가 null이라면 레벨 1
	// 있다면 포켓몬 정보 끌어 초기화
	// 유저 id를 받아 초기화
	
	// 회원가입 할 경우 레벨 1로	
	public  User_Pokemon(int select_num) {
		level = 1;
		hp = level *10 + (rd.nextInt(10)+1);
		exp = 0;
		pokemon_name = pokemons_names[select_num-1];
		check_type();
	}
	
	// 로그인 했을 경우
	public User_Pokemon(String user_id, String pw) {
		
		
	}
	
	//객체 생성을 통해 해당 포켓몬 정보 조회할 때
	public User_Pokemon() {
		
	}

			//레벨업 메소드		
			public void check_Level_Up(User_Pokemon userPokemon) {
				if(userPokemon.getExp() == userPokemon.getMax_exp()) {
					userPokemon.level++;
				}
			}
			// 진화 확인 메소드
			public void check_evolution(User_Pokemon userPokemon) {
				if(userPokemon.level == 5) {
					evolution =1;
				}
				if(userPokemon.level == 10) {
					evolution =2;
				}
			}
			
			// 같은 포켓몬 이름 확인
			public void find_pokemon_name(User_Pokemon userPokemon) {
				for (int i = 0; i < pokemons_names.length; i++) {
					if(pokemons_names[i] == userPokemon.getPokemon_name()) {
//						userPokemon.getPokemon_name() = pokemons_evolution_1[i];
					}
				}
			}
			
		
		
		
	
	
	//진화
	
	//상태창 확인
	
	// 스킬
	
	
	
}