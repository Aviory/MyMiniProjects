package Calc;

import javax.swing.JFrame;

public class PaintFrame extends JFrame {
	public PaintFrame() {
		setTitle("Paint");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		add(new Painter());
		setVisible(true);
	}
}
