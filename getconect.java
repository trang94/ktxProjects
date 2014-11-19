import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class getconect {
	private Connection a;
	public void setconnect(Connection a)
	{
		this.a=a;
	}
	public Connection getcon(){
		return this.a;
	}
	public getconect()
	{
		
	    	Connection a1;
	        try
	        {
	            Class.forName("org.postgresql.Driver");
	            a1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kitucxa",
	                   "postgres", "123456");
	            setconnect(a1);
	        }
	        catch (Exception ex)
	        {
	        	 JOptionPane.showMessageDialog(null, "so ban qua den");
	            System.out.println(ex);
	        }
	    
	}
}
