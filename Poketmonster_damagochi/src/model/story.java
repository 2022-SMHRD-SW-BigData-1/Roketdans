package model;

import java.io.IOException;
import java.util.Scanner;

import controller.Battle;
import controller.Bgmplayer;
import controller.Controller_DAO;
import controller.image;
import javazoom.jl.player.MP3Player;

public class story {

	Bgmplayer bgm = new Bgmplayer();
	MP3Player mp3 = new MP3Player();
	Scanner sc = new Scanner(System.in);
	// 글자 멈춤 메소드

	private static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
		}
	}

	// 글자 천천히 출력 메소드

	public static void slowPrint(String message, long millisPerChar) {

		try {
			for (int i = 0; i < message.length(); i++) {
				System.out.print(message.charAt(i));

				Thread.sleep(millisPerChar);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// 메인 타이틀

	public static void title() {
		Bgmplayer bgm = new Bgmplayer();
		MP3Player mp3 = new MP3Player();
		bgm.play("시작브금");
		
		slowPrint("⠀ ____     _____       __  __                  _____       __  __     \r\n"
				+ "/\\  _`\\  /\\  __`\\    /\\ \\/\\ \\     /'\\_/`\\    /\\  __`\\    /\\ \\/\\ \\    \r\n"
				+ "\\ \\ \\L\\ \\\\ \\ \\/\\ \\   \\ \\ \\/'/'   /\\      \\   \\ \\ \\/\\ \\   \\ \\ `\\\\ \\   \r\n"
				+ " \\ \\ ,__/ \\ \\ \\ \\ \\   \\ \\ , <    \\ \\ \\__\\ \\   \\ \\ \\ \\ \\   \\ \\ , ` \\  \r\n"
				+ "  \\ \\ \\/   \\ \\ \\_\\ \\   \\ \\ \\\\`\\   \\ \\ \\_/\\ \\   \\ \\ \\_\\ \\   \\ \\ \\`\\ \\ \r\n"
				+ "   \\ \\_\\    \\ \\_____\\   \\ \\_\\ \\_\\  \\ \\_\\\\ \\_\\   \\ \\_____\\   \\ \\_\\ \\_\\\r\n"
				+ "    \\/_/     \\/_____/    \\/_/\\/_/   \\/_/ \\/_/    \\/_____/    \\/_/\\/_/\r\n"
				+ "                                                                     ", 10);
		System.out.println("\n");
		bgm.stop();
	}

	// 오프닝 멘트

	public static void opening() {
		Bgmplayer bgm = new Bgmplayer();
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 키를 누르시면 스토리가 진행됩니다.");
		pause();
		pause();
		System.out.println("\n");
		bgm.play("타자");
		String[] openingText = { "포켓몬 세계에 온걸 환영한다.", "\t", "나의 이름은 오박사", "모두에게 포켓몬 박사라고 존경받고 있다.", "\t",
				"너의 꿈인 포켓몬 마스터가 되기 위해서는", "마을에 있는 체육관에 도전하여", "승리해 뱃지를 획득해야한다.", "\t", "체육관에 도전하기 위해서는",
				"사냥터에서 포켓몬의 레벨 5까지 올려야한다.", "\t", "하지만 조심하렴 요즘 뱃지 도둑이 있다는 흉흉한 소문을 들었단다.", "그놈들에게 뱃지를 빼앗기면 포켓몬 마스터가 될수 없단다.", "\t",
				"너무 걱정마라, 뱃지를 뺏기지 않게 강해지면 된니까.","포켓몬 마스터가 되기 위한 여정을 떠나겠느냐? (Y/N)" };
		
		for (int i = 0; i < openingText.length; i++) {
			slowPrint(openingText[i] + "\n", 100);
		}
		bgm.stop();
		while (true) {
			System.out.println("\n");
			System.out.print("입력해주세요 : ");
			String click = sc.next();
			if (click.equals("y")) {
				System.out.println("\n");
				slowPrint("포켓몬 세계에 입장합니다!", 100);
				System.out.println("\n");
				break;
			} else if (click.equals("n")) {
				slowPrint("거절은 거절하겠네!!!", 100);
				System.out.println("\n");
				slowPrint("포켓몬 세계에 입장합니다!", 100);
				System.out.println("\n");
				break;
			} else {
				slowPrint("잘못 입력하셨습니다.", 100);
				System.out.println("\n");
			}
		}
	}

	// 포켓몬 선택 멘트

	public static int choose() {
		Scanner sc = new Scanner(System.in);
		Bgmplayer bgm = new Bgmplayer();
		MP3Player mp3 = new MP3Player();
		image e = new image();
		System.out.println("=========== 포켓몬 선택 ===========");
		System.out.println("\n");
		int choice;
		e.show("오박사");
		bgm.play("타자");
		System.out.println("\n");
		String[] chooseText = { "오박사 : 포켓몬 마스터가 되는 첫걸음은", "파트너 포켓몬을 선택하는 것이다!", "\t", "모험을 시작하려면 함께 할 포켓몬이 있어야하지 않겠나?",
				"내가 여기 3마리의 포켓몬을 준비했으니 골라보게!!", "\t" };
		for (int i = 0; i < chooseText.length; i++) {
			slowPrint(chooseText[i] + "\n", 100);
		}
		bgm.stop();
		System.out.println("[1] 꼬부기   [2] 파이리   [3] 이상해씨");
		System.out.println("\n");
		image i = new image();
		while (true) {
			System.out.print("포켓몬을 선택하세요 : ");
			choice = sc.nextInt();
			if (choice == 1) {
				bgm.play("꼬부기");
				System.out.println("\n");
				i.show("꼬부기");
				slowPrint("꼬부기 : 꼬북! 꼬북!", 100);
				bgm.stop();
				break;
			} else if (choice == 2) {
				bgm.play("파이리");
				System.out.println("\n");
				i.show("파이리");
				slowPrint("파이리 : 푸와오왘!!", 100);
				bgm.stop();
				break;
			} else if (choice == 3) {
				bgm.play("이상해씨");
				System.out.println("\n");
				i.show("이상해씨");
				slowPrint("이상해씨 : 이상! 이상!", 100);
				bgm.stop();
				break;
			} else {
				slowPrint("잘못 입력하셨습니다.", 100);
				System.out.println("\n");
			}
		}
		System.out.println("\n");

		slowPrint("오박사 : 좋은 포켓몬을 선택했군! 그럼 바로 모험을 떠나게!", 100);
		System.out.println("\n");
		System.out.print("태초마을로 이동합니다.");
		System.out.println("\n");
		slowPrint("태초마을에 오신것을 환영합니다!", 100);
		System.out.println("\n");
		return choice;
	}

	// 사냥터

	public static void field() {
		
		Bgmplayer bgm = new Bgmplayer();
		MP3Player mp3 = new MP3Player();
//		bgm.play("포켓몬발견");
		slowPrint("야생 포켓몬이 출현합니다! 조심하세요!", 100);
		System.out.println("\n");
	}
	// 첫번째 체육관 도전 멘트

	public static void gym1() {
		System.out.println("\n");
		slowPrint("강우 관장 : 후후훗! 감히 나한테 도전하로 왔다고?? 혼내준다!", 100);
		System.out.println("\n");
	}
	public static void gym1end() {
		System.out.println("\n");
		slowPrint("강우 관장 : 강하군, 나를 이겼으니 뱃지를 주도록 하겠다!", 100);
		System.out.println("\n");
	}


	// 승리
	public static void win() {
		image i = new image();
		i.show("승리");
	}

	// 패배
	public static void fail() {
		image i = new image();
		i.show("패배");
	}

	// 로켓단 등장 멘트
	public static void roketdan() {
		Bgmplayer bgm = new Bgmplayer();
		MP3Player mp3 = new MP3Player();
		image e = new image();
		e.show("로켓단");
		bgm.play("로켓단");
		System.out.println("\n");
		slowPrint("나 : 뭐야? 뱃지가 사라졌어...",100);
		slowPrint("뱃지도둑이 훔쳐 간거 같아 ㅠㅠ",100); 
		System.out.println("\n");
		e.show("로켓단로고");
		slowPrint("로켓단 : 뱃지 도둑이라고 말하신다면",100);
		System.out.println("\n");
		slowPrint("대답해 드리는게 인지상정",100);
		System.out.println("\n");
		slowPrint("이 세계의 파괴를 막기 위해",100);
		System.out.println("\n");
		slowPrint("이 세계의 평화를 지키기 위해",100);
		System.out.println("\n");
		slowPrint("사랑과 진실 어둠을 뿌리고 다니는",100);
		System.out.println("\n");
		slowPrint("포켓몬의 감초 귀염둥이 악당",100);
		System.out.println("\n");
		e.show("로사");
		slowPrint("나는 지은!!",100);
		System.out.println("\n");
		e.show("로이");
		slowPrint("나는 민진!!",100);
		System.out.println("\n");
		e.show("냐옹");
		slowPrint("나는 정민 이다옹~",100);
		bgm.stop();
		}
	public static void ending() {
		Scanner sc = new Scanner(System.in);
		Bgmplayer bgm = new Bgmplayer();
		MP3Player mp3 = new MP3Player();
		image e = new image();
		bgm.play("타자");
		System.out.println("\n");
		e.show("오박사");
		System.out.println("\n");
		String[] endingText = { "오박사 : 오래간만이군!", "포켓몬 마스터가 되었다는 소문은 들었네", "정말 축하하네!!!", "힘들일은 없었나?", "\t",
				"나 : 너무 재밌었습니다! 로켓단만 만나지 않았다면 말이죠...", "\t", "오박사 : 뭐? 로켓단을 만났다고 그 악랄한 놈들", "그래도 뱃지를 뺏기지 않아서 정말 다행이군!",
				"다음에 기회가 있으면 또 보세 잘지내게!"};
		for (int i = 0; i < endingText.length; i++) {
			slowPrint(endingText[i] + "\n", 100);
			}
		bgm.stop();
		System.out.println("\n");
		bgm.play("엔딩노래");
		slowPrint(".___________. __    __   _______     _______ .__   __.  _______  \r\n"
				+ "|           ||  |  |  | |   ____|   |   ____||  \\ |  | |       \\ \r\n"
				+ "`---|  |----`|  |__|  | |  |__      |  |__   |   \\|  | |  .--.  |\r\n"
				+ "    |  |     |   __   | |   __|     |   __|  |  . `  | |  |  |  |\r\n"
				+ "    |  |     |  |  |  | |  |____    |  |____ |  |\\   | |  '--'  |\r\n"
				+ "    |__|     |__|  |__| |_______|   |_______||__| \\__| |_______/ \r\n"
				+ "                                                                 ",50);
		pause();pause();
		bgm.stop();
		}
	}
