package Prac7;

class Outer {
	static class Inner{
		int iv =200;
	}
}
public class Prac7_7 {

	public static void main(String[] args) {
		Outer.Inner i = new Outer.Inner();
		System.out.println(i.iv);
	}
}
