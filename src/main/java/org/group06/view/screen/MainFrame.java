/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.group06.view.screen;

import org.group06.utils.ColorConstant;
import org.group06.utils.ImagePath;
import org.group06.view.components.panels.ImagePanel;
import org.group06.view.components.panels.container.PanelBanHang;
import org.group06.view.components.panels.container.PanelQuanAoNhanVien;

import javax.swing.*;
import java.awt.*;

/**
 * @author lehoa
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public MainFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        spr02.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSelect = new javax.swing.ButtonGroup();
        pnSideBar = new javax.swing.JPanel();
        pnLogo = new ImagePanel(ImagePath.THUMBNAIL_LOGO, 150, 100);
        spr01 = new javax.swing.JSeparator();
        pnUser = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        pnChucNang = new javax.swing.JPanel();
        btnBanHang = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE);
        btnQuanAo = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE);
        btnHoaDon = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE);
        btnPhieuTam = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE);
        btnKhachHang = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE);
        btnNhanVien = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE);
        spr02 = new javax.swing.JSeparator();
        spr03 = new javax.swing.JSeparator();
        btnThongKe = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE);
        btnDangXuat = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE);
        pnContainer = new PanelBanHang();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần Mềm Quản Lý Cửa Hàng");
        setIconImage(ImagePath.loadImage(ImagePath.ICON_LOGO)
        );
        setUndecorated(true);

        pnSideBar.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        pnSideBar.setPreferredSize(new java.awt.Dimension(320, 781));

        pnLogo.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        pnLogo.setMaximumSize(new java.awt.Dimension(490, 166));
        pnLogo.setMinimumSize(new java.awt.Dimension(490, 166));
        pnLogo.setPreferredSize(new java.awt.Dimension(490, 166));

        javax.swing.GroupLayout pnLogoLayout = new javax.swing.GroupLayout(pnLogo);
        pnLogo.setLayout(pnLogoLayout);
        pnLogoLayout.setHorizontalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        spr01.setPreferredSize(new java.awt.Dimension(320, 3));

        pnUser.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        pnUser.setPreferredSize(new java.awt.Dimension(320, 100));

        lblAvatar.setIcon(ImagePath.loadIcon(ImagePath.ICON_USER)
        );

        lblHoTen.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHoTen.setForeground(ColorConstant.WHITE);
        lblHoTen.setText("Le Minh Bao");

        lblChucVu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChucVu.setForeground(ColorConstant.WHITE);
        lblChucVu.setText("Nhan Vien Ban Hang");

        javax.swing.GroupLayout pnUserLayout = new javax.swing.GroupLayout(pnUser);
        pnUser.setLayout(pnUserLayout);
        pnUserLayout.setHorizontalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnUserLayout.setVerticalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnUserLayout.createSequentialGroup()
                        .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblChucVu)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnChucNang.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        pnChucNang.setPreferredSize(new java.awt.Dimension(320, 230));
        pnChucNang.setLayout(new java.awt.GridLayout(10, 1));

        grpSelect.add(btnBanHang);
        btnBanHang.setIcon(ImagePath.loadIcon(ImagePath.ICON_SELL)
        );
        btnBanHang.setText("Bán Hàng");
        btnBanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBanHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBanHang.setIconTextGap(15);
        btnBanHang.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });
        pnChucNang.add(btnBanHang);

        grpSelect.add(btnQuanAo);
        btnQuanAo.setIcon(ImagePath.loadIcon(ImagePath.ICON_CLOTHES)
        );
        btnQuanAo.setText("Quần Áo");
        btnQuanAo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanAo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanAo.setIconTextGap(15);
        btnQuanAo.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnQuanAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanAoActionPerformed(evt);
            }
        });
        pnChucNang.add(btnQuanAo);

        grpSelect.add(btnHoaDon);
        btnHoaDon.setIcon(ImagePath.loadIcon(ImagePath.ICON_BILL)
        );
        btnHoaDon.setText("Hoá Đơn");
        btnHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHoaDon.setIconTextGap(15);
        btnHoaDon.setMargin(new java.awt.Insets(2, 50, 3, 14));
        pnChucNang.add(btnHoaDon);

        grpSelect.add(btnPhieuTam);
        btnPhieuTam.setIcon(ImagePath.loadIcon(ImagePath.ICON_DRAFT)
        );
        btnPhieuTam.setText("Phiếu Tạm");
        btnPhieuTam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhieuTam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPhieuTam.setIconTextGap(15);
        btnPhieuTam.setMargin(new java.awt.Insets(2, 50, 3, 14));
        pnChucNang.add(btnPhieuTam);

        grpSelect.add(btnKhachHang);
        btnKhachHang.setIcon(ImagePath.loadIcon(ImagePath.ICON_CUSTOMER)
        );
        btnKhachHang.setText("Khách Hàng");
        btnKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhachHang.setIconTextGap(15);
        btnKhachHang.setMargin(new java.awt.Insets(2, 50, 3, 14));
        pnChucNang.add(btnKhachHang);

        grpSelect.add(btnNhanVien);
        btnNhanVien.setIcon(ImagePath.loadIcon(ImagePath.ICON_EMPLOYEE));
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhanVien.setIconTextGap(15);
        btnNhanVien.setMargin(new java.awt.Insets(2, 50, 3, 14));
        pnChucNang.add(btnNhanVien);

        spr02.setPreferredSize(new java.awt.Dimension(0, 0));
        pnChucNang.add(spr02);
        pnChucNang.add(spr03);

        grpSelect.add(btnThongKe);
        btnThongKe.setIcon(ImagePath.loadIcon(ImagePath.ICON_CHART)
        );
        btnThongKe.setText("Thống Kê");
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe.setIconTextGap(15);
        btnThongKe.setMargin(new java.awt.Insets(2, 50, 3, 14));
        pnChucNang.add(btnThongKe);

        grpSelect.add(btnDangXuat);
        btnDangXuat.setIcon(ImagePath.loadIcon(ImagePath.ICON_LOGOUT)
        );
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDangXuat.setIconTextGap(15);
        btnDangXuat.setMargin(new java.awt.Insets(2, 50, 3, 14));
        pnChucNang.add(btnDangXuat);

        javax.swing.GroupLayout pnSideBarLayout = new javax.swing.GroupLayout(pnSideBar);
        pnSideBar.setLayout(pnSideBarLayout);
        pnSideBarLayout.setHorizontalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSideBarLayout.createSequentialGroup()
                .addGroup(pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnSideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spr01, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(pnChucNang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnSideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnUser, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnSideBarLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        pnSideBarLayout.setVerticalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSideBarLayout.createSequentialGroup()
                .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spr01, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
        );

        getContentPane().add(pnSideBar, java.awt.BorderLayout.WEST);

        pnContainer.setBackground(ColorConstant.BACKGROUND_CONTAINER);

        javax.swing.GroupLayout pnContainerLayout = new javax.swing.GroupLayout(pnContainer);
        pnContainer.setLayout(pnContainerLayout);
        pnContainerLayout.setHorizontalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
        );
        pnContainerLayout.setVerticalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );

        getContentPane().add(pnContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelBanHang();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnQuanAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanAoActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelQuanAoNhanVien();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnQuanAoActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBanHang;
    private javax.swing.JToggleButton btnDangXuat;
    private javax.swing.JToggleButton btnHoaDon;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JToggleButton btnPhieuTam;
    private javax.swing.JToggleButton btnQuanAo;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.ButtonGroup grpSelect;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JPanel pnChucNang;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnSideBar;
    private javax.swing.JPanel pnUser;
    private javax.swing.JSeparator spr01;
    private javax.swing.JSeparator spr02;
    private javax.swing.JSeparator spr03;
    // End of variables declaration//GEN-END:variables
}
