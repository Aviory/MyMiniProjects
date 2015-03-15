package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TablePanel extends JPanel {
	
	MyTableModel tm = null;
	JTextField txt = null;
	JTable tbl = null;

	public TablePanel(){
		setLayout(null);
		tm = new MyTableModel();
		tbl = new JTable(tm);
		JScrollPane scp = new JScrollPane();
		scp.setBounds(10, 10, 450, 250);
		
		txt = new JTextField();
		txt.setBounds(200, 310, 120, 20);
		add(txt);
		
		JButton btn = new JButton("Simple load");
		btn.setBounds(10, 310, 120, 20);
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//tm.load();
				tbl.revalidate();
//				txt.setText("" + tm.getRowCount());
				tm.init();
				
				
			}
		});
		
	}

}
