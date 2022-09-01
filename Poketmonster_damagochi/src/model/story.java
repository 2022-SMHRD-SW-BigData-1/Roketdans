package model;

import java.io.IOException;
import java.util.Scanner;

public class story {
	
	// 글자 따닥따닥
	
	private static void pause() {
		try { System.in.read();} catch(IOException e) {}
	}
	// 메인 타이틀
	
	public static void title() {   
		  System.out.println("\r\n" + 
		  		"______  _____  _   __ _____ ___  ___ _____  _   _ \r\n" + 
		  		"| ___ \\|  _  || | / /|  ___||  \\/  ||  _  || \\ | |\r\n" + 
		  		"| |_/ /| | | || |/ / | |__  | .  . || | | ||  \\| |\r\n" + 
		  		"|  __/ | | | ||    \\ |  __| | |\\/| || | | || . ` |\r\n" + 
		  		"| |    \\ \\_/ /| |\\  \\| |___ | |  | |\\ \\_/ /| |\\  |\r\n" + 
		  		"\\_|     \\___/ \\_| \\_/\\____/ \\_|  |_/ \\___/ \\_| \\_/\r\n" + 
		  		"                                                  \r\n" + 
		  		"                                                  \r\n" + 
		  		"");
	}

	// 오프닝 멘트
	
		public static void opening(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter 키를 누르시면 스토리가 진행됩니다.");
			pause();pause();
			System.out.println();
			System.out.print("포켓몬 세계에 온걸 환영한다.");
			pause();pause();
			System.out.print("나의 이름은 오박사");
			pause();pause();
			System.out.print("모두에게 포켓몬 박사라고 존경받고 있다.");
			pause();pause();
			System.out.println();
			System.out.print("너의 꿈인 포켓몬 마스터가 되기 위해서는");
			pause();pause();
			System.out.print("각 마을에 있는 체육관에 도전하여");
			pause();pause();
			System.out.print("뱃지를 획득하여야 한다!!");
			pause();pause();
			System.out.println();
			System.out.print("각 체육관에서 뱃지를 총 2개 획득하게 된다면");
			pause();pause();
			System.out.print("포켓몬 마스터가 될수 있다!");
			pause();pause();
			System.out.print("체육관에 도전하기 위해서는 파트너 포켓몬과 함께");
			pause();pause();
			System.out.print("야생 포켓몬을 사냥해 레벨을 올려야만 도전할수 있다");
			pause();pause();
			System.out.println();
			System.out.print("포켓몬 마스터가 되기 위한 여정을 떠나겠느냐? (Y/N)");
			pause();pause();
			System.out.print("입력해주세요 : ");
			String click = sc.next();
			System.out.println();
			
			if (click.equals("y")) {
				System.out.print("포켓몬 세계에 입장합니다!");
			}else if(click.equals("n")){
				System.out.print("거절은 거절하겠네");
			}else {
				System.out.print("잘못 입력하셨습니다.");
			}
		System.out.println();
		}
		
		// 포켓몬 선택 멘트
		
		public static void choose(){
		Scanner sc = new Scanner(System.in);
		System.out.print("오박사 : 포켓몬 마스터가 되기 위해서는");
		pause();pause();
		System.out.print("파트너 포켓몬을 선택해야 한다!");
		pause();pause();
		System.out.println();
		System.out.print("모험을 시작하려면 함께 할 포켓몬이 있어야하지 않겠나?");
		pause();pause();
		System.out.print("내가 여기 3마리의 포켓몬을 준비했으니 골라보게!!");
		pause();pause();
		System.out.println("[1].꼬부기   [2].파이리   [3].이상해씨");
		System.out.print("포켓몬을 선택하세요 : ");
		int choice = sc.nextInt();
		
			if(choice == 1) {
				 System.out.println("꼬부기 : 꼬북 꼬북");
		}else if(choice == 2) {
				  System.out.println("파이리 : 푸와오왘");
		}else if(choice == 3) {
				  System.out.println("이상해씨 : 이상! 이상!");
		}else{
			System.out.println("다시 입력해주세요");
			}  
			   System.out.println("오박사 : 좋은 포켓몬을 선택했군! 그럼 바로 모험을 떠나게!");
			   pause();pause();
		}
		// 첫번째 체육관 도전 멘트
		
		public static void gym1(){
			System.out.print("강우 관장 : 후후훗! 나한테 도전하로 왔다고?? 혼내준다!");
			pause();pause();
		}

		// 두번째 체육관 도전 멘트
			
		public static void gym2(){
			System.out.print("정민 관장 : 훗! 가소롭군! 자비는 바라지마라!!");
			pause();pause();
		}
		
		// 로켓단 등장 멘트
		
		public static void roketdan(){
			System.out.print("나 : 뭐야? 뱃지가 사라졌어...");
			pause();pause();
			System.out.print("뱃지도둑이 훔쳐 간거 같아 ㅠㅠ");
			pause();pause();
			System.out.print("뱃지 도둑이라고 말하신다면");
			pause();pause();
			System.out.print("대답해 드리는게 인지상정");
			pause();pause();
			System.out.print("이 세계의 파괴를 막기 위해");
			pause();pause();
			System.out.print("이 세계의 평화를 지키기 위해");
			pause();pause();
			System.out.print("사랑과 진실 어둠을 뿌리고 다니는");
			pause();pause();
			System.out.print("포켓몬의 감초 귀염둥이 악당");
			pause();pause();
			System.out.print("나는 지은!");
			pause();pause();
			System.out.print("나는 민진!");
			pause();pause();
			System.out.print("나는 냐옹이다옹~");
			pause();pause();
		}
		
		public static void ending(){
			Scanner sc = new Scanner(System.in);
			System.out.print("오박사 : 오래간만이군!");
			pause();pause();
			System.out.print("포켓몬 마스터가 되었다는 소문은 들었네");
			pause();pause();
			System.out.print("정말 축하하네!!!");
			pause();pause();
			System.out.print("힘들일은 없었나?");
			pause();pause();
			System.out.print("나 : 너무 재밌었습니다! 로켓단만 만나지 않았다면 말이죠");
			pause();pause();
			System.out.print("뭐? 로켓단을 만났다고 그 악랄한 놈들");
			pause();pause();
			System.out.print("그래도 뱃지를 뺏기지 않아서 정말 다행이군!");
			pause();pause();
			System.out.print("그래 이제 뭘 하고 싶은가?");
			pause();pause();
			System.out.print("나 : 아직 결정하지 못했어요..");
			pause();pause();
			System.out.print("다른 포켓몬과 다시 여행을 떠나는건 어떤가?");
			pause();pause();
			System.out.print("재시작 하시겠습니까? (Y/N)");
			String retry = sc.next();
			if (retry.equals("y")) {
				System.out.print("처음부터 다시 시작합니다.");
			}else if(retry.equals("n")) {
				System.out.print("게임을 종료합니다.");
			}else {
				System.out.print("잘못 입력하셨습니다.");
			}
		}
		
	}

