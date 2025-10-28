package Update;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Update {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/java";
		String user="root";
		String pass="12345678";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		String Query="update department set depname=? where depid=?;";
		PreparedStatement st=con.prepareStatement(Query);
		st.setInt(2, 2);
		st.setString(1,"CSE");
		st.executeUpdate();
		System.out.println("Row Updateded");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
