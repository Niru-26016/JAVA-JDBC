package connect;

import java.sql.*;

public class Connect {
	
	public static void main(String[]a) {
		
		String Url="jdbc:mysql://localhost:3306/java";
		String User="root";
		String Pass="12345678";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(Url, User, Pass);
			System.out.print("Connection Established");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}

}
