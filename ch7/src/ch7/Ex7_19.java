package ch7;
//awt : 자바 윈도우 프로그래밍
import java.awt.*;
import java.awt.event.*;

public class Ex7_19 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}

