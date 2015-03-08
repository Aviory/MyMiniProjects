package Calc;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		AlistCalc calc = new AlistCalc();
		calc.setVisible(true);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(270,200);
		calc.setResizable(false);
		calc.setLocationRelativeTo(null);

	}

}
