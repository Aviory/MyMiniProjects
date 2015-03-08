package Calc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class AlistCalc extends JFrame{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,p,m,d,u,r;
	JTextField t1;
	JLabel l1;
	int i;
	String s;
	String numS;

	public AlistCalc(){
		setLayout(new FlowLayout());
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		u = new JButton("*");
		d = new JButton("/");
		m = new JButton("-");
		p = new JButton("+");
		r = new JButton("=");
		t1 = new JTextField(20);
		l1 = new JLabel();
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(p);
		add(m);
		add(d);
		add(u);
		add(r);
	}
	public class Lisener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			s +="1";
			t1.setText(s);
			
			
		}
		if(e.getSource()==b2)
		{
			s +="2";
			t1.setText(s);
		}
		if(e.getSource()==b3)
		{
	
		}
		if(e.getSource()==b4)
		{
			
		}
		if(e.getSource()==b5)
		{
			
		}
		if(e.getSource()==b6)
		{
			
		}
		if(e.getSource()==b7)
		{
			
		}
		if(e.getSource()==b8)
		{
			
		}
		if(e.getSource()==b9)
		{
			
		}
		if(e.getSource()==b0)
		{
			
		}
		}
	}

}
