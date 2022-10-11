package Prac6;
class Outer {
	class Inner{
		int iv =100;
	}
}
public class Prac7_6 {
	public static void main(String[] arvs) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		System.out.println(i.iv);
	}
}
