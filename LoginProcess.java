import java.sql.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginProcess
 */
@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginProcess() {
        super();
        // TODO Auto-generated constructor stub
    }
   

    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		response.getWriter().append("Served at: ").append(request.getContextPath());
    		doPost(request,response);
    	}

    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		String uname = request.getParameter("uname");
    		String password = request.getParameter("password");
    		  if(LoginDao.validate(uname, password)){  
    		    System.out.println("Your are successfully logged in!!");
    		    RequestDispatcher dispatcher = request.getRequestDispatcher("1.jsp");
    	        dispatcher.forward(request, response);
    		  }
    		    else{  
    		    	 System.out.println("Log in Failed!!"); 
    		    } 
    		  try {
    			Insert(request, response);
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		  
    	}
    	
    	  private void Insert(HttpServletRequest request, HttpServletResponse response)
    	            throws SQLException, ServletException, IOException {
    		  	String fname = request.getParameter("fname");
    		  	String lname = request.getParameter("lname");
    		  	String email = request.getParameter("email");
    	        String gender = request.getParameter("gender");
    	        int age = Integer.parseInt(request.getParameter("age"));
    	        String username = request.getParameter("username");
    			String pass = request.getParameter("pass");
    			boolean status=LoginDao.insert( fname, lname, email, gender, age, username, pass); 
    			if(status= true)  
    			System.out.print("You are successfully registered");  
    	        
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
    	        dispatcher.forward(request, response);
    	 
    	    }
    	
    	  
    
    	  }

	
