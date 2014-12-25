package GUI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DATA.getconnect;
import PROCESS.*;
/**
 *
 * @author tohai
 */
@SuppressWarnings("serial")
public class quanLiNhaFrame extends javax.swing.JFrame {
    public quanLiNhaFrame() {
        initComponents();
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newsv_khuselect = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        newsv_loaiphongselect = new javax.swing.JComboBox();
        addsv_jScrollPane = new javax.swing.JScrollPane();
        newsv_listphongcon = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        inputdn_inputbt= new javax.swing.JButton();
        newsv_mssvtf = new javax.swing.JTextField();
        newsv_nametf = new javax.swing.JTextField();
        newsv_khoatf = new javax.swing.JTextField();
        newsv_ngaysinhtf = new javax.swing.JTextField();
        newsv_quetf = new javax.swing.JTextField();
        newsv_okbt = new javax.swing.JButton();
        newsv_cancelbt = new javax.swing.JButton();
        newsv_doituong = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        newsv_phongtf = new javax.swing.JTextField();
        newsv_phongtrongbt = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        newsv_loptf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newphong_phongtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        newphong_khuselect = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        newphong_loaiphongselect = new javax.swing.JComboBox();
        newphong_okbt = new javax.swing.JButton();
        newphong_cancelbt = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        inputdn_table = new javax.swing.JTable();
        inputdn_khubc = new javax.swing.JComboBox();
        jLabel65 = new javax.swing.JLabel();
        inputdn_listphongbt = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        editsv_mssv_seachtf = new javax.swing.JTextField();
        editsv_seachbt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        editsv_mssvtf = new javax.swing.JTextField();
        editsv_nametf = new javax.swing.JTextField();
        editsv_ngaysinhtf = new javax.swing.JTextField();
        editsv_quetf = new javax.swing.JTextField();
        editsv_khoatf = new javax.swing.JTextField();
        editsv_okbt = new javax.swing.JButton();
        editsv_cancelbt = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        editsv_phongtf = new javax.swing.JTextField();
        editsv_giotinh = new javax.swing.JComboBox();
        editsv_doituongcb = new javax.swing.JComboBox();
        jLabel61 = new javax.swing.JLabel();
        editsv_loptf = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        doichosv_mssvsv1tf = new javax.swing.JTextField();
        doichosv_mssvsv2tf = new javax.swing.JTextField();
        doichosv_bt = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        editphong_seachtf = new javax.swing.JTextField();
        editphong_seachbt = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        editphong_maph = new javax.swing.JTextField();
        editphong_loaip = new javax.swing.JComboBox();
        editphong_editbt = new javax.swing.JButton();
        editphong_cancelbt = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        deletesvtf = new javax.swing.JTextField();
        Delete_bt = new javax.swing.JButton();
        delete_cancelbt = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        thuhoi_khuphong = new javax.swing.JComboBox();
        thuhoi_phongtf = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        thuhoibt = new javax.swing.JButton();
        thuhoi_cancelbt = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        giaitankhuselect = new javax.swing.JComboBox();
        giaitankhu_okbt = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        tracuusv_loaiseach = new javax.swing.JComboBox();
        tracuusv_seachbox = new javax.swing.JTextField();
        tracuusv_seachbt = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tracuu_sinhvien_list = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        tracuuphong_khu = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        tracuuphong_phongseachtf = new javax.swing.JTextField();
        tracuuphong_Seach = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        tracuuphong_loaiphonglbl = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tracuuphong_listsvOfphong = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        tracuuphong_tenquanly = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        tracuudn_khu = new javax.swing.JComboBox();
        tracuudn_phongtf = new javax.swing.JTextField();
        tracuudn_seach = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tracuudn_ttdiennuoc = new javax.swing.JTable();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        thongkebt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        baocao_listtongthu = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        baocao_mssvlbl = new javax.swing.JLabel();
        baocao_phonglbl = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        baocao_namelbl = new javax.swing.JLabel();
        baocaobt = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        baocao_ngayvaolbl = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        baocao_diennuoc_list = new javax.swing.JTable();
        baocao_khu = new javax.swing.JComboBox();
        jLabel67 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("cung cap thong tin dau truoc khi dien tt sinh vien moi");

        jLabel8.setText("Khu : ");

        newsv_khuselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B5", "B6", "B7" }));

        jLabel9.setText("Loại phòng : ");

        newsv_loaiphongselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        newsv_listphongcon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã phòng", "Số người"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        addsv_jScrollPane.setViewportView(newsv_listphongcon);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("nhap thong tin sinh vien dang ki o duoi : ");

        jLabel11.setText("Họ tên : ");

        jLabel12.setText("MSSV : ");

        jLabel13.setText("Ngày sinh : ");

        jLabel14.setText("Khoa : ");

        jLabel15.setText("Quê quán : ");

        jLabel16.setText("Đối tượng : ");
        newsv_okbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png")));
        newsv_okbt.setText("Add");
        newsv_okbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsv_okbtActionPerformed(evt);
            }
        });
        newsv_cancelbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel.png")));
        newsv_cancelbt.setText("Cancel");
        newsv_cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsv_cancelbtActionPerformed(evt);
            }
        });

        newsv_doituong.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thường", "Con thương binh", "Dân tộc thiểu số", "Vùng sâu, vùng xa, hải đảo", "Mồ côi" }));

        jLabel56.setText("Phòng : ");
        newsv_phongtrongbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-32.png")));
        newsv_phongtrongbt.setText("Tìm phòng còn trống");
        newsv_phongtrongbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsv_phongtrongbtActionPerformed(evt);
            }
        });

        jLabel60.setText("Lớp :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addsv_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(newsv_khuselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newsv_loaiphongselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(newsv_phongtrongbt))
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newsv_nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(59, 59, 59)
                                    .addComponent(newsv_mssvtf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(newsv_quetf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(newsv_ngaysinhtf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(newsv_khoatf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel56)
                                        .addComponent(jLabel60))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(newsv_phongtf, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(newsv_doituong, 0, 169, Short.MAX_VALUE)
                                        .addComponent(newsv_loptf))
                                    .addGap(1, 1, 1)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(newsv_okbt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(newsv_cancelbt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(newsv_khuselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(newsv_loaiphongselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newsv_phongtrongbt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addsv_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newsv_mssvtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newsv_nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(newsv_ngaysinhtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(newsv_quetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newsv_khoatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newsv_doituong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(newsv_phongtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(newsv_loptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newsv_okbt)
                    .addComponent(newsv_cancelbt))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("      Thêm sinh viên      ", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Phòng : ");

       

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Khu : ");

        newphong_khuselect.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newphong_khuselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B5", "B6", "B7" }));
       
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Loại : ");

        newphong_loaiphongselect.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newphong_loaiphongselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nu" }));
        newphong_okbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/yes.png")));
        newphong_okbt.setText("Ok");
        newphong_okbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newphong_okbtActionPerformed(evt);
            }
        });
        newphong_cancelbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel.png")));
        newphong_cancelbt.setText("Cancel");
        newphong_cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newphong_cancelbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newphong_khuselect, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newphong_phongtf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newphong_loaiphongselect, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(newphong_okbt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newphong_cancelbt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(509, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(newphong_phongtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newphong_khuselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newphong_loaiphongselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newphong_okbt)
                    .addComponent(newphong_cancelbt))
                .addContainerGap(461, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Thêm phòng", jPanel3);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setText("Đây là nơi nhập điện nước tháng này : ");

        inputdn_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã phòng", "Số điện", "Số nước"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(inputdn_table);

        inputdn_khubc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B5", "B6", "B7" }));

        jLabel65.setText("Khu : ");
        inputdn_listphongbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-32.png")));
        inputdn_listphongbt.setText("Danh sách phòng của khu");
        inputdn_listphongbt.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		inputdn_listphongbtActionPerformed(evt);
        	}
        });
        inputdn_inputbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png")));
        inputdn_inputbt.setText("Input điện nước");
        inputdn_inputbt.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		inputdn_inputbtActionPerformed(evt);
        	}
        });
        
        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                    	.addComponent(inputdn_inputbt)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65)
                        .addGap(18, 18, 18)
                        .addComponent(inputdn_khubc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputdn_listphongbt)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(inputdn_khubc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(inputdn_listphongbt))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34,34,34)
                .addComponent(inputdn_inputbt)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Nhập điện nước", jPanel14);

        jTabbedPane1.addTab("Thêm thông tin", jTabbedPane2);
        jTabbedPane2.getAccessibleContext().setAccessibleName("");

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("MSSV : ");
        editsv_seachbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-32.png")));
        editsv_seachbt.setText("seach");
        editsv_seachbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsv_seachbtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Đây là thông tin sinh viên,hãy sửa nó theo yêu cầu đặt ra");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Sửa thông tin sinh viên");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setText("Tên : ");

        jLabel18.setText("MSSV : ");

        jLabel19.setText("Quê quán: ");

        jLabel20.setText("Ngày sinh : ");

        jLabel21.setText("Đối tượng : ");

        jLabel22.setText("Khoa : ");
        editsv_okbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit_32.png")));
        editsv_okbt.setText("Edit");
        editsv_okbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsv_okbtActionPerformed(evt);
            }
        });
        editsv_cancelbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel.png")));
        editsv_cancelbt.setText("Cancel");
        editsv_cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsv_cancelbtActionPerformed(evt);
            }
        });

        jLabel23.setText("Giới tính : ");

        jLabel55.setText("Phòng");

        editsv_giotinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        editsv_doituongcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thường", "Con thương binh", "Dân tộc thiểu số", "Vùng sâu,vùng xa,hải đảo", "Mồ côi" }));

        jLabel61.setText("Lớp : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(editsv_mssv_seachtf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(41, 41, 41)
                                            .addComponent(editsv_seachbt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26))))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel17))
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(editsv_mssvtf)
                                        .addComponent(editsv_nametf, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editsv_ngaysinhtf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel61)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(editsv_quetf)
                                .addComponent(editsv_khoatf)
                                .addComponent(editsv_phongtf)
                                .addComponent(editsv_giotinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editsv_doituongcb, 0, 157, Short.MAX_VALUE)
                                .addComponent(editsv_loptf))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(editsv_okbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editsv_cancelbt, javax.swing.GroupLayout.PREFERRED_SIZE,97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editsv_mssv_seachtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editsv_seachbt))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(editsv_mssvtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(editsv_nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(editsv_ngaysinhtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(editsv_quetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(editsv_doituongcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(editsv_khoatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(editsv_giotinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(editsv_phongtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(editsv_loptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editsv_okbt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editsv_cancelbt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Sửa thông tin sinh viên", jPanel4);

        jLabel69.setText("MSSV của sinh viên thứ 1 : ");

        jLabel70.setText("MSSV của sinh viên thứ 2 :  ");
        doichosv_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/switch.jpg")));
        doichosv_bt.setText("Đổi chỗ");
        doichosv_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doichosv_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(18, 18, 18)
                        .addComponent(doichosv_mssvsv1tf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(18, 18, 18)
                        .addComponent(doichosv_mssvsv2tf)))
                .addGap(91, 91, 91)
                .addComponent(doichosv_bt)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(doichosv_mssvsv1tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(doichosv_mssvsv2tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(doichosv_bt)))
                .addContainerGap(617, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Đổi phòng cho 2 sinh viên", jPanel5);

        jLabel24.setText("Nhập mã phòng cần sửa : ");
        editphong_seachbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-32.png")));
        editphong_seachbt.setText("Tìm kiếm");
        editphong_seachbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editphong_seachbtActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Dưới đây là thông tin của phòng hãy sửa nội dung mà bạn muốn sửa : ");

        jLabel26.setText("Mã phòng : ");

        jLabel27.setText("Loại phòng : ");

        editphong_loaip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nam", "Nữ" }));
        editphong_editbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit_32.png"))); 
        editphong_editbt.setText("Edit phòng");
        editphong_editbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editphong_editbtActionPerformed(evt);
            }
        });
        editphong_cancelbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel.png")));
        editphong_cancelbt.setText("Cancel");
        editphong_cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editphong_cancelbtActionPerformed(evt);
            }
        });

        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("(* CHÚ Ý: Nếu thông tin về phòng bị thay đổi thì phòng sẽ bị giải tán)");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(editphong_seachtf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(editphong_seachbt))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editphong_maph, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editphong_loaip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(editphong_editbt)
                        .addGap(55, 55, 55)
                        .addComponent(editphong_cancelbt)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(editphong_seachtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editphong_seachbt))
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(editphong_maph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(editphong_loaip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editphong_editbt)
                    .addComponent(editphong_cancelbt))
                .addContainerGap(445, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Sửa thông tin phòng ", jPanel15);

        jTabbedPane1.addTab("Sửa thông tin", jTabbedPane3);

        jTabbedPane6.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel35.setText("Nhập mã số sinh viên : ");
        Delete_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancel1.png")));
        Delete_bt.setText("Delete");
        Delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btActionPerformed(evt);
            }
        });
        delete_cancelbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel.png")));
        delete_cancelbt.setText("Cancel");
        delete_cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_cancelbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(deletesvtf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Delete_bt)
                        .addGap(18, 18, 18)
                        .addComponent(delete_cancelbt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(440, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(deletesvtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_bt)
                    .addComponent(delete_cancelbt))
                .addContainerGap(561, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Xóa thông tin sinh viên", jPanel6);

        jLabel36.setText("Khu phòng thu hồi : ");

        jLabel37.setText("Mã phòng thu hồi");

        thuhoi_khuphong.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B5", "B6", "B7" }));

        jLabel38.setForeground(new java.awt.Color(255, 0, 0));
        jLabel38.setText("(* LƯU Ý: Khi thu hồi phòng toàn bộ người trong phòng sẽ bị đuổi)");
        thuhoibt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancel1.png")));
        thuhoibt.setText("Thu hồi");
        thuhoibt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuhoibtActionPerformed(evt);
            }
        });
        thuhoi_cancelbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel.png")));
        thuhoi_cancelbt.setText("Cancel");
        thuhoi_cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuhoi_cancelbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thuhoi_khuphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thuhoi_phongtf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(thuhoibt, javax.swing.GroupLayout.PREFERRED_SIZE,105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(thuhoi_cancelbt)))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(thuhoi_khuphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(thuhoi_phongtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thuhoibt)
                    .addComponent(thuhoi_cancelbt))
                .addContainerGap(574, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Thu hồi phòng", jPanel7);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 0));
        jLabel39.setText("LƯU Ý: Khi bạn sử dụng chức năng này toàn bộ sinh viên của khu bị đuổi khỏi kí túc");

        jLabel40.setText("Khu cần giải tán : ");

        giaitankhuselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B5", "B6", "B7" }));
        giaitankhu_okbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancel1.png")));
        giaitankhu_okbt.setText("Giải tán");
        giaitankhu_okbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaitankhu_okbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(giaitankhu_okbt)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(giaitankhuselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel39))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(giaitankhuselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giaitankhu_okbt)
                .addContainerGap(585, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Giải tán khu", jPanel8);

        jTabbedPane1.addTab("Xóa thông tin", jTabbedPane6);

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel41.setText("Tìm kiếm theo");

        tracuusv_loaiseach.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MSSV", "Name" }));
        tracuusv_seachbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-32.png")));
        tracuusv_seachbt.setText("Seach");
        tracuusv_seachbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tracuusv_seachbtActionPerformed(evt);
            }
        });
        
        tracuu_sinhvien_list.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                    "MSSV", "Tên", "Quê quán", "Lớp", "Ngày sinh", "Giới tính", "Mã phòng", "Khoa", "Đối tượng"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, true, false, false, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane6.setViewportView(tracuu_sinhvien_list);


            javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
            jPanel9.setLayout(jPanel9Layout);
            jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel41)
                            .addGap(31, 31, 31)
                            .addComponent(tracuusv_loaiseach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(tracuusv_seachbox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tracuusv_seachbt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(231, Short.MAX_VALUE))
            );
            jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel41)
                        .addComponent(tracuusv_loaiseach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tracuusv_seachbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tracuusv_seachbt))
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(175, Short.MAX_VALUE))
            );
        

        jTabbedPane4.addTab("Tra cứu sinh viên", jPanel9);

        jLabel49.setText("Khu : ");

        tracuuphong_khu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B5", "B6", "B7" }));

        jLabel50.setText("Phòng : ");
        tracuuphong_Seach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-32.png")));
        tracuuphong_Seach.setText("Seach");
        tracuuphong_Seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tracuuphong_SeachActionPerformed(evt);
            }
        });

        jLabel51.setText("Phòng thuộc loại : ");
        String loai="";
        tracuuphong_loaiphonglbl.setText(loai);

        jLabel52.setText("Thành viên của phòng : ");
        tracuuphong_listsvOfphong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MSSV", "Tên", "Khoa", "Ngày vào"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tracuuphong_listsvOfphong);

        jLabel68.setText("Tên quản lý : ");
        String quanly="";
        tracuuphong_tenquanly.setText(quanly);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tracuuphong_loaiphonglbl))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(18, 18, 18)
                                .addComponent(tracuuphong_khu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel50)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(tracuuphong_phongseachtf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tracuuphong_Seach))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(18, 18, 18)
                                .addComponent(tracuuphong_tenquanly))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(tracuuphong_khu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(tracuuphong_phongseachtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tracuuphong_Seach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(tracuuphong_loaiphonglbl)
                    .addComponent(jLabel68)
                    .addComponent(tracuuphong_tenquanly))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Tra thông tin phòng", jPanel10);

        jLabel53.setText("Khu : ");

        jLabel54.setText("Phòng");

        tracuudn_khu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B5", "B6", "B7" }));
        tracuudn_seach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-32.png")));
        tracuudn_seach.setText("seach");
        tracuudn_seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tracuudn_seachActionPerformed(evt);
            }
        });

        tracuudn_ttdiennuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Số điện tháng trước", "Số điện tháng này", "Tổng số điện", "Số nước tháng trước", "Số nước tháng này", "Tổng số nước", "Tổng số tiền phải trả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tracuudn_ttdiennuoc);
        tracuudn_ttdiennuoc.getColumnModel().getColumn(0).setPreferredWidth(30);
        tracuudn_ttdiennuoc.getColumnModel().getColumn(3).setPreferredWidth(50);
        tracuudn_ttdiennuoc.getColumnModel().getColumn(6).setPreferredWidth(50);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tracuudn_khu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tracuudn_phongtf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tracuudn_seach)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(tracuudn_khu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tracuudn_phongtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tracuudn_seach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(593, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Tra điện nước", jPanel11);

        jTabbedPane1.addTab("Tra cứu", jTabbedPane4);

        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        thongkebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/application_view_detail.png")));
        thongkebt.setText("Thống kê");
        thongkebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkebtActionPerformed(evt);
            }
        });

        baocao_listtongthu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Khu", "Tổng thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(baocao_listtongthu);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thongkebt))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(thongkebt)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Tổng thu của kí túc", jPanel12);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("Người ở lâu nhất kí túc là : ");

        jLabel58.setText("Tên : ");

        jLabel59.setText("MSSV");

        baocao_mssvlbl.setText("...................................................");

        baocao_phonglbl.setText("...................................................");

        jLabel62.setText("Phòng :");

        baocao_namelbl.setText("...................................................");

        baocaobt.setText("Báo cáo");
        baocaobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baocaobtActionPerformed(evt);
            }
        });

        jLabel64.setText("Ngày vào : ");

        baocao_ngayvaolbl.setText("...................................................");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setText("Báo cáo về điện nước của tất cả các phòng trong 1 khu kí túc");

        baocao_diennuoc_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
            		"Mã phòng", "Số điện tháng trước", "Số điện tháng này", "Tổng số điện", "Số nước tháng trước", "Số nước tháng này", "Tổng số nước", "Tiền điện","Tiền nước"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(baocao_diennuoc_list);
        baocao_diennuoc_list.getColumnModel().getColumn(0).setResizable(false);
        baocao_diennuoc_list.getColumnModel().getColumn(0).setPreferredWidth(45);

        baocao_khu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B5", "B6", "B7" }));

        jLabel67.setText("Khu : ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baocao_ngayvaolbl))
                    .addComponent(jLabel57)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addGap(37, 37, 37)
                        .addComponent(baocao_khu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(baocaobt))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel58)
                            .addComponent(jLabel62))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(baocao_mssvlbl)
                            .addComponent(baocao_namelbl)
                            .addComponent(baocao_phonglbl))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baocaobt)
                    .addComponent(jLabel67)
                    .addComponent(baocao_khu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baocao_mssvlbl)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baocao_namelbl)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(baocao_phonglbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(baocao_ngayvaolbl))
                .addGap(18, 18, 18)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        jTabbedPane5.addTab("Báo cáo và thống kê", jPanel13);

        jTabbedPane1.addTab("Báo cáo & thống kê", jTabbedPane5);

        jPanel1.add(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void editsv_cancelbtActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	editsv_mssv_seachtf.setText("");
        editsv_mssvtf.setText("");
        editsv_nametf.setText("");
        editsv_ngaysinhtf.setText("");
        editsv_khoatf.setText("");
        editsv_doituongcb.setSelectedIndex(0);
        editsv_quetf.setText("");
        editsv_giotinh.setSelectedIndex(0);
        editsv_phongtf.setText("");
        
    }                                               

    private void giaitankhu_okbtActionPerformed(java.awt.event.ActionEvent evt) {                                                
        /*
         //////////////////////giai tan viet o day
         */
    	int khu=giaitankhuselect.getSelectedIndex();
    	new giaitankhu(khu);
    }                                               

    private void thuhoi_cancelbtActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	thuhoi_phongtf.setText("");
    	
        thuhoi_khuphong.setSelectedIndex(0);
    }                                               

    private void thuhoibtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        /*
         thu hoi phong viet o day
         */
    	int khu=thuhoi_khuphong.getSelectedIndex();
    	String pthuhoi=thuhoi_phongtf.getText();
    	new thuhoiphong(khu, pthuhoi);
    }                                        

    private void delete_cancelbtActionPerformed(java.awt.event.ActionEvent evt) {                                                
        deletesvtf.setText("");
    }                                               

    private void Delete_btActionPerformed(java.awt.event.ActionEvent evt) {                                          
        /*
         delete sinh vien o day !!!!!!!!!!!!
         */
    	String mssv=deletesvtf.getText();
    	new deletesv(mssv);
    }                                         

    private void editsv_seachbtActionPerformed(java.awt.event.ActionEvent evt) {                                               
        /*
         seach sinh vien can edit o day
         */
    	String mssveditseach=editsv_mssv_seachtf.getText();
    	Connection c=new getconnect().getcon();
    	Statement stmt;
    	try {
			stmt=c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM sinhvien where mssv='"+mssveditseach+"';" );
			rs.next();
			editsv_mssvtf.setText(rs.getString("mssv"));
			editsv_khoatf.setText(rs.getString("khoa"));
			editsv_nametf.setText(rs.getString("ten"));
			editsv_ngaysinhtf.setText(rs.getString("ngaysinh"));
			editsv_phongtf.setText(rs.getString("maph"));
			editsv_quetf.setText(rs.getString("quequan"));
			editsv_loptf.setText(rs.getString("lop"));
			String gt=rs.getString("gioitinh");
			int gti;
			String na="nam";
			if(gt.compareTo(na)==0)gti=0;
			else gti=1;
			editsv_giotinh.setSelectedIndex(gti);
			int cs=Integer.parseInt(rs.getString("doituong"));
			editsv_doituongcb.setSelectedIndex(cs);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }                                              

    private void editsv_okbtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        /*
         edit sinh vien o day
         */
    	String mssv,khoa,name,lop,ngaysinh,que,maph,mssvc;
    	mssv=editsv_mssvtf.getText();
    	name=editsv_nametf.getText();
    	khoa=editsv_khoatf.getText();
    	ngaysinh=editsv_ngaysinhtf.getText();
    	que=editsv_quetf.getText();
    	maph=editsv_phongtf.getText();
    	lop=editsv_loptf.getText();
    	mssvc = editsv_mssv_seachtf.getText(); 
    	int gioitinh=editsv_giotinh.getSelectedIndex();
    	int doituong=editsv_doituongcb.getSelectedIndex();
    	
    	new editsv(mssvc, name, lop, mssv, que, ngaysinh, doituong, khoa, gioitinh, maph);
    }                                           

    private void tracuuphong_SeachActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       //tra cuu thong tin cua phong o day
        int khu = tracuuphong_khu.getSelectedIndex();
        String phong = tracuuphong_phongseachtf.getText();
        String loai="";
        String quanly="";
        DefaultTableModel tb = null;
        tracuuphong test = new tracuuphong(khu, phong, loai, quanly,tb);
        tracuuphong_loaiphonglbl.setText(test.loai);
        tracuuphong_tenquanly.setText(test.quanly);
        tracuuphong_listsvOfphong.setModel(test.tb);
    }                                                 

    private void tracuudn_seachActionPerformed(java.awt.event.ActionEvent evt) {                                               
        /*
         tra cuu dien nuoc cua phong o day
         */
    	DefaultTableModel tb3=null;
    	int chon=tracuudn_khu.getSelectedIndex();
    	String phongchon=tracuudn_phongtf.getText();
    	tracuudn tradn = new tracuudn(chon,phongchon,tb3);
    	tracuudn_ttdiennuoc.setModel(tradn.tb3);
    	
    }                                              

    private void baocaobtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        /*
         phan bao cao viet o day
         */
    	String mssv ="";
    	String name="";
    	String phong="";
    	String ngayvao="";
    	int khui;
    	DefaultTableModel tbbc=null;
    	khui=baocao_khu.getSelectedIndex();
    	baocao bc=new baocao(mssv,name,ngayvao,phong,khui,tbbc);
    	baocao_mssvlbl.setText(bc.mssv);
    	baocao_namelbl.setText(bc.name);
    	baocao_phonglbl.setText(bc.phong);
    	baocao_ngayvaolbl.setText(bc.ngayvao);
    	baocao_diennuoc_list.setModel(bc.tbbc);
    }                                        

    private void thongkebtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        /*
         thong ke viet o day
         */
    	DefaultTableModel tbtk=null;
    	thongke tke=new thongke(tbtk);
    	baocao_listtongthu.setModel(tke.tbtk);
    	
    }                                         

    private void tracuusv_seachbtActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        /*
         tracuu sinh vien viet o day
         */
    	int tktheo=tracuusv_loaiseach.getSelectedIndex();
    	String tim=tracuusv_seachbox.getText();
    	DefaultTableModel tb2=null;
    	tracuusinhvien trasv=new tracuusinhvien(tktheo,tim,tb2);
    	tracuu_sinhvien_list.setModel(trasv.tb2);
    }                                                

    private void newphong_cancelbtActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        newphong_phongtf.setText("");
        newphong_khuselect.setSelectedIndex(0);
        newphong_loaiphongselect.setSelectedIndex(0);
    }                                                 
    
    private void inputdn_inputbtActionPerformed(java.awt.event.ActionEvent evt){
    	Connection c=new getconnect().getcon();
    	Statement stmt;
    	String maph,sodien,sonuoc;
    	int ro=inputdn_table.getRowCount();
    	try {
			stmt=c.createStatement();
			for(int j=0;j<ro;j++){
				maph=(String) inputdn_table.getValueAt(j,0);
				sodien=(String) inputdn_table.getValueAt(j,1);
				sonuoc=(String) inputdn_table.getValueAt(j,2);
				stmt.executeUpdate("update diennuoc set dtt=dts,dts="+sodien+",ntt=nts,nts="+sonuoc+" where maph='"+maph+"';");
				stmt.executeUpdate("update diennuoc set sum_sd=dts-dtt,sum_nc=nts-ntt where maph='"+maph+"';");
				stmt.executeUpdate("update diennuoc set tiendien=sum_sd*3000,tnuoc=sum_nc*2000 where maph='"+maph+"';");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }

    private void newphong_okbtActionPerformed(java.awt.event.ActionEvent evt) {                                              
        /*
        //////////////////////    them phong o dayyyyyyyyyyyyyyy
        *
        */
    	String phong=newphong_phongtf.getText();
    	int khu=newphong_khuselect.getSelectedIndex();
    	int loai=newphong_loaiphongselect.getSelectedIndex();
    	new addphong(phong,khu,loai);
    }                                             

    private void newsv_phongtrongbtActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        /*
        tim phong trong de add sonh vien o day
        */
    	DefaultTableModel tba=null;
        int khu=newsv_khuselect.getSelectedIndex();
        int loaiph=newsv_loaiphongselect.getSelectedIndex();
        timphongtrong pt=new timphongtrong(khu,loaiph,tba);
        newsv_listphongcon.setModel(pt.tba);
    }                                                  

    private void newsv_cancelbtActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	newsv_khoatf.setText("");
        newsv_nametf.setText("");
        newsv_ngaysinhtf.setText("");
        newsv_loptf.setText("");
        newsv_mssvtf.setText("");
        newsv_phongtf.setText("");
        newsv_quetf.setText("");
        newsv_doituong.setSelectedIndex(0);
        newsv_khuselect.setSelectedIndex(0);
        newsv_loaiphongselect.setSelectedIndex(0);
    }                                              
    private void inputdn_listphongbtActionPerformed(java.awt.event.ActionEvent evt){
    	DefaultTableModel tbdn = null;
    	int khui=inputdn_khubc.getSelectedIndex();
    	inputdn dn=new inputdn(khui,tbdn);
    	inputdn_table.setModel(dn.tbdn);
    	
    }
    private void newsv_okbtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ///////////////////////////////////////////////////////////////////
        //////////////////////////////////*
        /*
        * addsvien o dayyy

        */
    	String mssv=newsv_mssvtf.getText();
    	String name=newsv_nametf.getText();
    	String ngaysinh = newsv_ngaysinhtf.getText();
    	int khui=newsv_khuselect.getSelectedIndex();
    	String khu;if(khui==0)khu="b5";else{
    		if(khui==1)khu="b6";else khu="b7";
    	}
    	String que=newsv_quetf.getText();
    	String khoa=newsv_khoatf.getText();
    	String phong=newsv_phongtf.getText();
    	String maph=khu+"-"+phong;
    	String lop = newsv_loptf.getText();
    	int dt=newsv_doituong.getSelectedIndex();
    	int gt=newsv_loaiphongselect.getSelectedIndex();
    	new addsv(name, lop, mssv, que, ngaysinh, dt, khoa, gt, maph);
    }                                          

    private void doichosv_btActionPerformed(java.awt.event.ActionEvent evt) {                                            
        /*
         doi cho cho 2 sv viet o day
         * 
         */
    	String mssv1=doichosv_mssvsv1tf.getText();
    	String mssv2=doichosv_mssvsv2tf.getText();
    	new doicho2sv(mssv1, mssv2);
    }                                           

    private void editphong_seachbtActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        /*
         tim thong tin phog sua chua o day
         */
    	String phongedit=editphong_seachtf.getText();
    	Connection d=new getconnect().getcon();
    	Statement stmt;
    	try {
			stmt=d.createStatement();
			ResultSet rs=stmt.executeQuery("select maph,loaiphong from phong where maph='"+phongedit+"';");
			rs.next();
			editphong_maph.setText(rs.getString("maph"));
			String loaiph=rs.getString("loaiphong");
			if(loaiph.compareTo("nam")==0)editphong_loaip.setSelectedIndex(1);
			else editphong_loaip.setSelectedIndex(2);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Có sự cố phát sinh trong tìm kiếm phòng");
			e.printStackTrace();
		}
    }                                                 

    private void editphong_editbtActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        /*
         edit phong o day
         * 
         * 
         */
    	String maphmoi=editphong_maph.getText();
    	String maphcu=editphong_seachtf.getText();
    	int loaiph=editphong_loaip.getSelectedIndex();
    	new editphong(maphcu, maphmoi, loaiph);
    }                                                

    private void editphong_cancelbtActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	//editphong_seachbt.enable();
    	editphong_seachtf.setText("");
        editphong_maph.setText("");
        editphong_loaip.setSelectedIndex(0);
        
    }                                                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanLiNhaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new quanLiNhaFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton Delete_bt;
    private javax.swing.JScrollPane addsv_jScrollPane;
    private javax.swing.JTable baocao_diennuoc_list;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox baocao_khu;
    private javax.swing.JLabel baocao_mssvlbl;
    private javax.swing.JLabel baocao_namelbl;
    private javax.swing.JLabel baocao_ngayvaolbl;
    private javax.swing.JLabel baocao_phonglbl;
    private javax.swing.JButton baocaobt;
    private javax.swing.JButton delete_cancelbt;
    private javax.swing.JTextField deletesvtf;
    private javax.swing.JButton doichosv_bt;
    private javax.swing.JTextField doichosv_mssvsv1tf;
    private javax.swing.JTextField doichosv_mssvsv2tf;
    private javax.swing.JButton editphong_cancelbt;
    private javax.swing.JButton editphong_editbt;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox editphong_loaip;
    private javax.swing.JTextField editphong_maph;
    private javax.swing.JButton editphong_seachbt;
    private javax.swing.JTextField editphong_seachtf;
    private javax.swing.JButton editsv_cancelbt;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox editsv_doituongcb;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox editsv_giotinh;
    private javax.swing.JTextField editsv_khoatf;
    private javax.swing.JTextField editsv_loptf;
    private javax.swing.JTextField editsv_mssv_seachtf;
    private javax.swing.JTextField editsv_mssvtf;
    private javax.swing.JTextField editsv_nametf;
    private javax.swing.JTextField editsv_ngaysinhtf;
    private javax.swing.JButton editsv_okbt;
    private javax.swing.JTextField editsv_phongtf;
    private javax.swing.JTextField editsv_quetf;
    private javax.swing.JButton editsv_seachbt;
    private javax.swing.JButton giaitankhu_okbt;@SuppressWarnings("rawtypes")
    private javax.swing.JComboBox giaitankhuselect;@SuppressWarnings("rawtypes")
    private javax.swing.JComboBox inputdn_khubc;
    private javax.swing.JButton inputdn_listphongbt;
    private javax.swing.JTable inputdn_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable baocao_listtongthu;
    private javax.swing.JLabel tracuuphong_loaiphonglbl;
    private javax.swing.JButton newphong_cancelbt;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox newphong_khuselect;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox newphong_loaiphongselect;
    private javax.swing.JButton newphong_okbt;
    private javax.swing.JTextField newphong_phongtf;
    private javax.swing.JButton newsv_cancelbt;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox newsv_doituong;
    private javax.swing.JTextField newsv_khoatf;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox newsv_khuselect;
    private javax.swing.JTable newsv_listphongcon;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox newsv_loaiphongselect;
    private javax.swing.JTextField newsv_loptf;
    private javax.swing.JTextField newsv_mssvtf;
    private javax.swing.JTextField newsv_nametf;
    private javax.swing.JTextField newsv_ngaysinhtf;
    private javax.swing.JButton newsv_okbt;
    private javax.swing.JTextField newsv_phongtf;
    private javax.swing.JButton newsv_phongtrongbt;
    private javax.swing.JTextField newsv_quetf;
    private javax.swing.JButton thongkebt;
    private javax.swing.JButton thuhoi_cancelbt;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox thuhoi_khuphong;
    private javax.swing.JTextField thuhoi_phongtf;
    private javax.swing.JButton thuhoibt;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox tracuudn_khu;
    private javax.swing.JTextField tracuudn_phongtf;
    private javax.swing.JButton tracuudn_seach;
    private javax.swing.JTable tracuudn_ttdiennuoc;
    private javax.swing.JButton tracuuphong_Seach;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox tracuuphong_khu;
    private javax.swing.JTable tracuuphong_listsvOfphong;
    private javax.swing.JTextField tracuuphong_phongseachtf;
    private javax.swing.JLabel tracuuphong_tenquanly;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox tracuusv_loaiseach;
    private javax.swing.JTextField tracuusv_seachbox;
    private javax.swing.JButton tracuusv_seachbt; 
    private javax.swing.JTable tracuu_sinhvien_list;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton inputdn_inputbt;
}