package model;

import java.util.ArrayList;
import java.util.Random;

import controller.Controller_UserPokemon;
import view.View_User;

public class User_Pokemon {
	Random rd = new Random();
	User_VO userVO = new User_VO();
	Controller_UserPokemon controlUser = new Controller_UserPokemon();

	Pokemons ggobugi = new Pokemons("꼬부기", "로케트박치기", "물");
	Pokemons pairi = new Pokemons("파이리", "플레어드라이브", "불");
	Pokemons isanghassi = new Pokemons("이상해씨", "씨폭탄", "풀");
	Pokemons wild_gagumar = new Pokemons("개구마르", "물의파동", "물", "rd");
	Pokemons wild_muljjangi = new Pokemons("물짱이", "머드숏", "물", "rd");
	Pokemons wild_yadon = new Pokemons("야돈", "파도타기", "물", " rd");
	Pokemons wild_ponita = new Pokemons("포니타", "불대문자", "불", "rd");
	Pokemons wild_bkein = new Pokemons("브케인", "분연", "불", "rd");
	Pokemons wild_buggochsugi = new Pokemons("불꽃숭이", "플레어드라이브", "불", "rd");
	Pokemons wild_chikorita = new Pokemons("치코리타", "누르기", "풀", "rd");
	Pokemons wild_namujigi = new Pokemons("나무지기", "힘껏치기", "풀", "rd");
	Pokemons wild_mobugi = new Pokemons("모부기", "기가드레인", "풀", "rd");
	Pokemons wild_gaegulbanjang = new Pokemons("개굴반장", "속여때리기", "물", "rd");
	Pokemons wild_neupjjangi = new Pokemons("늪짱이", "죽기살기", "물", "rd");
	Pokemons wild_yadoran = new Pokemons("야도란", "사념의박치기", "물", "rd");
	Pokemons wild_nalssaengma = new Pokemons("날쌩마", "니트로차지", "불", "rd");
	Pokemons wild_mageukein = new Pokemons("마그케인", "이판사판태클", "불", "rd");
	Pokemons wild_paisungi = new Pokemons("파이숭이", "플레어드라이브", "불", "rd");
	Pokemons wild_beilipeu = new Pokemons("베이리프", "자연의은혜", "풀", "rd");
	Pokemons wild_namudori = new Pokemons("나무돌이", "힘껏치기", "풀", "rd");
	Pokemons wild_supulbugi = new Pokemons("수풀부기", "리프스톰", "풀", "rd");
	Pokemons wild_eonibugi = new Pokemons("어니부기", "물의파동", "물", "rd");
	Pokemons wild_lizard = new Pokemons("리자드", "드래곤크루", "불", "rd");
	Pokemons wild_isanghaepul = new Pokemons("이상해풀", "꽃잎댄스", "풀", "rd");
	Pokemons update_pokemon = new Pokemons("", "", "", "");

	Pokemons[] pokemonsArray = { ggobugi, pairi, isanghassi, wild_gagumar, wild_muljjangi, wild_yadon, wild_ponita,
			wild_bkein, wild_buggochsugi, wild_chikorita, wild_namujigi, wild_mobugi,  wild_gaegulbanjang, wild_neupjjangi, wild_yadoran, wild_nalssaengma, wild_mageukein,
			wild_paisungi, wild_beilipeu, wild_namudori, wild_supulbugi,wild_eonibugi, wild_lizard,
			wild_isanghaepul, update_pokemon };
	// 로그인 했을 경우
//	public User_Pokemon(String user_id, String pw){

	// 미완성
//	}

	// 객체 생성을 통해 해당 포켓몬 정보 조회할 때
	public User_Pokemon() {

	}

	public Pokemons[] getPokemonsArray() {
		return this.pokemonsArray;
	}

}