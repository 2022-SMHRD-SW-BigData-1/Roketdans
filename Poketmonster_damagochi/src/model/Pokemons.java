package model;

import java.util.ArrayList;
import java.util.Random;

import oracle.net.aso.s;

public abstract class Pokemons {
	
	Random rd = new Random();
	// 레벨
	int level;
	// 고정 시작 레벨, 한계 레벨
	final int max_level = 10; 
	final int min_level = 1;
	// 레벨 비례 경험치
	int exp;
	int max_exp = level*10;
	int min_exp = 0;
	// 레벨 비례 포켓몬 체력
	int hp;
	int max_hp = level*10+10;
	int min_hp = 0;
	//포켓몬 이름
	String pokemon_name;
	//포켓몬 스킬
	String pokemon_skill_name;
	String pokemon_type;
	
	// 레벨 비례 기본 공격력, 스킬 공격력
	int basic_attack = level*2;
	int skill_attack = basic_attack * 2 + (rd.nextInt(10)+1);
	//포켓몬 이름
	String[] pokemons_names = {"꼬부기", "파이리","이상해씨","개구마르","물짱이","야돈","포니타","브케인","불꽃송이","치코리타","나무지기","모부기"};
	String[] grass_type = {"이상해씨","치코리타","나무지기","모부기"};
	String[] water_type = {"꼬부기","개구마르","물짱이","야돈"};
	String[] fire_type = {"파이리","포니타","브케인","불꽃송이"};
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getPokemon_name() {
		return pokemon_name;
	}
	public void setPokemon_name(String pokemon_name) {
		this.pokemon_name = pokemon_name;
	}
	public String getPokemon_skill_name() {
		return pokemon_skill_name;
	}
	public void setPokemon_skill_name(String pokemon_skill_name) {
		this.pokemon_skill_name = pokemon_skill_name;
	}
	public String getPokemon_type() {
		return pokemon_type;
	}
	public void setPokemon_type(String pokemon_type) {
		this.pokemon_type = pokemon_type;
	}
	public int getSkill_attack() {
		return skill_attack;
	}
	public void setSkill_attack(int skill_attack) {
		this.skill_attack = skill_attack;
	}
	
	
	
//	ArrayList<Pokemons> pokemons = new ArrayList<Pokemons>();
	
}
