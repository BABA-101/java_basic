package ch5;

import java.util.Scanner;

public class Ex5_10 {
	public static void main(String[] argv) {
		String[][] words= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은? > ",i+1,words[i][0]);
			String tmp = scanner.nextLine(); // Enter를 치기 전까지 쓴 문자열 모두 반환. next()는 space(공백)전까지 입력받은 문자열 반환
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다! %n%n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n",words[i][1]);
			}
		}
		}
	}
