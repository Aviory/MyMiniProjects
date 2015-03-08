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

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,p,m,d,u,r,c;
	static JTextField t1;
	int action = 0;
	String s="";
	String sumS;
	Lisener Lisener = new Lisener();


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
		c = new JButton("c");
		t1 = new JTextField(16);
		t1.setEditable(false);

		add(t1);
		add(b7);
		add(b8);
		add(b9);
		add(u);
		add(b4);
		add(b5);
		add(b6);
		add(d);
		add(b1);
		add(b2);
		add(b3);
		add(m);

		add(c);
		add(r);
		add(p);

		b1.addActionListener(Lisener);
		b2.addActionListener(Lisener);
		b3.addActionListener(Lisener);
		b4.addActionListener(Lisener);
		b5.addActionListener(Lisener);
		b6.addActionListener(Lisener);
		b7.addActionListener(Lisener);
		b8.addActionListener(Lisener);
		b9.addActionListener(Lisener);
		b0.addActionListener(Lisener);
		p.addActionListener(Lisener);
		m.addActionListener(Lisener);
		d.addActionListener(Lisener);
		u.addActionListener(Lisener);
		r.addActionListener(Lisener);
		c.addActionListener(Lisener);
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
				s +="3";
				t1.setText(s);
			}
			if(e.getSource()==b4)
			{
				s +="4";
				t1.setText(s);
			}
			if(e.getSource()==b5)
			{
				s +="5";
				t1.setText(s);
			}
			if(e.getSource()==b6)
			{
				s +="6";
				t1.setText(s);
			}
			if(e.getSource()==b7)
			{
				s +="7";
				t1.setText(s);
			}
			if(e.getSource()==b8)
			{
				s +="8";
				t1.setText(s);
			}
			if(e.getSource()==b9)
			{
				s +="9";
				t1.setText(s);
			}
			if(e.getSource()==b0)
			{
				s +="0";
				t1.setText(s);
			}
			if(e.getSource()==r)
			{
				if(action==1)
				{
					int sum = Integer.parseInt(sumS) + Integer.parseInt(t1.getText());
					s=Integer.toString(sum);
					t1.setText(s);
				}
				if(action==2)
				{
					int sum = Integer.parseInt(sumS) - Integer.parseInt(t1.getText());
					s=Integer.toString(sum);
					t1.setText(s);
				}
				if(action==3)
				{
					int sum = Integer.parseInt(sumS) / Integer.parseInt(t1.getText());
					s=Integer.toString(sum);
					t1.setText(s);
				}
				if(action==4)
				{
					int sum = Integer.parseInt(sumS) * Integer.parseInt(t1.getText());
					s=Integer.toString(sum);
					t1.setText(s);
				}
			}
			if(e.getSource()==p)
			{
				sumS=s;
				s="";
				t1.setText(s);
				action=1;
			}
			if(e.getSource()==m)
			{
				sumS=s;
				s="";
				t1.setText(s);
				action=2;
			}
			if(e.getSource()==u)
			{
				sumS=s;
				s="";
				t1.setText(s);
				action=4;
			}
			if(e.getSource()==d)
			{
				sumS=s;
				s="";
				t1.setText(s);
				action=3;
			}
			if(e.getSource()==c)
			{
				sumS="";
				s="";
				t1.setText(s);
				action=0;
			}
		}
	}

}
