package ch5;

import java.util.Scanner;

public class Exercise5_6 {

	public static void main(String[] args) {
		String[] words = {"television","computer","mouse","phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray(); //String을 char[]으로 변환
			
			//단어의 글자 위치 섞는 코드
			for(int j=0;j<question.length;j++) {
				int randidx = (int) (Math.random() * question.length);
				
				char tmp = question[i];
				question[i]=question[randidx];
				question[randidx]=tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요 > ", i+1, new String(question));
			String answer = scanner.nextLine();
			
			//trim()으로 answer의 좌우공백 제거, equals()로 word[i]와 비교
			if(words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다 %n%n");
			}else {
				System.out.println("틀렸습니다.. %n%n");
			}
		}

	}

}
