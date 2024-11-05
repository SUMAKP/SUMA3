package selenium_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/Credentials";
		String usn="root";
		String pwd="root";
		Connection Connection = DriverManager.getConnection(url, usn, pwd);
		Statement statement = Connection.createStatement();
		ResultSet query = statement.executeQuery("select * from Testdata");
		query.next();
		String usn1=query.getString("usn");
		String pwd1=query.getString("pwd");
		System.out.println(usn1 + " " +pwd1);
		query.next();
		String usn2=query.getString("usn");
		String pwd2=query.getString("pwd");
		System.out.println(usn2 + " " +pwd2);
		query.next();
		String usn3=query.getString("usn");
		String pwd3=query.getString("pwd");
		System.out.println(usn3 + " " +pwd3);
		
		
		
		
		
		

	}

}
