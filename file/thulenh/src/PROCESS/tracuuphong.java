package PROCESS;




import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DATA.getconnect;

public class tracuuphong {

    Connection c = new getconnect().getcon();
    public String loai;
	public String quanly;
	String khui;
    @SuppressWarnings("rawtypes")
	Vector row;
    String column[];
    int numbercolumn;
	public DefaultTableModel tb=new DefaultTableModel();
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public tracuuphong(int khu, String phong, String loai, String quanly,DefaultTableModel tb) {
        if(khu==0)khui="b5";
        if(khu==1)khui="b6";
        if(khu==3)khui="b7";
        String maphong;
        maphong= khui+"-"+phong;
    	if (phong.length() == 0) {
            JOptionPane.showMessageDialog(null, "Bạn cần nhập từ khóa để tìm", "Thông báo", 1);
            
        } else {
            try {
                Statement stmt = c.createStatement();
                String sql="select loaiphong,quanlynha from nha,phong where nha.tennha=phong.nha and maph='"+maphong+"';";
                ResultSet rs1=stmt.executeQuery(sql);
                while(rs1.next()){
                this.quanly=rs1.getString(2);
                this.loai=rs1.getString(1);
                }

                String sql1="select mssv,ten,khoa,ngayvao from sinhvien where maph = '"+maphong+"';";
                ResultSet rs2=stmt.executeQuery(sql1);
                ResultSetMetaData metaData=rs2.getMetaData();
                numbercolumn=metaData.getColumnCount();
                column= new String[]{"MSSV","Tên","Khoa","Ngày vào"};
                this.tb.setColumnIdentifiers(column);
                while(rs2.next()){
                	row=new Vector();
                	for(int i=1;i<=numbercolumn;i++){
                		row.add(rs2.getString(i));
                	}
                	this.tb.addRow(row);
                }
                rs2.close();
                rs1.close();
                stmt.close();
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }



}
