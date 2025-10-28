package Select;

import java.sql.*;
public class Select {

	public static void main(String[] args) {
		
		String Url="jdbc:mysql://localhost:3306/java";
		String User="root";
		String Pass="12345678";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(Url,User,Pass);
		
		System.out.println("Connection Established");
		
		String Query="select * from department;";
		PreparedStatement st=con.prepareStatement(Query);
		
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("depid")+" "+rs.getString("depname"));
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		String Query="select * from Students;";
	}

}
