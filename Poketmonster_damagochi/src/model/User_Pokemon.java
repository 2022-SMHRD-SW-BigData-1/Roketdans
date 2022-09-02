package model;

import java.util.ArrayList;
import java.util.Random;

import controller.Controller_UserPokemon;
import view.View_User;

public class User_Pokemon extends Pokemons{
	Random rd = new Random();
	User_VO userVO = new User_VO();
	Controller_UserPokemon controlUser = new Controller_UserPokemon();
	// 포켓몬 테이블에 정보가 null이라면 레벨 1
	// 있다면 포켓몬 정보 끌어 초기화
	// 유저 id를 받아 초기화
	
	// 회원가입 할 경우 레벨 1로	
	public  User_Pokemon(int select_num) {
		//포켓몬이 선택한 숫자를 초기화
		this.select_number = select_num;
		this.evolution = 1;
		level = 1;
		hp = level *10 + (rd.nextInt(10)+1);
		exp = 0;
		pokemon_name = pokemons_names[select_num-1];
		//속성 확인 후 초기화
		check_type();
		// 해당 포켓몬 스킬 초기화
		this.pokemon_skill_name = this.pokemons_skill_1[select_number-1];
		
	}
	
	// 로그인 했을 경우
	public User_Pokemon(String user_id, String pw) {
		
		// 미완성 
	}
	
	//객체 생성을 통해 해당 포켓몬 정보 조회할 때
	public User_Pokemon() {
		
	}

			
			
		
		
		
	
	
}