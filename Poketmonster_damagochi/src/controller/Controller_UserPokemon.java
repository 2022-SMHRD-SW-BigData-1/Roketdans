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
	
	// 진화 조건 확인 후 해당 포켓몬 진화 포켓몬 이름으로 변경하는 메소드
	public void check_evolution() {
		if(userPokemon.getLevel() == 5) {
			userPokemon.setPokemon_name(userPokemon.getPokemons_evolution1()[userPokemon.getSelect_number()]);
			userPokemon.setEvolution(2);
			}
		if(userPokemon.getLevel() == 10) {
			userPokemon.setPokemon_name(userPokemon.getPokemons_evolution2()[userPokemon.getSelect_number()]);
			userPokemon.setEvolution(3);
		}
	
	}
}
	



























//	// 진화 확인 후 해당 포켓몬 진화 포켓몬 이름으로 변경하는 메소드
//	public void check_evolution() {
//		if(userPokemon.getLevel() == 5) {
//			userPokemon.setPokemon_name(userPokemon.getpokemons_evolution1[userPokemon.getSelect_number]);
//			userPokemon.setEvolution(2);
//			}
//		}else if(level == 10) {
//			userPokemon.setPokemon_name(userPokemon.getpokemons_evolution2[userPokemon.getSelect_number]);
//			userPokemon.setEvolution(3);
//		}