package model;

import java.util.Random;

import view.View_User;

public class Wild_pokemon extends Pokemons {
	Random rd = new Random();
	User_VO userVO = new User_VO();
	User_Pokemon userPokemon = new User_Pokemon();
	
	// 랜덤 포켓몬 생성
	public Wild_pokemon() {
		//랜덤 포켓몬 선택 숫자 => 포켓몬 이름 배열에 포켓몬 꺼내기
		int random = rd.nextInt(9)+3;
		level = userPokemon.getLevel();
		max_hp =level *10 + (rd.nextInt(10)+1);
		hp = level *10 + (rd.nextInt(10)+1);
		
		pokemon_name = pokemons_names[random-1];
//		level = 
//		me = pokemons_names[random-1];
	
		
	} 

}
