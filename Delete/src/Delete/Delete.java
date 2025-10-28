package Delete;
import java.sql.*;
public class Delete {
	public static void main(String[]a) {
		
		String Url="jdbc:mysql://localhost:3306/java";
		String User="root";
		String Pass="12345678";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(Url,User,Pass);
		String Query="delete from department where depname=?";
		PreparedStatement st=con.prepareStatement(Query);
		st.setString(1, "EEE");
		st.executeUpdate();
		System.out.println("Row Deleted");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
