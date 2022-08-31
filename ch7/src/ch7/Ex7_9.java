package ch7;

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0); //보너스포인트는 제품 가격의 10%
	}
}

class Tv2 extends Product2{
	Tv2(){
		super(100); //조상클래스의 생성자 소환
	}
	// Object 클래스의 toString() 오버라이딩.
	// toString(): 객체가 가진 정보를 문자열로 나타내주는 메서드
	public String toString() { return "TV"; }
}

class Computer2 extends Product2{
	Computer2() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i=0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; //제품명을 Product[] cart에 추가
		System.out.println(p + " 을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum=0;
		String itemList= "";
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i]+", ";	
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum +"만원 입니다.");
		System.out.println("[ 구입한 제품: "+ itemList+ " ]");
	}
}


public class Ex7_9 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
		
		System.out.println("현재 남은 돈은 " + b.money +" 만원 입니다.");
		System.out.println("현재 보너스 점수는 "+ b.bonusPoint + "점 입니다.");
	}
}