package ch7;

class Point_0 {
	int x;
	int y;
	
	String getLocation() {
		return "x: " + x + ", y: " + y; 
	}
}

class Point3D_0 extends Point_0 {
	int z;
	
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}

public class Ex7_0 {

	public static void main(String[] args) {
		Point_0 p1 = new Point_0();
		Point3D_0 p2 = new Point3D_0();
		
		p1.x = 3;
		p1.y = 4;
		
		p2.x = 3;
		p2.y = 4;
		p2.z = 5; 
		
		System.out.println(p1.getLocation());
		System.out.println(p2.getLocation());
	}

}
