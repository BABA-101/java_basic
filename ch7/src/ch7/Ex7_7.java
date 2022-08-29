package ch7;

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr...");
	}
	void stop() {
		System.out.println("STOP!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("warter!!!!");
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine(); // 인스턴스는 FireEngine임을 기억하
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // 생략 가능. 조상으로의 형변환
		//car.water(); 사용 불가능. car 리모컨은 water() 기능 버튼이 없다
		fe2 = (FireEngine)car; // 인스턴스가 FireEngine이기에 충분히 가능하다
		fe.water();

	}

}
