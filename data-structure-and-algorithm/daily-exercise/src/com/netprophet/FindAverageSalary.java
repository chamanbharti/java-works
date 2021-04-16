package com.netprophet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindAverageSalary {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=null;
		Statement stm=null;
		ResultSet rs=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");     
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/angularjs","chaman_bharti", "chaman1234");
			stm = con.createStatement();
			String sql = "select name from employee where salary>(select avg(salary) from employee)";
			rs = stm.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1));
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		con.close();
	}

}
