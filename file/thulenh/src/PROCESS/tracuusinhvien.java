package PROCESS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DATA.getconnect;


public class tracuusinhvien {
	@SuppressWarnings("rawtypes")
	Vector row;
	String column[];
	int columncount;
	Connection c=new getconnect().getcon();
	public DefaultTableModel tb2=new DefaultTableModel();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public tracuusinhvien(int tktheo, String tim, DefaultTableModel tb2) {
		
		if(tim.length()==0){
			JOptionPane.showMessageDialog(null,"Bạn cần nhập từ khóa để tìm", "Thông báo",1);
		}else {
			try {
				 Statement stmt = c.createStatement();
				 String sql;
				 if(tktheo==0){
					 sql="select mssv,ten,quequan,lop,ngaysinh,gioitinh,maph,khoa,doituong from sinhvien where mssv='"+tim+"';";
				 }else {
					 sql="select mssv,ten,quequan,lop,ngaysinh,gioitinh,maph,khoa,doituong from sinhvien where ten='"+tim+"';";
				}
				 ResultSet rs=stmt.executeQuery(sql);
				 ResultSetMetaData metadata=rs.getMetaData();
				 columncount=metadata.getColumnCount();
				 column= new String[]{"MSSV", "Tên", "Quê quán", "Lớp", "Ngày sinh", "Giới tính", "Mã phòng", "Khoa", "Đối tượng"};
				 this.tb2.setColumnIdentifiers(column);
				 while(rs.next()){
					 row=new Vector();
					 for(int i=1;i<=columncount;i++){
						 row.add(rs.getString(i));
					 }
					 this.tb2.addRow(row);
				 }
				 rs.close();
				 stmt.close();
				 c.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}






