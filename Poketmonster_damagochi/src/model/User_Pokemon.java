package model;

import java.util.ArrayList;
import java.util.Random;

public class User_Pokemon extends Pokemons{
	Random rd = new Random();
	
	// 포켓몬 테이블에 정보가 null이라면 레벨 1
	// 있다면 포켓몬 정보 끌어 초기화
	// 유저 id를 받아 초기화
	
	// 회원가입 할 경우 레벨 1로	
	public User_Pokemon(int select_num) {
		level = 1;
		hp = level *10 + (rd.nextInt(10)+1);
		exp = 0;
		pokemon_name = pokemons_names[select_num-1];
		check_type();
	}
	
	// 로그인 했을 경우
	public User_Pokemon(String user_id, String pw) {
		
	}
	// 랜덤 포켓몬 생성
		public User_Pokemon() {
			//랜덤 포켓몬 선택 숫자 => 포켓몬 이름 배열에 포켓몬 꺼내기
			int random = rd.nextInt(9)+3;
			pokemon_name = pokemons_names[random-1];
			check_type();
			
		}
	
		
		
		
	// 타입 확인
	public void check_type() {
		for (int i = 0; i < fire_type.length; i++) {
			if(fire_type[i].equals(pokemon_name)) {
				pokemon_type = fire_type[i];
			}
		}
		for (int i = 0; i < water_type.length; i++) {
			if(water_type[i].equals(pokemon_name)) {
				pokemon_type = water_type[i];
			}
		}
		for (int i = 0; i < grass_type.length; i++) {
			if(grass_type[i].equals(pokemon_name)) {
				pokemon_type = grass_type[i];
			}
		}
	}
}