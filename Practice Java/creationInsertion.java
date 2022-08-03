import java.sql.*;

public class creationInsertion {

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
			
/*		    String sql = "CREATE TABLE jdbc" 
		            + "(id INTEGER not NULL, "
		            + " firstName VARCHAR(50), " 
		            + " lastName VARCHAR(50), "
		            + " age INTEGER, " 
		            + " PRIMARY KEY ( id ))";

		    stmt.executeUpdate(sql);
		    System.out.println("Created table in given database...");
		    */
		    
		    
		    String text = "INSERT INTO jdbc(id,firstName,lastName,age)"
		    		+ "VALUES (38,'Satish','Singh',24),"
		    		+ "(65,'Heena','Shah',7),"
		    		+ "(25,'Harsh','Hing',22),"
		    		+ "(47,'Tata','Shah',7),"
		    		+ "(23,'Utkarsh','Daate',20),"
		    		+ "(9,'Manjeet','Dharwe',7),"
		    		+ "(33,'Kavish','Halve',19),"
		    		+ "(15,'Arjun','Shah',7)";
		    
		    System.out.println("Value Inserted");
    		
		  
		    stmt.executeUpdate(text);
		    		
		    stmt.close();
		    
		    // Step 4
			//ResultSet rs=stmt.executeQuery("select * from orders where shipperID = 2"); 
			//while(rs.next())  
			//System.out.println(i++ +" >>     "+rs.getInt(1)+" | "+rs.getInt(2)+" | "+rs.getInt(3)+" |  "+rs.getString(4)+" | "+rs.getString(5));
			con.close();
			

	}
}
