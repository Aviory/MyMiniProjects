package Calc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PaintColor extends JFrame{
	Listener L = new Listener();
	JButton black, red, green;
	public PaintColor(){
		setLayout(new FlowLayout());
		black = new JButton("Black");
		red = new JButton("Red");
		green = new JButton("Green");
		add(black);
		add(red);
		add(green);
		black.addActionListener(L);
		red.addActionListener(L);
		green.addActionListener(L);
	}
	public class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==black){
				
			}
			
		}
		
	}

}
