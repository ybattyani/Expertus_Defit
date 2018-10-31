package de;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
//@WebServlet("/employeeAdd")
public class EmployeeControllerAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeControllerAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// read form fields
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        int salary = Integer.parseInt(request.getParameter("salary"));
        //create employee object
        Employee emp=new Employee(firstname, lastname, salary);
        
        // Add the employee to the database
        Database.addEmployee(emp);
      
        // return response
        response.sendRedirect("AddWin.html");
       
	}
	
	

}
