package base;

public class Person {

	int    id    = 0;
	String FName = null;
	String LName = null;
	int    age   = 0;
	
	Person(int id, String FName, String LName, int age){
		this.id=id;
		this.FName=FName;
		this.LName=LName;
		this.age=age;
	}
	@Override
	public String toString() {
	String str=id +" " +FName+" "+ LName+" "+age;
	return str;
	
	}
}
