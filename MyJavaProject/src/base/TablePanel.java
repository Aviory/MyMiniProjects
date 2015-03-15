package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
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
		txt.setBounds(200, 325, 130, 20);
		add(txt);
		
		JButton btn = new JButton("Simple load");
		btn.setBounds(10, 325, 130, 20);
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//tm.load();
				tbl.revalidate();
//				txt.setText("" + tm.getRowCount());
				tm.init();	
			}
		});//add====================
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(140, 300, 80, 20);
		add(btnAdd);

		final JTextField idField = new JTextField();
		int idFieldY = 270;
		int height = 20;
		int idFieldX = 10;
		int width = 110;
		idField.setBounds(10, 270, 110, 20);
		add(idField);
		//FNAME
		final JTextField FNameField = new JTextField();
		int FNameFieldX = idFieldX+width+3;
		FNameField.setBounds(FNameFieldX, idFieldY, width, height);
		add(FNameField);
		//LNAME
		final JTextField LNameField = new JTextField();
		int LNameFieldX = FNameFieldX+width+3;
		LNameField.setBounds(LNameFieldX, idFieldY, width, height);
		add(LNameField);
		//Age
		final JTextField ageField = new JTextField();
		int ageFieldX = LNameFieldX+width+3;
		ageField.setBounds(ageFieldX, idFieldY, width, height);
		add(ageField);
		final JOptionPane error = new JOptionPane();
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (idField.getText().isEmpty() || 
						FNameField.getText().isEmpty() || 
						LNameField.getText().isEmpty() || 
						ageField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(error, "Заполните все поля!");
				}
				else
				{
					try {
						MyTableModel.load(idField.getText(), FNameField.getText(), LNameField.getText(), ageField.getText());
					} catch (InstantiationException | IllegalAccessException e1) {
						JOptionPane.showMessageDialog(error, e1.getMessage());

					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					idField.setText("");
					FNameField.setText("");
					LNameField.setText("");
					ageField.setText("");
				}	
			}
		});
				
			}
		
	}


