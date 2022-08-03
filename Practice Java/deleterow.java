import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleterow {

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
			
			
			String text = "DELETE FROM jdbc " +
		            "WHERE id = 1";
		    stmt.executeUpdate(text);
		    System.out.println("Deleted");
    		
		    stmt.close();
		    
			con.close();
	}
}