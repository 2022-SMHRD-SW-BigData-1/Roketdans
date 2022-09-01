package model;

import java.util.Random;

public class User_Pokemon extends Pokemons{
	// 포켓몬 테이블에 정보가 null이라면 레벨 1
	// 있다면 포켓몬 정보 끌어 초기화
	// 유저 id를 받아 초기화
	
	// 회원가입 할 경우 레벨 1로	
	public User_Pokemon(String user_id) {
		Random rd = new Random();
		hp = level * 10 + (rd.nextInt(5)+1);
	}
	
	// 로그인 했을 경우
	public User_Pokemon() {
		
	}
	
}