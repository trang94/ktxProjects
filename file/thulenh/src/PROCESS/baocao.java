package PROCESS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import DATA.getconnect;


public class baocao {
	public DefaultTableModel tbbc=new DefaultTableModel();
	public String mssv;
	public String name;
	public String ngayvao;
	public String phong;
	String khu;
	@SuppressWarnings("rawtypes")
	Vector row;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public baocao(String mssv, String name, String ngayvao, String phong,
			int khui, DefaultTableModel tbbc) {
		// TODO Auto-generated constructor stub
		Connection c=new getconnect().getcon();
		if(khui==0)khu="b5";
		if(khui==1)khu="b6";
		if(khui==2)khu="b7";
		try {
			Statement stmt=c.createStatement();
			String sql="select * from sinhvien where ngayvao=(select min(ngayvao) from sinhvien where maph like '"+khu+"%') and maph like '"+khu+"%';";
			ResultSet rs=stmt.executeQuery(sql);
			rs.next();
			this.mssv=rs.getString("mssv");
			this.name=rs.getString("ten");
			this.phong=rs.getString("maph");
			this.ngayvao=rs.getString("ngayvao");
			String sql1="select diennuoc.maph,dtt,dts,sum_sd,ntt,nts,sum_nc,tiendien,tnuoc from diennuoc,phong where diennuoc.maph=phong.maph and songuoi>0 and diennuoc.maph like '"+khu+"%';";
			ResultSet rs1=stmt.executeQuery(sql1);
			String[] column= new String [] {"Mã phòng", "Số điện tháng trước", "Số điện tháng này", "Tổng số điện", "Số nước tháng trước", "Số nước tháng này", "Tổng số nước", "Tiền điện","Tiền nước"};
			this.tbbc.setColumnIdentifiers(column);
			while(rs1.next()){
				row=new Vector();
				for(int i=1;i<=9;i++){
					row.add(rs1.getString(i));
				}
				this.tbbc.addRow(row);
			}
			rs1.close();
			rs.close();
			stmt.close();
			c.close();
		} catch (SQLException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}

}
