package model;

import java.util.ArrayList;
import java.util.Random;

public class User_Pokemon extends Pokemons{
	
	// 포켓몬 테이블에 정보가 null이라면 레벨 1
	// 있다면 포켓몬 정보 끌어 초기화
	// 유저 id를 받아 초기화
	
	// 회원가입 할 경우 레벨 1로	
	public User_Pokemon(String user_id) {
		Random rd = new Random();
		level = 1;
		hp = level *10 + (rd.nextInt(10)+1);
		exp = 0;
	}
	
	// 로그인 했을 경우
	public User_Pokemon(String user_id, String pw) {
		
	}
	// 랜덤 포켓몬 생성
		public User_Pokemon() {
			//랜덤 포켓몬 선택 숫자 => 포켓몬 이름 배열에 포켓몬 꺼내기
			int random = rd.nextInt(9)+3;
			//
		}
	
}