package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import model.Bgm;

public class Bgmplayer {
	ArrayList<Bgm> bgmlist =new ArrayList<Bgm>();
	MP3Player mp3 = new MP3Player();
	
	public Bgmplayer() {
		bgmlist.add(new Bgm("포켓몬발견","C://Users/smhrd/Desktop/Bgm/야생포켓몬발견.mp3"));
		bgmlist.add(new Bgm("시작브금", "C://Users/smhrd/Desktop/Bgm/메인브금.mp3"));
		bgmlist.add(new Bgm("타격", "C://Users/smhrd/Desktop/Bgm/hit.mp3"));
		bgmlist.add(new Bgm("엔딩", "C://Users/smhrd/Desktop/Bgm/엔딩.mp3"));
		bgmlist.add(new Bgm("저장", "C://Users/smhrd/Desktop/Bgm/저장.mp3"));
		bgmlist.add(new Bgm("진화", "C://Users/smhrd/Desktop/Bgm/진화.mp3"));
		bgmlist.add(new Bgm("레벨업", "C://Users/smhrd/Desktop/Bgm/레벨업.mp3"));
		bgmlist.add(new Bgm("치료", "C://Users/smhrd/Desktop/Bgm/치료.mp3"));
		bgmlist.add(new Bgm("타격", "C://Users/smhrd/Desktop/Bgm/타격.mp3"));
		bgmlist.add(new Bgm("이상해씨", "C://Users/smhrd/Desktop/Bgm/이상해씨.mp3"));
		bgmlist.add(new Bgm("꼬부기", "C://Users/smhrd/Desktop/Bgm/꼬부기.mp3"));
		bgmlist.add(new Bgm("파이리", "C://Users/smhrd/Desktop/Bgm/파이리.mp3"));
		bgmlist.add(new Bgm("엔딩", "C://Users/smhrd/Desktop/Bgm/엔딩노래.mp3"));
	}
	public void play(String s) {
		for(int i =0;  i<bgmlist.size();i++) {
			Bgm m = bgmlist.get(i);
			String a = m.getName();
			if(a.equals(s)) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(m.getMusicPath());
			}
		}
	}


}
