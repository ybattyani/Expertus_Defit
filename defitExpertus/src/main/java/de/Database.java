package de;


import java.sql.*;
public class Database {
		
	public static void addEmployee(Employee emp) {
		//Set the class driver
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
		try  {
			//set the connection to the database
			Connection conn = DriverManager.getConnection(
 	               "jdbc:mysql://localhost:3306/employeeDB?useSSL=false", "root", "password");
			//create a statement
			Statement stmt = conn.createStatement();
			//the mySQL  insert function
			String str = "insert into employee values('"+emp.getFirstName()+"', '"+emp.getLastName()+"', "+emp.getSalary()+" );";
			stmt.executeUpdate(str);
			}catch(SQLException ex) {
				ex.printStackTrace();
			}	
	}
	
	public static int deleteEmployee(String fn, String ln) {
		//Set the class driver
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
		try {
			//set the connection to the database
			Connection conn = DriverManager.getConnection(
 	               "jdbc:mysql://localhost:3306/employeeDB?useSSL=false", "root", "password");
			//create a statement
			Statement stmt = conn.createStatement();
			//the mySQL  delete function
			String str = "delete from employee where firstname='"+fn+"' and lastname='"+ln+"';";
			return stmt.executeUpdate(str);
			
			}catch(SQLException ex) {
				ex.printStackTrace();
				return 0;
			}
	}
	
	public static String retriveAll() {
		//Set the class driver
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
		try {
			//set the connection to the database
			Connection conn = DriverManager.getConnection(
 	               "jdbc:mysql://localhost:3306/employeeDB?useSSL=false", "root", "password");
			//create a statement
			Statement stmt = conn.createStatement();
			
			String result="";
			//the mySQL select function
			String strSelect = "select * from employee";
			ResultSet rset = stmt.executeQuery(strSelect);

			//print the database to the result string
			while(rset.next()) {   // Move the cursor to the next row, return false if no more row
				String fn = rset.getString("firstname");
				String ln = rset.getString("lastname");
				int    sl = rset.getInt("salary");
				result+=fn + ", " + ln + ", " + sl+"<br>";
			}
			return result;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
		
	}
}
