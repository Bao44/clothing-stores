/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;
import org.group06.utils.ImagePath;

/**
 *
 * @author Dell
 */
public class PanelNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form PanelNhanVien
     */
    public PanelNhanVien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleNV = new javax.swing.JLabel();
        txtTimMaNV = new org.group06.view.components.textFields.TextField("Số mã nhân viên cần tìm", ColorConstant.BLACK);
        btnTimMaNV = new org.group06.view.components.buttons.StaticRoundButton("", ImagePath.ICON_SEARCH, ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        pnlTTNV = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new org.group06.view.components.textFields.TextField();
        lblTenNV = new javax.swing.JLabel();
        txtTenNV = new org.group06.view.components.textFields.TextField();
        lblMK = new javax.swing.JLabel();
        txtMK = new org.group06.view.components.textFields.TextField();
        txtCCCD = new org.group06.view.components.textFields.TextField();
        lblCCCD = new javax.swing.JLabel();
        txtSDT = new org.group06.view.components.textFields.TextField();
        lblViTri = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblCaLV = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        txtDiaChi = new org.group06.view.components.textFields.TextField();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        cboCaLV = new javax.swing.JComboBox<>();
        cboTrangThai = new javax.swing.JComboBox<>();
        cboViTri = new javax.swing.JComboBox<>();
        pnlCN = new javax.swing.JPanel();
        btnXoaTrang = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        btnThemNV = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        btnCapNhat = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        btnLuu = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        scrNhanVien = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        setBackground(ColorConstant.BACKGROUND_CONTAINER);

        lblTitleNV.setFont(FontConstant.FONT_HEADER);
        lblTitleNV.setForeground(ColorConstant.WHITE);
        lblTitleNV.setText("Thông tin nhân viên");

        txtTimMaNV.setFont(FontConstant.FONT_TEXT);
        txtTimMaNV.setToolTipText("Nhập mã nhân viên cần tìm");
        txtTimMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimMaNVActionPerformed(evt);
            }
        });

        btnTimMaNV.setToolTipText("Click để tìm kiếm khách hàng");
        btnTimMaNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimMaNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMaNV.setFont(FontConstant.FONT_TEXT);
        lblMaNV.setText("Mã nhân viên:");

        txtMaNV.setFont(FontConstant.FONT_TEXT);
        txtMaNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaNV.setEnabled(false);
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        lblTenNV.setFont(FontConstant.FONT_LABEL);
        lblTenNV.setText("Tên nhân viên:");

        txtTenNV.setFont(FontConstant.FONT_TEXT);
        txtTenNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTenNV.setEnabled(false);

        lblMK.setFont(FontConstant.FONT_LABEL);
        lblMK.setText("Mật khẩu:");

        txtMK.setFont(FontConstant.FONT_TEXT);
        txtMK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMK.setEnabled(false);
        txtMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKActionPerformed(evt);
            }
        });

        txtCCCD.setFont(FontConstant.FONT_TEXT);
        txtCCCD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCCCD.setEnabled(false);
        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDActionPerformed(evt);
            }
        });

        lblCCCD.setFont(FontConstant.FONT_LABEL);
        lblCCCD.setText("Căn cước công dân:");

        txtSDT.setFont(FontConstant.FONT_TEXT);
        txtSDT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSDT.setEnabled(false);
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        lblViTri.setFont(FontConstant.FONT_LABEL);
        lblViTri.setText("Vị trí:");

        lblTrangThai.setFont(FontConstant.FONT_LABEL);
        lblTrangThai.setText("Trạng thái:");

        lblGioiTinh.setFont(FontConstant.FONT_LABEL);
        lblGioiTinh.setText("Giới tính:");

        lblCaLV.setFont(FontConstant.FONT_LABEL);
        lblCaLV.setText("Ca làm việc:");

        lblDiaChi.setFont(FontConstant.FONT_LABEL);
        lblDiaChi.setText("Địa chỉ:");

        lblSDT.setFont(FontConstant.FONT_LABEL);
        lblSDT.setText("Số điện thoại:");

        txtDiaChi.setFont(FontConstant.FONT_TEXT);
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaChi.setEnabled(false);
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        rdoNu.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rdoNu.setText("Nữ");
        rdoNu.setEnabled(false);

        rdoNam.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rdoNam.setText("Nam");
        rdoNam.setEnabled(false);

        cboCaLV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboCaLV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sáng", "Chiều" }));
        cboCaLV.setEnabled(false);

        cboTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang làm việc", "Nghỉ" }));
        cboTrangThai.setEnabled(false);

        cboViTri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboViTri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên thu ngân", "Nhân viên quản lí" }));
        cboViTri.setEnabled(false);

        javax.swing.GroupLayout pnlTTNVLayout = new javax.swing.GroupLayout(pnlTTNV);
        pnlTTNV.setLayout(pnlTTNVLayout);
        pnlTTNVLayout.setHorizontalGroup(
            pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTNVLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCaLV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenNV)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(txtMaNV)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTNVLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(rdoNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoNu)
                        .addGap(55, 55, 55))
                    .addGroup(pnlTTNVLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCaLV, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMK, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTTNVLayout.createSequentialGroup()
                        .addComponent(cboViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTTNVLayout.setVerticalGroup(
            pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTNVLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTTNVLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaLV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCaLV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnXoaTrang.setFont(FontConstant.FONT_BUTTON);
        btnXoaTrang.setForeground(ColorConstant.WHITE);
        btnXoaTrang.setText("Xóa trắng");
        btnXoaTrang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaTrang.setEnabled(false);

        btnThemNV.setFont(FontConstant.FONT_BUTTON);
        btnThemNV.setForeground(ColorConstant.WHITE);
        btnThemNV.setText("Thêm ");
        btnThemNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNVActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(FontConstant.FONT_BUTTON);
        btnCapNhat.setForeground(ColorConstant.WHITE);
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhat.setEnabled(false);

        btnLuu.setFont(FontConstant.FONT_BUTTON);
        btnLuu.setForeground(ColorConstant.WHITE);
        btnLuu.setText("Lưu");
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.setEnabled(false);

        javax.swing.GroupLayout pnlCNLayout = new javax.swing.GroupLayout(pnlCN);
        pnlCN.setLayout(pnlCNLayout);
        pnlCNLayout.setHorizontalGroup(
            pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGroup(pnlCNLayout.createSequentialGroup()
                        .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCNLayout.setVerticalGroup(
            pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Mật khẩu", "Giới tính", "Căn cước công dân", "Địa chỉ", "Số điện thoại", "Trạng thái", "Vị trí", "Ca làm việc"
            }
        ));
        scrNhanVien.setViewportView(tblNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrNhanVien)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlTTNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitleNV, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimMaNV)
                    .addComponent(lblTitleNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTTNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimMaNVActionPerformed

    private void txtMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKActionPerformed

    private void txtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void btnThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemNVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemNV;
    private javax.swing.JButton btnTimMaNV;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> cboCaLV;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JComboBox<String> cboViTri;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblCaLV;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMK;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTitleNV;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblViTri;
    private javax.swing.JPanel pnlCN;
    private javax.swing.JPanel pnlTTNV;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JScrollPane scrNhanVien;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimMaNV;
    // End of variables declaration//GEN-END:variables
}
