package ocu;

import java.util.Scanner;

public class Prac04_1 {

	public static void main(String[] args) {
		int randomNum = (int) (Math.random() * 4);
		System.out.println("생성된 수: " + randomNum);
		switch(randomNum) {
			case 0: 
				System.out.println("학점: A");
				break;
			case 1: 
				System.out.println("학점: B");
				break;
			case 2: 
				System.out.println("학점: C");
				break;
			case 3: 
				System.out.println("학점: D");
				break;
		}
	}

}
