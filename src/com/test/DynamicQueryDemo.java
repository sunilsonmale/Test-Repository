package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/adviktestdb";
		String user ="root";
		String pwd="advik";

		Connection con = DriverManager.getConnection(url, user, pwd);
		
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your query :: ");
		
		String query = sc.nextLine();
		
		boolean b = st.execute(query);
		
		if(b) {
			ResultSet rs = st.getResultSet();
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" :: "+rs.getString(2)+" ::  "+rs.getString(3)+" ::  "+rs.getString(4));
			}
			
		}
		else {
			int rows= st.getUpdateCount();
			System.out.println("no of rows affected is : "+rows);
		}
		
		
	}

}
