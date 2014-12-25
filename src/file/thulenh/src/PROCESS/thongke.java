package PROCESS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import DATA.getconnect;


public class thongke {
	@SuppressWarnings("rawtypes")
	Vector row;
	public DefaultTableModel tbtk=new DefaultTableModel();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public thongke(DefaultTableModel tbtk) {
		// TODO Auto-generated constructor stub
		Connection c= new getconnect().getcon();
		try {
			Statement stmt=c.createStatement();
			String sql="select nha,sum(thu) as m from (select nha ,phong.maph,(sum(tiendien)+sum(tnuoc))/count(sinhvien.mssv) +sum(tientro1thang) as thu from phong,sinhvien,diennuoc,doituong where sinhvien.maph=diennuoc.maph and doituong.doituong=sinhvien.doituong and sinhvien.maph =phong.maph group by phong.maph) as b group by nha;";
			ResultSet rs=stmt.executeQuery(sql);
			String column[]=new String[]{"Khu", "Tổng thu"};
			this.tbtk.setColumnIdentifiers(column);
			while(rs.next()){
				row=new Vector();
				for(int i=1;i<=2;i++){
					row.add(rs.getString(i));
				}
				this.tbtk.addRow(row);
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
