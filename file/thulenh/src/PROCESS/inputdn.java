package PROCESS;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

import DATA.getconnect;


public class inputdn {
	String khu;
	public DefaultTableModel tbdn= new DefaultTableModel();
	public inputdn(int khui,DefaultTableModel tbdn) {
	Connection c=new getconnect().getcon();

		if(khui==0)khu="b5";
		if(khui==1)khu="b6";
		if(khui==2)khu="b7";
		try {
			Statement stmt=c.createStatement();
			String sql="select maph from phong where songuoi>0 and nha like '"+khu+"%';";
			ResultSet rs=stmt.executeQuery(sql);
			String[] column=new String[]{"Ma Phong","So dien","So nuoc"};
			this.tbdn.setColumnIdentifiers(column);
			while(rs.next()){
				String row[]=new String[12];
				row[0]=rs.getString(1);
				row[1]="0";
				row[2]="0";
				this.tbdn.addRow(row);
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
