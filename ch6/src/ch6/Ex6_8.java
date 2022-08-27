package ch6;

class Data3 { int x; }
public class Ex6_8 {

	public static void main(String[] args) {
			Data3 d = new Data3();
			d.x=10;
			
			Data3 d2 = copy(d);
			System.out.println("d.x = "+d.x);
			System.out.println("d2.x = "+d2.x);

	}
	// 새로운 객체를 생성할ㄴ 후 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 반환.
	// 매개변수 뿐만아니라 반환 타입도 참조형이 될 수 있다.
	static Data3 copy(Data3 d) {
		Data3 tmp =  new Data3();
		tmp.x = d.x;
		return tmp;
	}
}
