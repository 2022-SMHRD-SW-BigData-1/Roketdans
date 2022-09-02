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
	
	//1,2 차 진화
	int evolution;
	
	// 레벨 비례 기본 공격력, 스킬 공격력
	int basic_attack = level*2;
	int skill_attack = basic_attack * 2 + (rd.nextInt(10)+1);
	//포켓몬 이름
	String[] pokemons_names = {"꼬부기", "파이리","이상해씨","개구마르","물짱이","야돈","포니타","브케인","불꽃숭이","치코리타","나무지기","모부기"};
	String[] pokemons_skill_1 = {"하이드로펌프","불꽃세례","덩굴채찍","막치기","물대포","사슬묶기","화염자동차","화염방사","회오리불꽃","메지컬리프","메가드레인","앞날가르기"};
	String[] pokemons_evolution1 = {"어니부기","리자드","이상해풀","개굴반장","늪짱이","야도란","날쌩마","마그케인","파이숭이","베이리프","나무돌이","수풀부기"};
	String[] pokemons_evolution2 = {"거북왕","리자몽","이상해꽃","개굴닌자","대짱이","메가야도란","날쌩마","블레이범","초염뭉","메가니움","나무킹","토대부기"};
	String[] grass_type = {"이상해씨","치코리타","나무지기","모부기"};
	String[] water_type = {"꼬부기","개구마르","물짱이","야돈"};
	String[] fire_type = {"파이리","포니타","브케인","불꽃송이"};
	
	public Random getRd() {
		return rd;
	}
	
	public int getMax_level() {
		return max_level;
	}
	
	public int getMin_level() {
		return min_level;
	}
	
	public int getMax_exp() {
		return max_exp;
	}
	
	public int getMin_exp() {
		return min_exp;
	}
	
	public int getMax_hp() {
		return max_hp;
	}
	
	public int getMin_hp() {
		return min_hp;
	}
	
	public int getEvolution() {
		return evolution;
	}
	
	public int getBasic_attack() {
		return basic_attack;
	}
	
	public String[] getPokemons_names() {
		return pokemons_names;
	}
	
	public String[] getGrass_type() {
		return grass_type;
	}
	
	public String[] getWater_type() {
		return water_type;
	}
	
	public String[] getFire_type() {
		return fire_type;
	}
	
	
	
	
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

	public void setRd(Random rd) {
		this.rd = rd;
	}

	public void setEvolution(int evolution) {
		this.evolution = evolution;
	}

	public void setBasic_attack(int basic_attack) {
		this.basic_attack = basic_attack;
	}

	public void setPokemons_names(String[] pokemons_names) {
		this.pokemons_names = pokemons_names;
	}

	public void setWater_type(String[] water_type) {
		this.water_type = water_type;
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
		
		
			
	
	
	
	
	
	
//	ArrayList<Pokemons> pokemons = new ArrayList<Pokemons>();
	
}
