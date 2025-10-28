package Insert;
import java.sql.*;
public class Insert {

	public static void main(String[] args) {

		String Url="jdbc:mysql://localhost:3306/java";
		String User="root";
		String Pass="12345678";
		
		try {
			
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con =DriverManager.getConnection(Url,User,Pass);
		 String Query="insert into department values(?,?);";
		 PreparedStatement st=con.prepareStatement(Query);
		 st.setInt(1, 3);
		 st.setString(2, "AIDS");
		 st.executeUpdate();
		 st.setInt(1, 3);
		 st.setString(2, "AIML");
		 st.executeUpdate();

		 System.out.println("Row(s) Inserted");
		 
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
}

}
