package Parse;
import Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List <Person> pp = new ArrayList<Person>();
		
		
		
		public static void loadFromH2(List<Person> pp) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
		{
			Class.forName("org.h2.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM Person where Age in (22,23,25)");
			while( rs.next() ) 
			{
				Person p = new Person();
				p.id    = rs.getInt(1);
				p.FName = rs.getString(2);
				p.LName = rs.getString("LName");
				p.age   = rs.getInt("Age");
				pp.add(p);
			}
		}
	}

}
