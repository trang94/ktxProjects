package PROCESS;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DATA.getconnect;


public class tracuudn {
	public DefaultTableModel tb3=new DefaultTableModel();
    String[] column;
	@SuppressWarnings("rawtypes")
	Vector row;
	String kh;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public tracuudn(int chon, String phongchon, DefaultTableModel tb3) {

		Connection c = new getconnect().getcon();

		if(phongchon.length()==0){
			JOptionPane.showMessageDialog(null,"Bạn cần nhập từ khóa để tìm", "Thông báo",1);
		}else {
			
		try {
	        if(chon==0)kh="b5";
	        if(chon==1)kh="b6";
	        if(chon==3)kh="b7";
	        String maphong;
	        maphong= kh+"-"+phongchon;
            Statement stmt = c.createStatement();
            String sql="select * from diennuoc where maph='"+maphong+"';";
            ResultSet rs=stmt.executeQuery(sql);
            column= new String[]{"Mã phòng", "Số điện tháng trước", "Số điện tháng này", "Tổng số điện", "Số nước tháng trước", "Số nước tháng này", "Tổng số nước", "Tổng số tiền phải trả"};
            this.tb3.setColumnIdentifiers(column);
            while(rs.next()){
            	row=new Vector();
            	for(int i=1;i<=7;i++){
            		row.add(rs.getString(i));
            	}
            	int tiendien=rs.getInt(8);
            	int tiennuoc=rs.getInt(9);
            	int tien=tiendien+tiennuoc;
            	row.add(tien);
            	this.tb3.addRow(row);
            }
            rs.close();
            stmt.close();
            c.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	}
}
