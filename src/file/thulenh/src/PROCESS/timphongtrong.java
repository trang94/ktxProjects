package PROCESS;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import DATA.getconnect;

/**
 *
 * @author Trang Hoc
 */
public class timphongtrong {
     Connection c = new getconnect().getcon();
     String khui;
     String loai_p;
     @SuppressWarnings("rawtypes")
	Vector ro,co;
     int numbercolumn;
     public DefaultTableModel tba=new DefaultTableModel();
     @SuppressWarnings({ "rawtypes", "unchecked" })
	public timphongtrong(int khu,int loaiph,DefaultTableModel tba)
     { if(khu==0)khui="b5";
        if(khu==1)khui="b6";
        if(khu==2)khui="b7";
        if(loaiph==0) loai_p="nam";
        if(loaiph==1) loai_p="nu";
        try {
                Statement stmt = c.createStatement();
                    co = new Vector();
                String sql="select maph,songuoi from phong where nha='"+khui+"'and songuoi<10 and loaiphong='"+loai_p+"'order by songuoi desc;";
               
                //co = new Vector();
               //
                ResultSet rs=stmt.executeQuery(sql);
                ResultSetMetaData metaData=rs.getMetaData();
                numbercolumn=metaData.getColumnCount();
                for(int i=1;i<=numbercolumn;i++){
                	co.add(metaData.getColumnName(i));
                }
                this.tba.setColumnIdentifiers(co);
                while(rs.next()){
                	ro=new Vector();
                	for(int i=1;i<=numbercolumn;i++){
                		ro.add(rs.getString(i));
                	}
                	this.tba.addRow(ro);
                }
                rs.close();
                stmt.close();
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
     }
}
