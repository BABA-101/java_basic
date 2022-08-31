package ch7;

abstract class Unit {
	int x,y;
	abstract void move(int x, int y); // 추상메서드
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit{ //보병
	void move(int x ,int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}
	void stimPack() {/* 스팀팩을 사용한다. */}
}

class Tank extends Unit{ //탱크
	void move(int x ,int y) {
		System.out.println("Tank[x=" + x + ", y=" + y + "]");
	}
	void changeMode() {/* 공격모드 변환. */}
}

class Dropship extends Unit{ //수송선
	void move(int x ,int y) {
		System.out.println("Dropship[x=" + x + ", y=" + y + "]");
	}
	void load() {/* 선택한 대상을 태운다. */}
	void unload() { /* 선택한 대상을 내린다. */ }
}

public class Ex7_10 {
	public static void main(String[] args) {
		 Unit[] group = {new Marine(), new Tank(), new Dropship()};
		 for (int i = 0; i<group.length; i++) {
			 group[i].move(100, 200);
			 // 해당 부분만 봐서는 Unit 클래스의 move를 호출한 것 같지만 아니다.
			 // 완성된 move를 호출한다. 즉, 인스턴스들의 move 메서드가 호출되는 것. (당연함)
		 }
	}
}
