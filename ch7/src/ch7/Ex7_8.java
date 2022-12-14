package ch7;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0); //보너스포인트는 제품 가격의 10%
	}
}

class Tv1 extends Product{
	Tv1(){
		super(100); //조상클래스의 생성자 소환
	}
	// Object 클래스의 toString() 오버라이딩.
	// toString(): 객체가 가진 정보를 문자열로 나타내주는 메서드
	public String toString() { return "TV"; }
}

class Computer extends Product{
	Computer() { super(200); }
	public String toString() { return "Computer"; }
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		// 여기서 p가 의미하는 것은 p.toString임. p만 출력하면 자동으로 toString 출력되는데 위에서 오버라이딩 했으니 제품명이 뜨겠지.
		System.out.println(p + " 을/를 구입하셨습니다.");
	}
}

public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money +" 만원 입니다.");
		System.out.println("현재 보너스 점수는 "+ b.bonusPoint + "점 입니다.");

	}

}
