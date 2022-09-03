package model;

import java.util.ArrayList;
import java.util.Random;

import oracle.net.aso.s;

public class Pokemons {
	
	Random rd = new Random();
	//포켓몬 이름
	String pokemon_Nmae;
	// 포켓몬 스킬이름
	String pokemonSkillName;
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
	int max_hp = level*10+(rd.nextInt(10)+1);
	int min_hp = 0;
	// 레벨 비례 기본 공격력, 스킬 공격력
	int basic_attack = level*2;
	int skill_attack = basic_attack * 2 + (rd.nextInt(10)+1);
	
	//1,2 차 진화
	int evolution; // => 기본 값 : 1       1차 진화 값 : 2         2차 진화 값 :  3
	
	public int getSelect_number() {
		return select_number = 0;
	}

	// 사용자가 선택"한 포켓몬 넘버
	int select_number;
	
	//기본 포켓몬 생성자
	public Pokemons(String pokemonName, String skillName) {
		this.pokemon_Nmae = pokemonName;
		this.pokemonSkillName = skillName;
		this.level = 1;
		this.exp = this.min_exp;
		this.hp = this.max_hp;
	}
	
	//야생 포켓몬 생성자
		public Pokemons(String pokemonName , String skillName,String rando) {
			this.pokemon_Nmae = pokemonName;
			this.pokemonSkillName = skillName;
			this.level = level;
			this.exp = this.min_exp;
			this.hp = this.max_hp;
		}
	
	
	
	// 진화에 따른 포켓몬 이름
//	String[] pokemons_names = {"꼬부기", "파이리","이상해씨","꼬부기", "파이리","이상해씨","개구마르","물짱이","야돈","포니타","브케인","불꽃숭이","치코리타","나무지기","모부기","어니부기","리자드","이상해풀","개굴반장","늪짱이","야도란","날쌩마","마그케인","파이숭이","베이리프","나무돌이","수풀부기"}; // 27
//	String[] pokemons_skill_1 = {"로케트박치기","플레어드라이브","씨폭탄","물의파동","머드숏","파도타기","불대문자","분연","플레어드라이브","누르기","힘껏치기","기가드레인","물의파동","드래콘크루","꽃잎댄스","속여때리기","죽기살기","사념의박치기","니트로차지","이판사판태클","플레어드라이브","자연의은혜","힘껏치기","리프스툼"}; // 기본 포켓몬 스킬
//	String[] pokemons_skill_2 = {"물의파동","드래콘크루","꽃잎댄스","속여때리기","죽기살기","사념의박치기","니트로차지","이판사판태클","플레어드라이브","자연의은혜","힘껏치기","리프스툼"}; // 1차 진화 스킬
//	String[] pokemons_evolution1 = {"어니부기","리자드","이상해풀","개굴반장","늪짱이","야도란","날쌩마","마그케인","파이숭이","베이리프","나무돌이","수풀부기"}; // 1차 진화
	// 진화에 따른 스킬
	
	// 타입
//	String[] grass_type = {"이상해씨","치코리타","나무지기","모부기"}; // 풀타입 포켓몬 종류
//	String[] water_type = {"꼬부기","개구마르","물짱이","야돈"}; // 물타입 포켓몬 종류
//	String[] fire_type = {"파이리","포니타","브케인","불꽃송이"}; // 불타입 포켓몬 종류
	
	

		
		
		
			
	
	
	
	
	
	
//	ArrayList<Pokemons> pokemons = new ArrayList<Pokemons>();
	
}
