package Calc;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class Painter extends JPanel implements MouseInputListener{
	int x;
	int y;
	public Painter() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {	
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {	
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics2D gg = (Graphics2D) getGraphics();
		gg.setColor(Color.black);
		gg.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
