package ch7;

public class Ex7_13 {
	
	//멤버처럼 사용되는 내부 클래스들
	class InstanceInner { } // 인스턴스 변수. 모든 멤버에 접근 가능. 
	static class StaticInner { }	// static 변수. 인스턴스 멤버 뱨고 다 접근 가능.
	
	//인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	// static 멤버 간에는 서로 직접 접근이 가능하다
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static멤버는 인스턴스 멤버에 직접 접근할 수 없다.
		//InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// 굳이 접근하려면 아래와 같이 객체를 생성해야 함. 
		// 인스턴스 클래스는 외부 클래스를 먼저 생성해야 생성 가능
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() { //외부클래스의 인스턴스 멤버
		//인스턴스 메서드에서는 인스턴스 멤버와 static 멤버 모두 접근 가능하다.
		InstanceInner obj1 = new InstanceInner();
		StaticInner onj2 = new StaticInner();
		//메서드 내 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없음.
		//LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner { } //지역 내부클래스
		LocalInner lv = new LocalInner();
	}
}
