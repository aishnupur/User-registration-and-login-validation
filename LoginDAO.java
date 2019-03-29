import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginDao {
	private static Connection con = null;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sampledb?", "root", "pass1234");
		} catch (Exception e) {
		}
	}

	public static Boolean validate(String uname, String password) {
		boolean status = false;

		String query = "select * from user where username=? and pass=?";

		try {

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, password);
			System.out.println("Hello3");
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		}

		catch (NullPointerException e) {
		} catch (Exception e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
		return status;
	}
	public static boolean insert(String fname, String lname, String email, String gender, int age, String username, String pass){  
		System.out.println("Hello3");

		String query1="insert into user values(?,?,?,?,?,?,?)";
		boolean status = false;
		try{  
			PreparedStatement ps=con.prepareStatement(query1);  
			ps.setString(1,fname); 
			System.out.println("hello");
			ps.setString(2,lname);
			ps.setString(3,email);  
			ps.setString(4,gender);
			ps.setInt(5,age); 
			ps.setString(6,username);
			ps.setString(7,pass);
			ps.executeUpdate();
			}

		catch(NullPointerException  e){
			
		}
		catch (Exception e) {
		    System.out.println("Exception occurred");
		    e.printStackTrace();
		}
		return status;
		} 


}
