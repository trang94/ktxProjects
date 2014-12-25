package PROCESS;

import java.sql.DriverManager;
import java.sql.SQLException;

public class checklogin {
    private boolean checklog;
    public checklogin(String user,String pass) throws ClassNotFoundException
    {
        try {
            Class.forName("org.postgresql.Driver");
            DriverManager.getConnection("jdbc:postgresql://localhost:5432/kitucxa",
	                   user, pass);

            setChecklog(true);
   
        } catch ( SQLException e) {
            

        	setChecklog(false);
        	return;
        }
    
    }
	public boolean isChecklog() {
		return checklog;
	}
	public void setChecklog(boolean checklog) {
		this.checklog = checklog;
	}
}

