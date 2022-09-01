package model;

import java.util.Random;

public abstract class Pokemons {
	
	Random rd = new Random();
	int level;
	final int max_level = 10; 
	final int min_level = 1;
	int exp; 
	int max_exp = (int)(level * 1.5);
	int min_exp = 0;
	int hp= level * 10 + (rd.nextInt(5)+1) ;
	int max_hp = (int)(hp * 1.5);
	int min_hp = 0;
	int basic_attack = level*2;
	int skill_attack = basic_attack * 2 + (rd.nextInt(5)+1);
	String[] pokemons_names = {"꼬부기", "파이리", "이상해씨","개구마르","물짱이","야돈","포니타","브케인","불꽃숭이","치코리타","나무지기","모부기"};
	String[] water_type = {"꼬부기","개구마르","물짱이","야돈"};
	String[] fire_type = {"파이리","포니타","브케인","불꽃숭이"};
	String[] grass_type = {"이상해씨", "치코리타","나무지기","모부기"};
	
	
}
