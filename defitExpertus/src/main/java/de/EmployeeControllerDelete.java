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
@WebServlet("/employeeDelete")
public class EmployeeControllerDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String HTML_START="<html><body>";
	public static final String HTML_END="</body></html>";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeControllerDelete() {
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
        
        
        // delete employee from database
        int rt=Database.deleteEmployee(firstname,lastname);
        
        //return to the correct page
        if(rt==0) {
        	response.sendRedirect("DeletedFail.html");
        }else {
        	response.sendRedirect("DeleteWin.html");
        }
        
	}
	
	

}
