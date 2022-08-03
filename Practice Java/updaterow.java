import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updaterow {

	public static void main(String[] args) throws Exception{
		int i=0;
		// Step 1
        Class.forName(
                "com.mysql.cj.jdbc.Driver");
        	// Step 2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sajidsir","root","infoserver123");  
			// Step 3
			Statement stmt=con.createStatement();
			if(con!=null)
			{
				System.out.println("Connection done");
			}
	         String text = "UPDATE jdbc " +
	                 "SET firstName = 'Mohit' WHERE id =4";
		    stmt.executeUpdate(text);
		    System.out.println("Updated");
    		
		    stmt.close();
		    
			con.close();
	}
}