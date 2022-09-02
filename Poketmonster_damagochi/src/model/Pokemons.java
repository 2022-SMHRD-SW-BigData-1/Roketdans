package model;

import java.util.ArrayList;
import java.util.Random;

public abstract class Pokemons {
	
	Random rd = new Random();
	// 레벨
	int level;
	// 고정 시작 레벨, 한계 레벨
	final int max_level = 10; 
	final int min_level = 1;
	// 레벨 비례 경험치
	int exp; 
	int max_exp = 100;
	int min_exp = 10;
	// 레벨 비례 포켓몬 체력
	int hp;
	int max_hp = 120;
	int min_hp = 10;
	//포켓몬 이름
	String pokemon_name;
	//포켓몬 스킬
	String pokemon_skill_name;
	
	// 레벨 비례 기본 공격력, 스킬 공격력
	int basic_attack = level*2;
	int skill_attack = basic_attack * 2 + (rd.nextInt(10)+1);
	ArrayList<Pokemons> pokemons = new ArrayList<Pokemons>();
	Pokemons.add
	
}
