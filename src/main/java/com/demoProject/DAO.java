package com.demoProject;

import java.sql.*;

public class DAO {
	Connection con;
    Statement st;
	public DAO() throws ClassNotFoundException, SQLException
	{
		
		String user="xxxx";
		String password ="xxxxx";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String url = "jdbc:sqlserver://localhost:1433;databaseName=Users_DB;encrypt=true;trustServerCertificate=true;";
		Connection con = DriverManager.getConnection(url,user,password);
		
		 st = con.createStatement();

	}
	public boolean validate_user (User user) throws SQLException
	{
		String query = "select user_name , password from users";
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			if(rs.getString(1).equals(user.getUsername()) && rs.getString(2).equals(user.getPassword()) )
				return true;
		}
		return false;
		
		
	}

}
