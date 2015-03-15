package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel 
{
	ArrayList<Person> list = new ArrayList<>();
	public MyTableModel()
	{
		list = new ArrayList<Person>();
		init();
	}

	public void init() {
		list.add(  new Person(1, "Al#x", "Gr@mm", 25 ) );
		list.add(  new Person(2, "Nik", "Joy", 17 ) );
		list.add(  new Person(3, "В-ся", "Павлов", 22 ) );
		list.add(  new Person(4, "jenna", "marbles", 46 ) );
		list.add(  new Person(5, "Luk", "Skywoker", 165 ) );
		list.add(  new Person(6, "SARa", "FiShBorn", 177 ) );
		list.add(  new Person(7, "Liza", "Patrik", 24 ) );
		list.add(  new Person(8, "Ira", "Sorrow", 16 ) );
		list.add(  new Person(9, "Kira", "Kira", 33 ) );
		list.add(  new Person(10, "John", "Prime", 50 ) );
		
	}

	public void load() {
		try
		{

			Class.forName("org.h2.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM Person where Age in (22,23,25)");
			while( rs.next() ) 
			{
//				Person p = new Person();
//				p.id    = rs.getInt(1);
//				p.FName = rs.getString(2);
//				p.LName = rs.getString("LName");
//				p.age   = rs.getInt("Age");
//				list.add(p);
			
			}
		}
		catch(InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void load(String id, String FName, String LName, String age) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Class.forName("org.h2.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
		Statement st = conn.createStatement();
		
		Statement stmt = conn.createStatement();
		String str = "INSERT INTO person (Id, FName, LName, Age) VALUES ("+ id + ", "+ "'" + FName + "', " + "'" + LName + "', " + age + ")";
		String sql = str;
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();	
		
	}
		
		
	}
	

