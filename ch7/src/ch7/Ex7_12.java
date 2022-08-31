package ch7;

public class Ex7_12 {

	class InstanceInner { // 내부 인스턴스 클래스
		int iv = 100;
		// static int cv = 100; 스태틱변수 선언 불가능. 에러 
		final static int CONST = 100;
	}
	
	static class StaticInner { //내부 스태틱 클래스
		int iv = 200;
		static int cv = 200;	// static 클래스만 static 멤버 선언 가능
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 100;
			// static int cv = 100; 스태틱변수 선언 불가능. 에러 
			final static int CONST = 100;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
