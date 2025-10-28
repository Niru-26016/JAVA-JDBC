package Create;
import java.sql.*;
public class Create {

	public static void main(String[] args) {
		
		String Url="jdbc:mysql://localhost:3306/java";
		String User="root";
		String Pass="12345678";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(Url,User,Pass);
		Statement st=con.createStatement();
		System.out.println("Connection Established");
		String Query="create table department(depid int,depname varchar(5) );";
		st.executeUpdate(Query);
		System.out.println("Table Created");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
