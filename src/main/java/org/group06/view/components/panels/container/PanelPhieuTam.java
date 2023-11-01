/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_PhieuDat;
import org.group06.model.entity.KhachHang;
import org.group06.model.entity.KhuyenMai;
import org.group06.model.entity.NhanVien;
import org.group06.model.entity.PhieuDat;
import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;
import org.group06.utils.ImagePath;

/**
 *
 * @author Le Minh Bao
 */
public class PanelPhieuTam extends javax.swing.JPanel {

    private DAO_PhieuDat dao_PhieuDat;

    /**
     * Creates new form PanelHoaDon
     */
    public PanelPhieuTam() {
        initComponents();
        checkNgayDat();
        checkNgayNhan();
        loadDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleDSHoaDon = new javax.swing.JLabel();
        pnlTimHD = new javax.swing.JPanel();
        lblTimTheoTenKH = new javax.swing.JLabel();
        lblTimTheoNgayDat = new javax.swing.JLabel();
        txtTimTheoTenKH = new javax.swing.JTextField();
        dchTimTheoNgayDat = new com.toedter.calendar.JDateChooser();
        btnLamMoi = new javax.swing.JButton();
        lblTimTheoTenNV = new javax.swing.JLabel();
        txtTimTheoTenNV = new javax.swing.JTextField();
        lblTimTheoNgayNhan = new javax.swing.JLabel();
        dchTimTheoNgayNhan = new com.toedter.calendar.JDateChooser();
        srcPhieuDat = new javax.swing.JScrollPane();
        tblPhieuDat = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitleDSHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTitleDSHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDSHoaDon.setText("Danh sách phiếu đặt hàng");

        pnlTimHD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tìm Kiếm Phiếu Đặt Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTimTheoTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoTenKH.setText("Tìm theo tên khách hàng");

        lblTimTheoNgayDat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoNgayDat.setText("Tìm theo ngày tạo phiếu đặt");

        txtTimTheoTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoTenKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoTenKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoTenKHKeyReleased(evt);
            }
        });

        dchTimTheoNgayDat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchTimTheoNgayDat.setPreferredSize(new java.awt.Dimension(64, 29));
        dchTimTheoNgayDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dchTimTheoNgayDatMouseClicked(evt);
            }
        });
        dchTimTheoNgayDat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchTimTheoNgayDatPropertyChange(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLamMoiMouseClicked(evt);
            }
        });

        lblTimTheoTenNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoTenNV.setText("Tìm theo tên nhân viên");

        txtTimTheoTenNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoTenNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoTenNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoTenNVKeyReleased(evt);
            }
        });

        lblTimTheoNgayNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoNgayNhan.setText("Tìm theo ngày nhận quần áo");

        dchTimTheoNgayNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchTimTheoNgayNhan.setPreferredSize(new java.awt.Dimension(64, 29));
        dchTimTheoNgayNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dchTimTheoNgayNhanMouseClicked(evt);
            }
        });
        dchTimTheoNgayNhan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchTimTheoNgayNhanPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTimHDLayout = new javax.swing.GroupLayout(pnlTimHD);
        pnlTimHD.setLayout(pnlTimHDLayout);
        pnlTimHDLayout.setHorizontalGroup(
            pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimTheoTenKH)
                    .addComponent(lblTimTheoTenNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimTheoTenNV)
                    .addComponent(txtTimTheoTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimTheoNgayNhan)
                    .addComponent(lblTimTheoNgayDat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchTimTheoNgayDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dchTimTheoNgayNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLamMoi)
                .addContainerGap())
        );
        pnlTimHDLayout.setVerticalGroup(
            pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTimHDLayout.createSequentialGroup()
                        .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblTimTheoNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimTheoTenKH)
                            .addComponent(txtTimTheoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dchTimTheoNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblTimTheoTenNV)
                            .addComponent(txtTimTheoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimTheoNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dchTimTheoNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        dchTimTheoNgayDat.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchTimTheoNgayDat.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchTimTheoNgayDat.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);
        dchTimTheoNgayNhan.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchTimTheoNgayNhan.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchTimTheoNgayNhan.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

        srcPhieuDat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblPhieuDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PD001", "1/1/2022", "10/1/2022", "Trương Quốc Bảo", "Lê Minh Bảo", "120000", "KM001"},
                {"PD002", "1/1/2022", "5/1/2022", "Lê Hoàng Nam", "Lê Minh Bảo", "500000", null}
            },
            new String [] {
                "Mã phiếu đặt", "Ngày tạo", "Ngày nhận", "Tên khách hàng", "Tên nhân viên", "Tổng tiền", "Khuyến mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuDat.setRowHeight(50);
        tblPhieuDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuDatMouseClicked(evt);
            }
        });
        srcPhieuDat.setViewportView(tblPhieuDat);
        if (tblPhieuDat.getColumnModel().getColumnCount() > 0) {
            tblPhieuDat.getColumnModel().getColumn(0).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(1).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(2).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(3).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(4).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(5).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(srcPhieuDat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTimHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitleDSHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleDSHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srcPhieuDat, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimTheoTenKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoTenKHKeyReleased
        String tenKH = txtTimTheoTenKH.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tenKH.equals("")) {
                if (checkRegexTenKH()) {
                    ArrayList<PhieuDat> dsPD = new DAO_PhieuDat((DatabaseConnect.getConnection())).getByNameKH(tenKH);
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblPhieuDat.getModel();
                    modelKH.setRowCount(0);
                    for (PhieuDat pd : dsPD) {
                        Object[] data = {pd.getMaPhieuDat(), pd.getNgayTao(), pd.getNgayNhan(), pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), 1, pd.getKhuyenMai().getTenCTKM()};
                        modelKH.addRow(data);
                    }
                    txtTimTheoTenNV.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại tên khách hàng cần tìm");
                    loadDataTable();
                }
            } else {
                loadDataTable();
            }
        }
    }//GEN-LAST:event_txtTimTheoTenKHKeyReleased

    private boolean checkRegexTenKH() {
        String tenKH = txtTimTheoTenKH.getText().trim();
        if (tenKH.equals("") || !tenKH.matches("^[\\p{L}\\s]+$")) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkRegexTenNV() {
        String tenNV = txtTimTheoTenNV.getText().trim();
        if (tenNV.equals("") || !tenNV.matches("^[\\p{L}\\s]+$")) {
            return false;
        } else {
            return true;
        }
    }

    private void dchTimTheoNgayDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dchTimTheoNgayDatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dchTimTheoNgayDatMouseClicked

    private void dchTimTheoNgayDatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchTimTheoNgayDatPropertyChange

    }//GEN-LAST:event_dchTimTheoNgayDatPropertyChange

    private void btnLamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMouseClicked
        txtTimTheoTenKH.setText("");
        txtTimTheoTenNV.setText("");
        dchTimTheoNgayDat.setDate(null);
        dchTimTheoNgayNhan.setDate(null);
        loadDataTable();
    }//GEN-LAST:event_btnLamMoiMouseClicked

    private void txtTimTheoTenNVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoTenNVKeyReleased
        String tenNV = txtTimTheoTenNV.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tenNV.equals("")) {
                if (checkRegexTenNV()) {
                    ArrayList<PhieuDat> dsPD = new DAO_PhieuDat((DatabaseConnect.getConnection())).getByNameNV(tenNV);
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblPhieuDat.getModel();
                    modelKH.setRowCount(0);
                    for (PhieuDat pd : dsPD) {
                        Object[] data = {pd.getMaPhieuDat(), pd.getNgayTao(), pd.getNgayNhan(), pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), 1, pd.getKhuyenMai().getTenCTKM()};
                        modelKH.addRow(data);
                    }
                    txtTimTheoTenKH.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại tên nhân viên cần tìm");
                    loadDataTable();
                }
            } else {
                loadDataTable();
            }
        }
    }//GEN-LAST:event_txtTimTheoTenNVKeyReleased

    private void dchTimTheoNgayNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dchTimTheoNgayNhanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dchTimTheoNgayNhanMouseClicked

    private void dchTimTheoNgayNhanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchTimTheoNgayNhanPropertyChange

    }//GEN-LAST:event_dchTimTheoNgayNhanPropertyChange

    private void callFrameChiTietHoaDon() {
        FrameChiTietDonDatHang frCTDDH = new FrameChiTietDonDatHang(this.getSelectedPhieuDat(), this);
        frCTDDH.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frCTDDH.setResizable(false);
        frCTDDH.setVisible(true);
    }
    
    private void tblPhieuDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuDatMouseClicked
        if (evt.getClickCount() == 2) {
            callFrameChiTietHoaDon();
        }
    }//GEN-LAST:event_tblPhieuDatMouseClicked

    private void checkNgayDat() {
        dchTimTheoNgayDat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    Date ngayDat = (Date) evt.getNewValue();
                    Date ngayNhan = dchTimTheoNgayNhan.getDate();
                    java.util.Date dateNow = new java.util.Date();
                    if (ngayDat != null) {
                        if (ngayDat.after(dateNow)) {
                            JOptionPane.showMessageDialog(null, "Chọn ngày không hợp lệ");
                            resetDay();
                        } else {
                            if (ngayNhan == null) {
                                loadDataNgayDat(ngayDat);
                            } else if (ngayNhan.before(ngayDat)) {
                                JOptionPane.showMessageDialog(null, "Ngày nhận không hợp lệ");
                                resetDay();
                            } else {
                                loadDataTheo2Ngay(ngayDat, ngayNhan);
                            }
                        }
                    }
                }
            }
        }
        );
    }

    private void checkNgayNhan() {
        dchTimTheoNgayNhan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    Date ngayNhan = (Date) evt.getNewValue();
                    Date ngayDat = dchTimTheoNgayDat.getDate();
                    if (ngayNhan != null) {
                        if (ngayDat == null) {
                            loadDataNgayNhan(ngayNhan);
                        } else {
                            if (ngayDat.after(ngayNhan)) {
                                JOptionPane.showMessageDialog(null, "Ngày nhận không hợp lệ");
                                resetDay();
                            } else {
                                loadDataTheo2Ngay(ngayDat, ngayNhan);
                            }
                        }
                    }
                }
            }
        });
    }

    private void loadDataNgayDat(Date formatDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newSDF = new SimpleDateFormat("dd/MM/yyyy");
        String formatDayDat = sdf.format(formatDay);
        ArrayList<PhieuDat> dsPD = new DAO_PhieuDat((DatabaseConnect.getConnection())).getByDateDat(formatDayDat);
        DefaultTableModel modelPD = (DefaultTableModel) this.tblPhieuDat.getModel();
        modelPD.setRowCount(0);
        for (PhieuDat pd : dsPD) {
            String newFormatNgayTao = newSDF.format(pd.getNgayTao());
            String newFormatNgayNhan = newSDF.format(pd.getNgayNhan());
            Object[] data = {pd.getMaPhieuDat(), newFormatNgayTao, newFormatNgayNhan, pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), 1, pd.getKhuyenMai().getTenCTKM()};
            modelPD.addRow(data);
        }
    }

    private void loadDataNgayNhan(Date formatDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newSDF = new SimpleDateFormat("dd/MM/yyyy");
        String formatDayNhan = sdf.format(formatDay);
        ArrayList<PhieuDat> dsPD = new DAO_PhieuDat((DatabaseConnect.getConnection())).getByDateNhan(formatDayNhan);
        DefaultTableModel modelPD = (DefaultTableModel) this.tblPhieuDat.getModel();
        modelPD.setRowCount(0);
        for (PhieuDat pd : dsPD) {
            String newFormatNgayTao = newSDF.format(pd.getNgayTao());
            String newFormatNgayNhan = newSDF.format(pd.getNgayNhan());
            Object[] data = {pd.getMaPhieuDat(), newFormatNgayTao, newFormatNgayNhan, pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), 1, pd.getKhuyenMai().getTenCTKM()};
            modelPD.addRow(data);
        }
    }

    private void loadDataTheo2Ngay(Date day1, Date day2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newSDF = new SimpleDateFormat("dd/MM/yyyy");
        String formatDayDat = sdf.format(day1);
        String formatDayNhan = sdf.format(day2);
        ArrayList<PhieuDat> dsPD = new DAO_PhieuDat((DatabaseConnect.getConnection())).getByDateDatAndDateNhan(formatDayDat, formatDayNhan);
        DefaultTableModel modelPD = (DefaultTableModel) this.tblPhieuDat.getModel();
        modelPD.setRowCount(0);
        for (PhieuDat pd : dsPD) {
            String newFormatNgayTao = newSDF.format(pd.getNgayTao());
            String newFormatNgayNhan = newSDF.format(pd.getNgayNhan());
            Object[] data = {pd.getMaPhieuDat(), newFormatNgayTao, newFormatNgayNhan, pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), 1, pd.getKhuyenMai().getTenCTKM()};
            modelPD.addRow(data);
        }
    }

    private void resetDay() {
        dchTimTheoNgayDat.setDate(null);
        dchTimTheoNgayNhan.setDate(null);
        loadDataTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private com.toedter.calendar.JDateChooser dchTimTheoNgayDat;
    private com.toedter.calendar.JDateChooser dchTimTheoNgayNhan;
    private javax.swing.JLabel lblTimTheoNgayDat;
    private javax.swing.JLabel lblTimTheoNgayNhan;
    private javax.swing.JLabel lblTimTheoTenKH;
    private javax.swing.JLabel lblTimTheoTenNV;
    private javax.swing.JLabel lblTitleDSHoaDon;
    private javax.swing.JPanel pnlTimHD;
    private javax.swing.JScrollPane srcPhieuDat;
    private javax.swing.JTable tblPhieuDat;
    private javax.swing.JTextField txtTimTheoTenKH;
    private javax.swing.JTextField txtTimTheoTenNV;
    // End of variables declaration//GEN-END:variables

    
    private PhieuDat getSelectedPhieuDat() {
        String hd = tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 0).toString();

        String dateDat = tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 1).toString();
        String dateNhan = tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 2).toString();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date sqlDateDat = null,sqlDateNhan = null;
        try {
            java.util.Date utilDateDat = dateFormat.parse(dateDat);
            java.util.Date utilDateNhan = dateFormat.parse(dateNhan);
            
            sqlDateDat = new java.sql.Date(utilDateDat.getTime());
            sqlDateNhan = new java.sql.Date(utilDateNhan.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        
        KhachHang kh = new KhachHang(null, tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 3).toString(), null);
        NhanVien nv = new NhanVien(null, tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 4).toString(), null, true, null, null, null, true, null);
        KhuyenMai km = new KhuyenMai(null, tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 6).toString(), 0, null, null, 0);

        if (tblPhieuDat.getSelectedRow() == -1) {
            return null;
        } else {
            return new PhieuDat(hd, sqlDateDat, sqlDateNhan, kh, nv, km);
        }
    }
    
    
    public void loadDataTable() {
        ArrayList<PhieuDat> dsPD = new DAO_PhieuDat((DatabaseConnect.getConnection())).getAll();
        DefaultTableModel modelPD = (DefaultTableModel) this.tblPhieuDat.getModel();
        modelPD.setRowCount(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        for (PhieuDat pd : dsPD) {
            String maPD = pd.getMaPhieuDat();
            String dateNhan = formatter.format(pd.getNgayNhan());
            String dateDat = formatter.format(pd.getNgayTao());
            String tenKH = pd.getKhachHang().getTenKH();
            String tenNV = pd.getNhanVien().getTenNV();
            String khuyenMai = pd.getKhuyenMai().getTenCTKM();
            Object[] data = {maPD, dateDat, dateNhan, tenKH, tenNV, 1, khuyenMai};
            modelPD.addRow(data);
        }
    }
}
