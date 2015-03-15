package base;

import javax.swing.JFrame;

public class TableFrame extends JFrame {
	public TableFrame(){
		setTitle("Table Person");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50, 50, 500, 400);
		add( new TablePanel());
		setVisible(true);
	}

}
