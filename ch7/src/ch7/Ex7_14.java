package ch7;

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	//내부 인스턴스 클래스
	class InstanceInner {
		int iiv = outerIv;	//외부클래스의 private 멤버도 접근 가능!
		int iiv2 = outerCv;
	}
	
	//내부 스태틱 클래스(static member)
	static class StaticInner {
		//int siv = outerIv; 불가능
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; //JDK1.8부터 final 생략 가능
		
		// 내부 클래스(로컬)
		class LocalInner{
			int liv=outerIv;
			int ilv2=outerCv;
			//외부클래스의 지역변수는 final 붙은 변수(상수)만 접근 가능하다.
			//int liv3=lv; 에러, 그러나 JDK1.8부터는 에러 아님
			int liv4=LV;
		}
	}
}

public class Ex7_14{
	
}