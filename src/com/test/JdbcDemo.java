package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/adviktestdb";
			String user ="root";
			String pwd="advik";

			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.println(con);


			Statement st = con.createStatement();

			ResultSet rs= st.executeQuery("select * from EmployeeManagement");

			while(rs.next())
			{
				System.out.println(rs.getString(1)+" :: "
						+rs.getString(2)+" :: "
						+rs.getString(3) +" :: "
						+rs.getString(4)+" :: "
						+rs.getDate(5)+" :: "
						+rs.getInt(6)+" :: "
						+rs.getDate(7)
						);
			}



			con.close();


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}
