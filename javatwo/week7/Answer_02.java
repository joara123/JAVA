package week7;

import java.util.*;

public class Answer_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Media me = new Media() {
			void play(String instru) {
				System.out.println(instru+"를 재생합니다");
			}
			void stop(String instru) {
				System.out.println(instru+"를 중지합니다");				
			}
		};
		
		System.out.println("기기를 선택하세요");
		System.out.print("1:MP3 2:CDPlay 3:WindowMediaPlay >> ");
		int num = in.nextInt();
		
		//String[] pla = new String[3];
		
		if(num == 1) {
			me.play("MP3");
			me.stop("MP3");
		}
		else if(num == 2) {
			me.play("CDPlay");
			me.stop("CDPlay");
		}
		else if(num == 3) {
			me.play("WindowMediaPlay");
			me.stop("WindowMediaPlay");
		}
		else {
			System.out.println("존재하지 않습니다.");
		}
	}
}
