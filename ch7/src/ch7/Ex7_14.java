class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}

	static class StaticInner {
		//int siv = outerIv; 불가능
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; //JDK1.8부터 final 생략 가능
	}
}