/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanqlsinhvien;

import java.awt.Color;
import static java.lang.Float.parseFloat;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.border.LineBorder;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author dokis
 */
public class FrmThemSV extends javax.swing.JFrame {

    /**
     * Creates new form FrmThemSV
     */
    public FrmThemSV() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMaSo = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHoTen = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNgaySinh = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        rdoMale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdoFemale = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboKhoa = new javax.swing.JComboBox();
        cboNganh = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtLop = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDiem = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnSaveAndNew = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm sinh viên");

        jScrollPane1.setViewportView(txtMaSo);

        jLabel1.setText("Mã số SV");

        jScrollPane2.setViewportView(txtHoTen);

        jLabel2.setText("Họ và tên");

        jScrollPane3.setViewportView(txtNgaySinh);

        jLabel3.setText("Ngày Sinh");

        buttonGroup1.add(rdoMale);
        rdoMale.setSelected(true);
        rdoMale.setText("Nam");

        jLabel4.setText("Giới Tính");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Nữ");

        jScrollPane4.setViewportView(txtEmail);

        jLabel5.setText("E-mail");

        jLabel6.setText("Khoa");

        cboKhoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CNTT", "Ngoại ngữ", "Cơ khí", "Điện tử" }));
        cboKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaActionPerformed(evt);
            }
        });

        cboNganh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Công nghệ phần mềm", "Đồ họa", "Mạng máy tính" }));

        jLabel7.setText("Ngành");

        jScrollPane5.setViewportView(txtLop);

        jLabel8.setText("Lớp");

        jScrollPane6.setViewportView(txtDiem);

        jLabel9.setText("Điểm");

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 51, 255));
        btnSave.setIcon(new javax.swing.ImageIcon("D:\\BaiTap@tdc\\java\\DoAnQLSinhVien\\ico\\icons8-save-all-30.png")); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSaveAndNew.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveAndNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveAndNew.setForeground(new java.awt.Color(0, 204, 0));
        btnSaveAndNew.setIcon(new javax.swing.ImageIcon("D:\\BaiTap@tdc\\java\\DoAnQLSinhVien\\ico\\icons8-add-30.png")); // NOI18N
        btnSaveAndNew.setText("Lưu và thêm mới");
        btnSaveAndNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAndNewActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 51, 51));
        btnCancel.setIcon(new javax.swing.ImageIcon("D:\\BaiTap@tdc\\java\\DoAnQLSinhVien\\ico\\icons8-delete-30.png")); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoMale)
                                .addGap(97, 97, 97)
                                .addComponent(rdoFemale))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cboKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(cboNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveAndNew)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoFemale)
                            .addComponent(rdoMale))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveAndNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Check form 
     * @param evt 
     */
    private boolean invalidForm()
    {
        boolean check  = true;
        if("".equals(txtMaSo.getText()))
        {
            txtMaSo.setBorder(new LineBorder(Color.RED));
            check = false;
        }
        else
        {
            txtMaSo.setBorder(new LineBorder(Color.BLACK));
        }
        if("".equals(txtHoTen.getText()))
        {
            txtHoTen.setBorder(new LineBorder(Color.RED));
            check = false;
        }
        else
        {
            txtHoTen.setBorder(new LineBorder(Color.BLACK));
        }
        if("".equals(txtNgaySinh.getText()))
        {
            txtNgaySinh.setBorder(new LineBorder(Color.RED));check = false;
        }
        else
        {
            txtNgaySinh.setBorder(new LineBorder(Color.BLACK));
        }
        if("".equals(txtEmail.getText()))
        {
            txtEmail.setBorder(new LineBorder(Color.RED));check = false;
        }
        else
        {
            txtEmail.setBorder(new LineBorder(Color.BLACK));
        }
        if("".equals(txtLop.getText()))
        {
            txtLop.setBorder(new LineBorder(Color.RED));
            check = false;
        }
        else
        {
            txtLop.setBorder(new LineBorder(Color.BLACK));
        }
        if("".equals(txtDiem.getText()) || !checkDiem(txtDiem.getText()))
        {
            txtDiem.setBorder(new LineBorder(Color.red));
            check = false;
        }
        else
        {
             txtDiem.setBorder(new LineBorder(Color.BLACK));
        }
        return check;
    }
    
    /**
     * 
     */
    private void clearFields()
    {
        txtDiem.setText("");
        txtMaSo.setText("");
        txtLop.setText("");
        txtNgaySinh.setText("");
        txtEmail.setText("");
        rdoMale.isSelected();
    }
    
    /**
     * Check float
     * @param evt 
     */
    private boolean checkDiem(String s)
    {
        try{
            float a = parseFloat(s);
            if(a > 10 || a < 0)
            {
                return false;
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try{
            if(invalidForm())
            {
                String Gioi;
                if(rdoFemale.isSelected())
                {
                    Gioi = "Nữ";
                }
                else
                {
                    Gioi = "Nam";
                }
                SinhVien sv = new SinhVien(txtMaSo.getText(), txtHoTen.getText(), txtNgaySinh.getText()
                        , txtEmail.getText(), cboNganh.getSelectedItem().toString(), cboKhoa.getSelectedItem().toString(), Float.parseFloat(txtDiem.getText()), Gioi, txtLop.getText());
                FrmHome.listSV.add(sv);
                this.dispose();
                frmLogin.frHome.clearTable();
                frmLogin.frHome.displayTable();
            }
            
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cboKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaActionPerformed
        // TODO add your handling code here:
        cboNganh.removeAllItems();
        
        Nganh _nganh = new Nganh();
        
        //When select a value
        String _cboKhoaValue = cboKhoa.getSelectedItem().toString();
        
        //Add value to nganh
        _nganh.createNganh(_cboKhoaValue);
        
        //Write all items of _nganh to cboNganh
        for(int i = 0; i< _nganh.getLength(); i++ )
        {
            cboNganh.addItem(_nganh.getValueOf(i));
        }
    }//GEN-LAST:event_cboKhoaActionPerformed

    private void btnSaveAndNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAndNewActionPerformed
        // TODO add your handling code here:
        try{
            if(invalidForm())
            {
                String Gioi;
                if(rdoFemale.isSelected())
                {
                    Gioi = "Nữ";
                }
                else
                {
                    Gioi = "Nam";
                }
                SinhVien sv = new SinhVien(txtMaSo.getText(), txtHoTen.getText(), txtNgaySinh.getText()
                        , txtEmail.getText(), cboNganh.getSelectedItem().toString(), cboKhoa.getSelectedItem().toString(), Float.parseFloat(txtDiem.getText()), Gioi, txtLop.getText());
                FrmHome.listSV.add(sv);
                frmLogin.frHome.clearTable();
                frmLogin.frHome.displayTable();
                clearFields();
            }
            
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnSaveAndNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmThemSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmThemSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmThemSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmThemSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmThemSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveAndNew;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboKhoa;
    private javax.swing.JComboBox cboNganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextPane txtDiem;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JTextPane txtHoTen;
    private javax.swing.JTextPane txtLop;
    private javax.swing.JTextPane txtMaSo;
    private javax.swing.JTextPane txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}
