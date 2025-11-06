package JDBC;


//import JDBC packages

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select{
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/java";
		String user="root";
		String pass="12345678";
		try {
//			Register and Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
//			create a connection
			Connection con=DriverManager.getConnection(url,user,pass);
		
			String Create="Create table students(id int,name varchar(30),department varchar(6));";
			String Insert="insert into students values(?,?,?),(?,?,?);";
			String Select="select * from students;";
//			Create the statement			
			PreparedStatement cst=con.prepareStatement(Create);
			PreparedStatement ist=con.prepareStatement(Insert);
			PreparedStatement sst=con.prepareStatement(Select);
		
			
//			execute the statement
			cst.executeUpdate();
			ist.setInt(1, 1);
			ist.setString(2, "Niranjan");
			ist.setString(3, "CSBS");
			
			ist.setInt(4, 2);
			ist.setString(5, "Teju");
			ist.setString(6, "CSE");
			ist.executeUpdate();
			ResultSet rs=sst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("department"));
			}
			
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			}
}
}