package controller;

import java.util.Iterator;

import model.User_Pokemon;

public class Controller_UserPokemon {
	User_Pokemon userPokemon = new User_Pokemon();
	int pokemon_number;
	//레벨업 메소드		
	public void check_Level_Up() {
		if(userPokemon.getExp() == userPokemon.getMax_exp()) {
			userPokemon.setLevel(userPokemon.getLevel()+1);
		}
	}
	
	//진화 확인 메소드
//	public void check_evolution() {
//		if(userPokemon.getLevel() == 5) {
//				evolution=1;
//			}
//		}else if(level == 10) {
//			evolution =2;
//		}
	
	
	
// 같은 포켓몬 이름 확인
//	public int find_pokemon_name() {
//		int in_number;
//		for (int i = 0; i < .length; i++) {
//			if(pokemons_names[i] == userPokemon.getPokemon_name()) {
//				userPokemon.getPokemon_name() = pokemons_evolution_1[i];
//			}
//		}
//	}
	
	
	}
	
	

