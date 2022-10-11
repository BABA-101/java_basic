package ocu;

import java.util.Random;
import java.util.Scanner;

public class Prac04_2 {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt(); //int를 입력받을 것. 반복횟수
		int sum= 0;

		for(int i=0;i<count;i++) {
			// Random 클래스의 nextInt() 내 인자 전달 시 인자값 내료 랜덤값.
			int number=generator.nextInt(100);
			sum += number;
		}
		System.out.println("난수의 합: "+sum);
	}
}
