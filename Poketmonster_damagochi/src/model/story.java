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
		
		slowPrint("⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⡏⠀⢀⣀⠈⠉⢲⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣋⡩⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⡇⠀⢸⠉⢱⠀⠀⡇⢀⣠⣶⣶⣶⣦⣀⠀⢰⠒⠒⡆⢠⠖⠒⡲⠂⡠⠴⠛⠛⠦⣄⠀⡤⠶⠒⠒⠲⠦⠶⠒⠒⠦⣄⠀⠀⣠⠴⠒⠒⠲⢄⡀⠀⡤⠶⠒⠒⠲⠦⡀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⡇⠀⠸⠶⠊⠀⢀⢧⣾⣿⣿⡿⢿⣿⣿⢧⢸⠀⠀⣧⠎⠀⡰⠃⡜⠁⢠⣖⣲⡄⠘⡆⡇⠀⢰⡶⢆⠀⢠⡶⢦⠀⠘⡆⢸⠁⢀⡴⠲⡄⠀⢱⠀⡇⠀⢰⠶⡄⠀⢹⡄⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⡇⠀⢰⠤⠴⠖⠋⢸⣿⣿⢯⡰⣪⠏⠀⢸⢸⠀⠀⣿⡀⠀⢇⠀⡇⠀⢀⣀⣀⣀⣀⡇⡇⠀⢸⡇⢸⠀⢸⡇⢸⠀⠀⡇⢇⠀⢸⡇⠀⡇⠀⢸⡇⡇⠀⢸⠀⡇⠀⢸⡇⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⡇⠀⢸⠀⠀⠀⠀⠈⢫⡀⠀⠉⠁⠀⣠⠎⢸⠀⠀⡇⢳⡀⠈⢇⠱⡀⠈⠑⠒⠊⢱⠀⡇⠀⢸⡇⢸⠀⢸⡇⢸⠀⠀⡇⠸⣄⠀⠑⠚⠁⢀⡜⠀⡇⠀⢸⠀⡇⠀⢸⡇⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠓⠒⠚⠀⠀⠀⠀⠀⠀⠉⠑⠒⠒⠊⠁⠀⠘⠒⠒⠃⠀⠓⠒⠚⠃⠈⠑⠒⠒⠒⠉⠀⠙⠒⠚⠁⠘⠒⠚⠃⠘⠒⠒⠃⠀⠈⠑⠒⠒⠚⠉⠀⠀⠓⠒⠚⠀⠙⠒⠚⠁⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀", 10);
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
				"너의 꿈인 포켓몬 마스터가 되기 위해서는", "각 마을에 있는 체육관에 도전하여", "뱃지를 획득하여야 한다!!", "\t", "각 체육관에서 뱃지를 총 2개 획득하게 된다면",
				"포켓몬 마스터가 될수 있다!", "\t", "체육관에 도전하기 위해서는 파트너 포켓몬과 함께", "야생 포켓몬을 사냥해 레벨을 올려야지만 도전할수 있다!", "\t",
				"포켓몬 마스터가 되기 위한 여정을 떠나겠느냐? (Y/N)" };
		
		for (int i = 0; i < openingText.length; i++) {
			slowPrint(openingText[i] + "\n", 10);
		}
		bgm.stop();
		while (true) {
			System.out.println("\n");
			System.out.print("입력해주세요 : ");
			String click = sc.next();
			if (click.equals("y")) {
				System.out.println("\n");
				slowPrint("포켓몬 세계에 입장합니다!", 10);
				System.out.println("\n");
				break;
			} else if (click.equals("n")) {
				slowPrint("거절은 거절하겠네!!!", 10);
				System.out.println("\n");
				slowPrint("포켓몬 세계에 입장합니다!", 10);
				System.out.println("\n");
				break;
			} else {
				slowPrint("잘못 입력하셨습니다.", 10);
				System.out.println("\n");
			}
		}
	}

	// 포켓몬 선택 멘트

	public static int choose() {
		Scanner sc = new Scanner(System.in);
		Bgmplayer bgm = new Bgmplayer();
		MP3Player mp3 = new MP3Player();
		System.out.println("=========== 포켓몬 선택 ===========");
		System.out.println("\n");
		int choice;
		bgm.play("타자");
		String[] chooseText = { "오박사 : 포켓몬 마스터가 되기 위해서는", "파트너 포켓몬을 선택해야 한다!", "\t", "모험을 시작하려면 함께 할 포켓몬이 있어야하지 않겠나?",
				"내가 여기 3마리의 포켓몬을 준비했으니 골라보게!!", "\t" };
		for (int i = 0; i < chooseText.length; i++) {
			slowPrint(chooseText[i] + "\n", 10);
		}
		bgm.stop();
		System.out.println("[1] 꼬부기   [2] 파이리   [3] 이상해씨");
		System.out.println("\n");
		image i = new image();
		while (true) {
			System.out.print("포켓몬을 선택하세요 : ");
			choice = sc.nextInt();
			if (choice == 1) {
				i.show("꼬부기");
				slowPrint("꼬부기 : 꼬북! 꼬북!", 10);
				break;
			} else if (choice == 2) {
				i.show("파이리");
				slowPrint("파이리 : 푸와오왘!!", 10);
				break;
			} else if (choice == 3) {
				i.show("이상해씨");
				slowPrint("이상해씨 : 이상! 이상!", 100);
				break;
			} else {
				slowPrint("잘못 입력하셨습니다.", 10);
				System.out.println("\n");
			}
		}
		System.out.println("\n");

		slowPrint("오박사 : 좋은 포켓몬을 선택했군! 그럼 바로 모험을 떠나게!", 10);
		System.out.println("\n");
		System.out.print("태초마을로 이동합니다.");
		slowPrint("태초마을에 오신것을 환영합니다!", 10);
		System.out.println("\n");
		return choice;
	}

	// 사냥터

	public static void field() {
		slowPrint("야생 포켓몬이 출현합니다! 조심하세요!", 10);
		System.out.println("\n");
	}
	// 첫번째 체육관 도전 멘트

	public static void gym1() {
		slowPrint("강우 관장 : 후후훗! 감히 나한테 도전하로 왔다고?? 혼내준다!", 100);
		System.out.println("\n");
	}

	// 두번째 체육관 도전 멘트

	public static void gym2() {
		slowPrint("정민 관장 : 훗! 가소롭군! 내겐 자비란 없다!!", 100);
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
		bgm.play("로켓단");
		e.show("로켓단");
		System.out.println("\n");
		bgm.stop();
		bgm.play("타자");
		String[] roketdanText = { "나 : 뭐야? 뱃지가 사라졌어...", "뱃지도둑이 훔쳐 간거 같아 ㅠㅠ", "\t", "로켓단 : 뱃지 도둑이라고 말하신다면",
				"대답해 드리는게 인지상정", "이 세계의 파괴를 막기 위해", "이 세계의 평화를 지키기 위해", "사랑과 진실 어둠을 뿌리고 다니는", "포켓몬의 감초 귀염둥이 악당",
				"나는 지은!!", "나는 민진!!", "나는 냐옹 이다옹~" };
		for (int i = 0; i < roketdanText.length; i++) {
			slowPrint(roketdanText[i] + "\n", 10);
		}
		bgm.stop();
	}

	public static void ending() {
		Scanner sc = new Scanner(System.in);
		Bgmplayer bgm = new Bgmplayer();
		MP3Player mp3 = new MP3Player();
		bgm.play("타자");
		String[] endingText = { "오박사 : 오래간만이군!", "포켓몬 마스터가 되었다는 소문은 들었네", "정말 축하하네!!!", "힘들일은 없었나?", "\t",
				"나 : 너무 재밌었습니다! 로켓단만 만나지 않았다면 말이죠", "\t", "오박사 : 뭐? 로켓단을 만났다고 그 악랄한 놈들", "그래도 뱃지를 뺏기지 않아서 정말 다행이군!",
				"그래 이제 뭘 하고 싶은가?", "\t", "나 : 아직 결정하지 못했어요..", "\t", "오박사 : 다른 포켓몬과 다시 여행을 떠나는건 어떤가?", "\t",
				"재시작 하시겠습니까? (Y/N)" };
		for (int i = 0; i < endingText.length; i++) {
			slowPrint(endingText[i] + "\n", 10);
			bgm.stop();
		}
		while (true) {
			System.out.print("입력해주세요 : ");
			String retry = sc.next();
			if (retry.equals("y")) {
				System.out.println("\n");
				slowPrint("처음부터 다시 시작합니다.", 100);
				break;
				// 처음으로 돌아가는 기능 추가
			} else if (retry.equals("n")) {
				System.out.println("\n");
				slowPrint("게임을 종료합니다.", 100);
				break;
			} else {
				slowPrint("잘못 입력하셨습니다.", 100);
				System.out.println("\n");
			}
		}
	}

	public static void Menu() {

		Scanner sc = new Scanner(System.in);
		System.out.print("===================== < 선택해주세요 > =====================");
		System.out.println("\n");
		System.out.println("[1]사냥터 [2]체육관도전 [3]상태창 확인 [4]치료센터 [5]세이브 [6]종료");
		System.out.println("\n");
		System.out.print("입력해주세요 : ");
		int move = sc.nextInt();
		if (move == 1) {
			System.out.println("\n");
			System.out.print("사냥터로 이동합니다.");
			System.out.println("\n");
			field();
			// battle.vs();
		} else if (move == 2) {
			while (true) {
				System.out.println();
				System.out.print("[1] 첫번째 체육관 [2] 두번째 체육관");
				System.out.print("어떤 체육관에 도전하시겠습니까? : ");
				int gymchoice = sc.nextInt();
				if (gymchoice == 1) {
					System.out.println("\n");
					gym1();
					break;
				} else if (gymchoice == 2) {
					System.out.println("\n");
					gym2();
					break;
				} else {
					System.out.println("\n");
					System.out.print("잘못 입력하셨습니다.");
					System.out.println("\n");
				}
			}
		} else if (move == 3) {
			System.out.println("\n");
			slowPrint("상태창을 출력합니다.", 10);
			System.out.println("\n");
			// 유저 네임 추가 ?
//			System.out.println("포켓몬 : "+userPokemon.getPokemon_name()+" ");
//			System.out.println("레벨 : "+userPokemon.getLevel()+" ");
//			System.out.println("HP : "+userPokemon.getHp()+" ");
//			System.out.println("EXP : "+userPokemon.getExp()+" ");
		} else if (move == 4) {
			System.out.println("\n");
			System.out.print("치료센터로 이동합니다.");
			// 치료 기능 추가
		} else if (move == 5) {
			System.out.println("\n");
			System.out.print("현재까지 플레이 내역을 저장합니다.");
		} else if (move == 6) {
//			매개값으로 유저 id를 받아 포켓몬 정보 확인하기
			// dao.save(first_pokemon ,userVO.getId()); // 해당 유저의 아이디를 받아 아이디로 찾아 유저 포켓몬 정보
			// 최신화
			System.out.println("\n");
			System.out.print("게임을 종료합니다.");

		} else {
			System.out.println("\n");
			System.out.print("잘못 입력하셨습니다!!");
			System.out.println("\n");
		}

	}
}
