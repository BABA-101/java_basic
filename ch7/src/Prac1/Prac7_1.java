package Prac1;
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<cards.length;i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i<10)&&((num==1)||(num==3)||(num==8));
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang =isKwang;
	}
	
	// 인스턴스 출력 시 toString()의 리턴값이 출력되는데, 이를 오버라이딩 한 것. num + K여부
	public String toString() {
		return num + (isKwang ? "K" : "" );
	}
}

public class Prac7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0 ; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
	}
}
