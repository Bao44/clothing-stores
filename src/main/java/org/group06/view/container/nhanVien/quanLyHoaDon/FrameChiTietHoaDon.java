/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.group06.view.container.nhanVien.quanLyHoaDon;

import com.itextpdf.text.DocumentException;
import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_ChiTietHoaDon;
import org.group06.model.entity.ChiTietHoaDon;
import org.group06.model.entity.HoaDon;
import org.group06.utils.FontConstant;
import org.group06.utils.NumberStandard;
import org.group06.utils.PDF_Creator;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author Dell
 */
public class FrameChiTietHoaDon extends javax.swing.JFrame {

    private HoaDon hoaDon;
    private PanelHoaDon pnlHoaDon;

    public FrameChiTietHoaDon(HoaDon hoaDon, PanelHoaDon pnlHoaDon) {
        this.hoaDon = hoaDon;
        this.pnlHoaDon = pnlHoaDon;
        initComponents();
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

        lblTitleCTHD = new javax.swing.JLabel();
        pnlTTHD = new javax.swing.JPanel();
        lblMaCTHD = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblTenCTKM = new javax.swing.JLabel();
        lblNgayTao = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        txtMaCTHD = new javax.swing.JTextField();
        lblTongTT = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        txtKH = new javax.swing.JTextField();
        txtNV = new javax.swing.JTextField();
        txtTenCTKM = new javax.swing.JTextField();
        txtTongTT = new javax.swing.JTextField();
        pnlDSQA = new javax.swing.JPanel();
        srcChiTietHD = new javax.swing.JScrollPane();
        tblChiTietHD = new javax.swing.JTable();
        btnInHoaDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleCTHD.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTitleCTHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCTHD.setText("Chi Tiết Hóa Đơn");

        lblMaCTHD.setFont(FontConstant.FONT_LABEL);
        lblMaCTHD.setText("Mã chi tiết hóa đơn:");

        lblTenKH.setFont(FontConstant.FONT_LABEL);
        lblTenKH.setText("Tên khách hàng:");

        lblTenCTKM.setFont(FontConstant.FONT_LABEL);
        lblTenCTKM.setText("Tên chương trình KM (Nếu có):");

        lblNgayTao.setFont(FontConstant.FONT_LABEL);
        lblNgayTao.setText("Ngày lập hóa đơn:");

        lblTenNV.setFont(FontConstant.FONT_LABEL);
        lblTenNV.setText("Nhân viên lập hóa đơn:");

        txtMaCTHD.setBackground(new java.awt.Color(242, 242, 242));
        txtMaCTHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaCTHD.setText(hoaDon.getMaHoaDon().toString());
        txtMaCTHD.setBorder(null);
        txtMaCTHD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaCTHD.setEnabled(false);
        txtMaCTHD.setPreferredSize(new java.awt.Dimension(71, 30));

        lblTongTT.setFont(FontConstant.FONT_LABEL);
        lblTongTT.setText("Tổng thành tiền:");

        txtNgayTao.setBackground(new java.awt.Color(242, 242, 242));
        txtNgayTao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNgayTao.setBorder(null);
        txtNgayTao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayTao.setEnabled(false);
        txtNgayTao.setPreferredSize(new java.awt.Dimension(71, 30));

        txtKH.setBackground(new java.awt.Color(242, 242, 242));
        txtKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKH.setText(hoaDon.getKhachHang() != null ? hoaDon.getKhachHang().getTenKH().toString() : "Khách vãng lai");
        txtKH.setBorder(null);
        txtKH.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKH.setEnabled(false);
        txtKH.setPreferredSize(new java.awt.Dimension(71, 30));

        txtNV.setBackground(new java.awt.Color(242, 242, 242));
        txtNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNV.setText(hoaDon.getNhanVien().getTenNV().toString());
        txtNV.setBorder(null);
        txtNV.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNV.setEnabled(false);
        txtNV.setPreferredSize(new java.awt.Dimension(71, 30));

        txtTenCTKM.setBackground(new java.awt.Color(242, 242, 242));
        txtTenCTKM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenCTKM.setText(hoaDon.getKhuyenMai() != null ? (hoaDon.getKhuyenMai().getTenCTKM() + " (" + NumberStandard.formatPercent(hoaDon.getKhuyenMai().getMucGiamGia()) + ")") : "");
        txtTenCTKM.setBorder(null);
        txtTenCTKM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenCTKM.setEnabled(false);
        txtTenCTKM.setPreferredSize(new java.awt.Dimension(71, 30));

        txtTongTT.setBackground(new java.awt.Color(242, 242, 242));
        txtTongTT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTongTT.setBorder(null);
        txtTongTT.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        txtTongTT.setEnabled(false);
        txtTongTT.setPreferredSize(new java.awt.Dimension(71, 30));

        javax.swing.GroupLayout pnlTTHDLayout = new javax.swing.GroupLayout(pnlTTHD);
        pnlTTHD.setLayout(pnlTTHDLayout);
        pnlTTHDLayout.setHorizontalGroup(
            pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTHDLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblTenCTKM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgayTao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaCTHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTongTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKH, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );
        pnlTTHDLayout.setVerticalGroup(
            pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongTT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Chuyển đổi thành chuỗi
        String dateString = dateFormat.format(hoaDon.getNgayTao());
        txtNgayTao.setText(dateString);

        pnlDSQA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách quần áo đã mua", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        tblChiTietHD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblChiTietHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên quần áo", "Giá tiền", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTietHD.setRowHeight(30);
        srcChiTietHD.setViewportView(tblChiTietHD);
        if (tblChiTietHD.getColumnModel().getColumnCount() > 0) {
            tblChiTietHD.getColumnModel().getColumn(0).setResizable(false);
            tblChiTietHD.getColumnModel().getColumn(1).setResizable(false);
            tblChiTietHD.getColumnModel().getColumn(2).setResizable(false);
            tblChiTietHD.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout pnlDSQALayout = new javax.swing.GroupLayout(pnlDSQA);
        pnlDSQA.setLayout(pnlDSQALayout);
        pnlDSQALayout.setHorizontalGroup(
            pnlDSQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srcChiTietHD, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlDSQALayout.setVerticalGroup(
            pnlDSQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srcChiTietHD, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        btnInHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInHoaDon.setText("In Hóa Đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDSQA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTTHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitleCTHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitleCTHD, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTTHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDSQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn Vị Trí Lưu Hoá Đơn");
        // Chỉ cho phép lưu file với định dạng .pdf
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF files", "pdf"));
        fileChooser.setSelectedFile(new File(hoaDon.getMaHoaDon() + ".pdf"));
        // Hiển thị hộp thoại để chọn vị trí lưu file
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn đã chọn
            String filePath = fileChooser.getSelectedFile().getPath();
            // Kiểm tra xem có đuôi mở rộng của file không
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }
            // Kiểm tra nếu file đã tồn tại
            File file = fileChooser.getSelectedFile();
            if (file.exists()) {
                int response = JOptionPane.showConfirmDialog(null,
                        "File đã tồn tại, bạn có muốn ghi đè lên file này?", "Cảnh báo",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    // Lưu file
                    try {
                        PDF_Creator.createInvoice(hoaDon, filePath);
                    } catch (DocumentException | IOException e1) {
                        System.out.println("Lỗi khi lưu file!");
                        JOptionPane.showMessageDialog(this, "Lỗi khi lưu file!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                    // Mở file vừa lưu
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().open(file);
                        } catch (IOException e1) {
                            System.out.println("Lỗi khi mở file!");
                            JOptionPane.showMessageDialog(this, "Lỗi khi mở file!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } else {
                // Lưu file
                try {
                    PDF_Creator.createInvoice(hoaDon, filePath);
                } catch (DocumentException | IOException e1) {
                    System.out.println("Lỗi khi lưu file!");
                    JOptionPane.showMessageDialog(this, "Lỗi khi lưu file!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
                // Mở file vừa lưu
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().open(file);
                    } catch (IOException e1) {
                        System.out.println("Lỗi khi mở file!");
                        JOptionPane.showMessageDialog(this, "Lỗi khi mở file!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnInHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JLabel lblMaCTHD;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblTenCTKM;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTitleCTHD;
    private javax.swing.JLabel lblTongTT;
    private javax.swing.JPanel pnlDSQA;
    private javax.swing.JPanel pnlTTHD;
    private javax.swing.JScrollPane srcChiTietHD;
    private javax.swing.JTable tblChiTietHD;
    private javax.swing.JTextField txtKH;
    private javax.swing.JTextField txtMaCTHD;
    private javax.swing.JTextField txtNV;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenCTKM;
    private javax.swing.JTextField txtTongTT;
    // End of variables declaration//GEN-END:variables

    private void loadDataTable() {
        double tinhTongThanhTien = 0, mucGiamGia = 0;
        String hd = hoaDon.getMaHoaDon().toString();
        ArrayList<ChiTietHoaDon> dsCTHD = new DAO_ChiTietHoaDon((DatabaseConnect.getConnection())).getAllCTQA(hd);
        DefaultTableModel modelCTHD = (DefaultTableModel) this.tblChiTietHD.getModel();
        modelCTHD.setRowCount(0);
        DecimalFormat dfMoney = new DecimalFormat("##,### VNĐ");
        for (ChiTietHoaDon cthd : dsCTHD) {
            String tenQA = cthd.getQuanAo().getTenQA();
            String giaBan = dfMoney.format(cthd.getQuanAo().getGiaNhap() + (cthd.getQuanAo().getGiaNhap() * cthd.getQuanAo().getLoiNhuan() / 100));
            int soLuong = cthd.getSoLuong();
            double tinhThanhTien = cthd.getGiaBan() * soLuong;
            String thanhTien = dfMoney.format(tinhThanhTien);

            tinhTongThanhTien += tinhThanhTien;

            Object[] data = {tenQA, giaBan, soLuong, thanhTien};
            modelCTHD.addRow(data);

            if (cthd.getHoaDon().getKhuyenMai() != null) {
                mucGiamGia = (cthd.getHoaDon().getKhuyenMai().getMucGiamGia()) / 100;
            }
        }
        double tongTienSauVAT = tinhTongThanhTien + (tinhTongThanhTien * 0.08);
        double ttt = (tongTienSauVAT - (tongTienSauVAT * mucGiamGia));
        String tongThanhTien = dfMoney.format(ttt);
        txtTongTT.setText(tongThanhTien);
    }
}
