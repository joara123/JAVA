package week3;

import java.util.*;

public class WordTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Word[] word = new Word[7];
		String eword;
		String kword;
		
		for(int i = 0 ; i < word.length ; i++) {
			System.out.print((i+1)+":���ܾ�� ���� �Է��ϼ��� >>> ");
			eword = in.next();
			kword = in.next();
			word[i] = new Word(eword, kword);
		}
		
		String ch = " ";
		while(true) {
			System.out.println("ã���� �ϴ� �ܾ �Է��ϼ���. ����(f) >> ");
			ch = in.next();
			if(ch.equals("f")) {
				System.out.println("���α׷� ����");
				break;
			}
			
			for(Word obj : word) {
				if(ch.equals(obj.getEword())) {
					System.out.println(obj.getEword()+" : "+obj.getKword());
				}
			}
		}
	}
}
