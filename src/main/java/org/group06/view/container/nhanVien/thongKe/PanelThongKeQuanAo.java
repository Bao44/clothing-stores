package org.group06.view.container.nhanVien.thongKe;

import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_ChiTietHoaDon;
import org.group06.db.dao.DAO_HoaDon;
import org.group06.model.entity.*;
import org.group06.utils.DateStandard;
import org.group06.utils.NumberStandard;
import org.group06.view.container.nhanVien.quanLyHoaDon.FrameChiTietHoaDon;
import org.group06.view.container.nhanVien.quanLyHoaDon.PanelHoaDon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.group06.db.dao.DAO_QuanAo;

/**
 * @author Le Hoang Nam
 */
public class PanelThongKeQuanAo extends javax.swing.JPanel {

    private final Connection connection = DatabaseConnect.getConnection();
    private final DAO_HoaDon dao_HoaDon = new DAO_HoaDon(connection);
    private final DAO_QuanAo dao_QuanAo = new DAO_QuanAo(connection);
    private final DAO_ChiTietHoaDon dao_ChiTietHoaDon = new DAO_ChiTietHoaDon(connection);
    private ArrayList<HoaDon> dsHoaDon = new ArrayList<>();
    private ArrayList<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<>();

    /**
     * Creates new form PanelThongKeDoanhThu
     */
    public PanelThongKeQuanAo() {
        dsHoaDon = dao_HoaDon.getAll();
        dsChiTietHoaDon = dao_ChiTietHoaDon.getAll();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        tabXemThongTin = new javax.swing.JTabbedPane();
        pnlBangChiTiet = new javax.swing.JPanel();
        pnlTongQuan = new javax.swing.JPanel();
        tabLuaChonThongKe = new javax.swing.JTabbedPane();
        pnlTkQuanAoHet = new javax.swing.JPanel();
        lblTKQuanAoHet = new javax.swing.JLabel();
        pnlTkToanBo = new javax.swing.JPanel();
        lblToanBo = new javax.swing.JLabel();
        pnlTkTheoNgay = new javax.swing.JPanel();
        lblChonNgay = new javax.swing.JLabel();
        dchChonNgay = new com.toedter.calendar.JDateChooser();
        pnlTkTheoThang = new javax.swing.JPanel();
        lblChonThangVaNam = new javax.swing.JLabel();
        monthTheoThang = new com.toedter.calendar.JMonthChooser();
        yearTheoThang = new com.toedter.calendar.JYearChooser();
        pnlTkTheoNam = new javax.swing.JPanel();
        lblChonNam = new javax.swing.JLabel();
        yearTheoNam = new com.toedter.calendar.JYearChooser();
        pnlTkTheoKhoangThoiGian = new javax.swing.JPanel();
        lblTuNgay = new javax.swing.JLabel();
        dchTuNgay = new com.toedter.calendar.JDateChooser();
        lblDenNgay = new javax.swing.JLabel();
        dchDenNgay = new com.toedter.calendar.JDateChooser();
        pnlTongQuanQuanAo = new javax.swing.JPanel();
        lblTongHD = new javax.swing.JLabel();
        lblTongQA = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        lblLoiNhuan = new javax.swing.JLabel();
        txtTongHD = new javax.swing.JTextField();
        txtTongQA = new javax.swing.JTextField();
        txtDoanhThu = new javax.swing.JTextField();
        txtLoiNhuan = new javax.swing.JTextField();
        scrTopQuanAo = new javax.swing.JScrollPane();
        tblTopQuanAo = new javax.swing.JTable();
        pnlBieuDo = new javax.swing.JPanel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thống Kê Quần Áo");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tabXemThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabXemThongTin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        pnlBangChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlTongQuan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tổng Quan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        pnlTongQuan.setLayout(new java.awt.GridLayout(1, 0));

        tabLuaChonThongKe.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabLuaChonThongKe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabLuaChonThongKe.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabLuaChonThongKeStateChanged(evt);
            }
        });

        lblTKQuanAoHet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTKQuanAoHet.setText("Đang Hiển Thị Thống Kê Quần Áo Hết");

        javax.swing.GroupLayout pnlTkQuanAoHetLayout = new javax.swing.GroupLayout(pnlTkQuanAoHet);
        pnlTkQuanAoHet.setLayout(pnlTkQuanAoHetLayout);
        pnlTkQuanAoHetLayout.setHorizontalGroup(
            pnlTkQuanAoHetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkQuanAoHetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTKQuanAoHet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTkQuanAoHetLayout.setVerticalGroup(
            pnlTkQuanAoHetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkQuanAoHetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTKQuanAoHet)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Quần Áo Hết", pnlTkQuanAoHet);

        lblToanBo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblToanBo.setText("Đang Hiển Thị Thống Kê Toàn Thời Gian");

        javax.swing.GroupLayout pnlTkToanBoLayout = new javax.swing.GroupLayout(pnlTkToanBo);
        pnlTkToanBo.setLayout(pnlTkToanBoLayout);
        pnlTkToanBoLayout.setHorizontalGroup(
            pnlTkToanBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkToanBoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToanBo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTkToanBoLayout.setVerticalGroup(
            pnlTkToanBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkToanBoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToanBo)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Toàn Bộ Thời Gian", pnlTkToanBo);

        lblChonNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChonNgay.setText("Chọn ngày:");

        dchChonNgay.setDate(new java.util.Date());
        dchChonNgay.setDateFormatString("dd-MM-yyyy");
        dchChonNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchChonNgay.setMaxSelectableDate(new java.util.Date());
        dchChonNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchChonNgayPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTkTheoNgayLayout = new javax.swing.GroupLayout(pnlTkTheoNgay);
        pnlTkTheoNgay.setLayout(pnlTkTheoNgayLayout);
        pnlTkTheoNgayLayout.setHorizontalGroup(
            pnlTkTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTkTheoNgayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTkTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchChonNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(pnlTkTheoNgayLayout.createSequentialGroup()
                        .addComponent(lblChonNgay)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTkTheoNgayLayout.setVerticalGroup(
            pnlTkTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoNgayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChonNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dchChonNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        dchChonNgay.setLocale(new Locale("vi", "VN"));
        dchChonNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
        dchChonNgay.getDateEditor().setEnabled(false);
        ((com.toedter.calendar.JTextFieldDateEditor) dchChonNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

        tabLuaChonThongKe.addTab("Thống Kê Theo Ngày", pnlTkTheoNgay);

        lblChonThangVaNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChonThangVaNam.setText("Chọn tháng và năm:");

        monthTheoThang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        monthTheoThang.setYearChooser(yearTheoThang);
        monthTheoThang.setLocale(new Locale("vi", "VN"));
        monthTheoThang.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                monthTheoThangPropertyChange(evt);
            }
        });

        yearTheoThang.setEndYear(LocalDate.now().getYear());
        yearTheoThang.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearTheoThangPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTkTheoThangLayout = new javax.swing.GroupLayout(pnlTkTheoThang);
        pnlTkTheoThang.setLayout(pnlTkTheoThangLayout);
        pnlTkTheoThangLayout.setHorizontalGroup(
            pnlTkTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoThangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTkTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTkTheoThangLayout.createSequentialGroup()
                        .addComponent(lblChonThangVaNam)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlTkTheoThangLayout.createSequentialGroup()
                        .addComponent(monthTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTkTheoThangLayout.setVerticalGroup(
            pnlTkTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoThangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChonThangVaNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTkTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(monthTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Theo Tháng", pnlTkTheoThang);

        lblChonNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChonNam.setText("Chọn năm:");

        yearTheoNam.setEndYear(LocalDate.now().getYear());
        yearTheoNam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearTheoNamPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTkTheoNamLayout = new javax.swing.GroupLayout(pnlTkTheoNam);
        pnlTkTheoNam.setLayout(pnlTkTheoNamLayout);
        pnlTkTheoNamLayout.setHorizontalGroup(
            pnlTkTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoNamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTkTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTkTheoNamLayout.createSequentialGroup()
                        .addComponent(lblChonNam)
                        .addGap(0, 517, Short.MAX_VALUE))
                    .addComponent(yearTheoNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTkTheoNamLayout.setVerticalGroup(
            pnlTkTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoNamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChonNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearTheoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Theo Năm", pnlTkTheoNam);

        lblTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTuNgay.setText("Từ ngày:");

        dchTuNgay.setDate(new java.util.Date());
        dchTuNgay.setDateFormatString("dd-MM-yyyy");
        dchTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchTuNgay.setMaxSelectableDate(dchDenNgay.getDate());
        dchTuNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchTuNgayPropertyChange(evt);
            }
        });

        lblDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDenNgay.setText("Đến ngày:");

        dchDenNgay.setDate(new java.util.Date());
        dchDenNgay.setDateFormatString("dd-MM-yyyy");
        dchDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchDenNgay.setMinSelectableDate(dchTuNgay.getDate());
        dchDenNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchDenNgayPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTkTheoKhoangThoiGianLayout = new javax.swing.GroupLayout(pnlTkTheoKhoangThoiGian);
        pnlTkTheoKhoangThoiGian.setLayout(pnlTkTheoKhoangThoiGianLayout);
        pnlTkTheoKhoangThoiGianLayout.setHorizontalGroup(
            pnlTkTheoKhoangThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoKhoangThoiGianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTkTheoKhoangThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(pnlTkTheoKhoangThoiGianLayout.createSequentialGroup()
                        .addGroup(pnlTkTheoKhoangThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTuNgay)
                            .addComponent(lblDenNgay))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dchDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTkTheoKhoangThoiGianLayout.setVerticalGroup(
            pnlTkTheoKhoangThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoKhoangThoiGianLayout.createSequentialGroup()
                .addComponent(lblTuNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dchTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDenNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dchDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        dchTuNgay.setLocale(new Locale("vi", "VN"));
        dchTuNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
        dchTuNgay.getDateEditor().setEnabled(false);
        ((com.toedter.calendar.JTextFieldDateEditor) dchTuNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);
        dchDenNgay.setLocale(new Locale("vi", "VN"));
        dchDenNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
        dchDenNgay.getDateEditor().setEnabled(false);
        ((com.toedter.calendar.JTextFieldDateEditor) dchDenNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

        tabLuaChonThongKe.addTab("Thống Kê Theo Khoảng Thời Gian", pnlTkTheoKhoangThoiGian);

        javax.swing.JLabel lblQuanAoHet = new javax.swing.JLabel("Thống Kê Quần Áo Hết");
        javax.swing.JLabel lblToanBo = new javax.swing.JLabel("Thống Kê Toàn Bộ Thời Gian");
        javax.swing.JLabel lblTheoNgay = new javax.swing.JLabel("Thống Kê Theo Ngày");
        javax.swing.JLabel lblTheoThang = new javax.swing.JLabel("Thống Kê Theo Tháng");
        javax.swing.JLabel lblTheoNam = new javax.swing.JLabel("Thống Kê Theo Năm");
        javax.swing.JLabel lblTheoKhoangThoiGian = new javax.swing.JLabel("Thống Kê Theo Khoảng Thời Gian");

        lblQuanAoHet.setPreferredSize(new Dimension(270, 30));
        lblToanBo.setPreferredSize(new Dimension(270, 30));
        lblTheoNgay.setPreferredSize(new Dimension(270, 30));
        lblTheoThang.setPreferredSize(new Dimension(270, 30));
        lblTheoNam.setPreferredSize(new Dimension(270, 30));
        lblTheoKhoangThoiGian.setPreferredSize(new Dimension(270, 30));

        lblQuanAoHet.setHorizontalAlignment(SwingConstants.LEFT);
        lblToanBo.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoNgay.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoThang.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoNam.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoKhoangThoiGian.setHorizontalAlignment(SwingConstants.LEFT);

        lblQuanAoHet.setFont(new Font("Segoe UI", 0, 18));
        lblToanBo.setFont(new Font("Segoe UI", 0, 18));
        lblTheoNgay.setFont(new Font("Segoe UI", 0, 18));
        lblTheoThang.setFont(new Font("Segoe UI", 0, 18));
        lblTheoNam.setFont(new Font("Segoe UI", 0, 18));
        lblTheoKhoangThoiGian.setFont(new Font("Segoe UI", 0, 18));

        tabLuaChonThongKe.setTabComponentAt(0, lblQuanAoHet);
        tabLuaChonThongKe.setTabComponentAt(1, lblToanBo);
        tabLuaChonThongKe.setTabComponentAt(2, lblTheoNgay);
        tabLuaChonThongKe.setTabComponentAt(3, lblTheoThang);
        tabLuaChonThongKe.setTabComponentAt(4, lblTheoNam);
        tabLuaChonThongKe.setTabComponentAt(5, lblTheoKhoangThoiGian);

        pnlTongQuan.add(tabLuaChonThongKe);

        pnlTongQuanQuanAo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tổng Quan Quần Áo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTongHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongHD.setText("Tổng quần áo đã bán:");

        lblTongQA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongQA.setText("Loại quần áo được mua nhiều nhất:");

        lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDoanhThu.setText("Tên quần áo được mua nhiều nhất:");

        lblLoiNhuan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLoiNhuan.setText("Lợi nhuận thu được:");

        txtTongHD.setEditable(false);
        txtTongHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTongHD.setForeground(new java.awt.Color(255, 51, 51));
        txtTongHD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTongHD.setText(NumberStandard.formatInteger(0));
        txtTongHD.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtTongHD.setFocusable(false);

        txtTongQA.setEditable(false);
        txtTongQA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTongQA.setForeground(new java.awt.Color(255, 51, 51));
        txtTongQA.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTongQA.setText(NumberStandard.formatInteger(0));
        txtTongQA.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtTongQA.setFocusable(false);

        txtDoanhThu.setEditable(false);
        txtDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDoanhThu.setForeground(new java.awt.Color(255, 51, 51));
        txtDoanhThu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoanhThu.setText(NumberStandard.formatMoney(0));
        txtDoanhThu.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtDoanhThu.setFocusable(false);

        txtLoiNhuan.setEditable(false);
        txtLoiNhuan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoiNhuan.setForeground(new java.awt.Color(255, 51, 51));
        txtLoiNhuan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLoiNhuan.setText(NumberStandard.formatMoney(0));
        txtLoiNhuan.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtLoiNhuan.setFocusable(false);

        javax.swing.GroupLayout pnlTongQuanQuanAoLayout = new javax.swing.GroupLayout(pnlTongQuanQuanAo);
        pnlTongQuanQuanAo.setLayout(pnlTongQuanQuanAoLayout);
        pnlTongQuanQuanAoLayout.setHorizontalGroup(
            pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTongQuanQuanAoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTongQA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTongHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoiNhuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongHD)
                    .addComponent(txtTongQA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLoiNhuan))
                .addContainerGap())
        );
        pnlTongQuanQuanAoLayout.setVerticalGroup(
            pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongQuanQuanAoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongHD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongHD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongQA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongQA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoiNhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoiNhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlTongQuanQuanAoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblTongHD, txtDoanhThu, txtLoiNhuan, txtTongHD, txtTongQA});

        pnlTongQuan.add(pnlTongQuanQuanAo);

        scrTopQuanAo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Top Quần Áo Bán Chạy Nhất", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblTopQuanAo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblTopQuanAo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Quần Áo", "Tên Quần Áo", "Loại Quần Áo", "Số Lượng Đã Bán", "Lợi Nhuận"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTopQuanAo.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                    isSelected, hasFocus, row, column);
                if (column == 3) {
                    setHorizontalAlignment(JLabel.RIGHT);
                } else {
                    setHorizontalAlignment(JLabel.LEFT);
                }
                return c;
            }
        });
        tblTopQuanAo.setFillsViewportHeight(true);
        tblTopQuanAo.setRowHeight(50);
        tblTopQuanAo.setShowGrid(true);
        tblTopQuanAo.getTableHeader().setResizingAllowed(false);
        tblTopQuanAo.getTableHeader().setReorderingAllowed(false);
        tblTopQuanAo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTopQuanAoMouseClicked(evt);
            }
        });
        scrTopQuanAo.setViewportView(tblTopQuanAo);

        javax.swing.GroupLayout pnlBangChiTietLayout = new javax.swing.GroupLayout(pnlBangChiTiet);
        pnlBangChiTiet.setLayout(pnlBangChiTietLayout);
        pnlBangChiTietLayout.setHorizontalGroup(
            pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBangChiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrTopQuanAo)
                    .addComponent(pnlTongQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBangChiTietLayout.setVerticalGroup(
            pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBangChiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTongQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrTopQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        scrTopQuanAo.getAccessibleContext().setAccessibleName("Top Quần Áo Bán Chạy Nhất");

        tabXemThongTin.addTab("Bảng Chi Tiết", pnlBangChiTiet);

        pnlBieuDo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlBieuDoLayout = new javax.swing.GroupLayout(pnlBieuDo);
        pnlBieuDo.setLayout(pnlBieuDoLayout);
        pnlBieuDoLayout.setHorizontalGroup(
            pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1838, Short.MAX_VALUE)
        );
        pnlBieuDoLayout.setVerticalGroup(
            pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );

        tabXemThongTin.addTab("Biểu Đồ Trực Quan", pnlBieuDo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabXemThongTin))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabXemThongTin)
                .addContainerGap())
        );

        javax.swing.JLabel lblBanHang = new javax.swing.JLabel("Bảng Chi Tiết");
        javax.swing.JLabel lblDatHang = new javax.swing.JLabel("Biểu Đồ Trực Quan");
        lblBanHang.setPreferredSize(new Dimension(350, 30));
        lblDatHang.setPreferredSize(new Dimension(350, 30));
        lblBanHang.setHorizontalAlignment(SwingConstants.CENTER);
        lblDatHang.setHorizontalAlignment(SwingConstants.CENTER);
        lblBanHang.setFont(new Font("Segoe UI", 1, 18));
        lblDatHang.setFont(new Font("Segoe UI", 1, 18));
        tabXemThongTin.setTabComponentAt(0, lblBanHang);
        tabXemThongTin.setTabComponentAt(1, lblDatHang);
    }// </editor-fold>//GEN-END:initComponents

    private void tabLuaChonThongKeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabLuaChonThongKeStateChanged
        switch (tabLuaChonThongKe.getSelectedIndex()) {
            case 0:
                locDuLieu(dchChonNgay.getDate(), null, dsHoaDon, dsChiTietHoaDon);
                break;
            case 1:
                locDuLieu(monthTheoThang.getMonth(), yearTheoThang.getYear(), dsHoaDon, dsChiTietHoaDon);
                break;
            case 2:
                locDuLieu(0, yearTheoNam.getYear(), dsHoaDon, dsChiTietHoaDon);
                break;
            case 3:
                locDuLieu(dchTuNgay.getDate(), dchDenNgay.getDate(), dsHoaDon, dsChiTietHoaDon);
                break;
            case 4:
                locDuLieu(null, null, dsHoaDon, dsChiTietHoaDon);
                break;
        }
    }//GEN-LAST:event_tabLuaChonThongKeStateChanged

    private void dchChonNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchChonNgayPropertyChange
        locDuLieu(dchChonNgay.getDate(), null, dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_dchChonNgayPropertyChange

    private void monthTheoThangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_monthTheoThangPropertyChange
        locDuLieu(monthTheoThang.getMonth(), yearTheoThang.getYear(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_monthTheoThangPropertyChange

    private void yearTheoThangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearTheoThangPropertyChange
        locDuLieu(monthTheoThang.getMonth(), yearTheoThang.getYear(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_yearTheoThangPropertyChange

    private void yearTheoNamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearTheoNamPropertyChange
        locDuLieu(0, yearTheoNam.getYear(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_yearTheoNamPropertyChange

    // <editor-fold defaultstate="collapsed" desc="Xử lý đồng bộ thống kê theo khoảng thời gian">                          
    private void dchTuNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchTuNgayPropertyChange
        dongBoKhoangThoiGian();
        locDuLieu(dchTuNgay.getDate(), dchDenNgay.getDate(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_dchTuNgayPropertyChange

    private void dchDenNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchDenNgayPropertyChange
        dongBoKhoangThoiGian();
        locDuLieu(dchTuNgay.getDate(), dchDenNgay.getDate(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_dchDenNgayPropertyChange

    private void dongBoKhoangThoiGian() {
        dchTuNgay.setMaxSelectableDate(dchDenNgay.getDate());
        dchDenNgay.setMinSelectableDate(dchTuNgay.getDate());
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Xử lý popup chi tiết hoá đơn">                          
    private void tblTopQuanAoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTopQuanAoMouseClicked
        if (evt.getClickCount() == 2) {
            if (tblTopQuanAo.getSelectedRow() != -1)
                callFrameChiTietHoaDon(tblTopQuanAo.getValueAt(tblTopQuanAo.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tblTopQuanAoMouseClicked

    private void callFrameChiTietHoaDon(String maHD) {
        HoaDon hoaDon = null;

        for (HoaDon hd : dsHoaDon) {
            if (hd.getMaHoaDon().equals(maHD)) {

                KhachHang kh = hd.getKhachHang() != null ? hd.getKhachHang() : new KhachHang(null, "Khách vãng lai", null) ;
                NhanVien nv = hd.getNhanVien();
                KhuyenMai km = hd.getKhuyenMai() != null ? hd.getKhuyenMai() : new KhuyenMai(null, "", 0, null, null, 0);

                hoaDon = new HoaDon(maHD, hd.getNgayTao(), kh, nv, km);
            }
        }

        if (hoaDon != null) {
            FrameChiTietHoaDon frCTHD = new FrameChiTietHoaDon(hoaDon, new PanelHoaDon());
            frCTHD.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frCTHD.setResizable(false);
            frCTHD.setVisible(true);
        }
    }
    // </editor-fold>

    /**
     * Lọc dữ liệu theo ngày được chọn hoặc theo khoảng thời gian được chọn, dữ
     * lệu đúng được giữ lại. Nếu cả 2 ngày đều null thì lọc dữ liệu theo toàn
     * bộ thời gian
     *
     * @param date1 Ngày được chọn, hoặc ngày bắt đầu khoảng thời gian được chọn
     * @param date2 Ngày kết thúc khoảng thời gian được chọn, hoặc null nếu chỉ
     * lọc dữ liệu theo một ngày được chọn
     * @param dsHoaDonInput Dữ liệu về hoá đơn
     * @param dsChiTietHoaDonInput Dữ liệu về chi tiết hoá đơn
     */
    private void locDuLieu(@Nullable Date date1, @Nullable Date date2, @NotNull ArrayList<HoaDon> dsHoaDonInput, @NotNull ArrayList<ChiTietHoaDon> dsChiTietHoaDonInput) {
        ArrayList<HoaDon> dsHoaDonOutput = new ArrayList<>(dsHoaDonInput);
        ArrayList<ChiTietHoaDon> dsChiTietHoaDonOutput = new ArrayList<>(dsChiTietHoaDonInput);
        ArrayList<String> dsMaHoaDon = new ArrayList<>();
        if (date2 == null) {
            if (date1 == null) {
                sapXepDuLieu(dsHoaDonOutput, dsChiTietHoaDonOutput);
                return;
            }
            LocalDate localDate1 = new java.sql.Date(date1.getTime()).toLocalDate();
            for (int i = 0; i < dsHoaDonOutput.size(); i++) {
                LocalDate localDate = dsHoaDonOutput.get(i).getNgayTao().toLocalDate();
                if (!localDate.isEqual(localDate1)) {
                    dsHoaDonOutput.remove(i);
                    i--;
                    continue;
                }
                dsMaHoaDon.add(dsHoaDonOutput.get(i).getMaHoaDon());
            }
            for (int i = 0; i < dsChiTietHoaDonOutput.size(); i++) {
                if (!dsMaHoaDon.contains(dsChiTietHoaDonOutput.get(i).getHoaDon().getMaHoaDon())) {
                    dsChiTietHoaDonOutput.remove(i);
                    i--;
                }
            }
        } else {
            LocalDate localDate1 = new java.sql.Date(date1.getTime()).toLocalDate();
            LocalDate localDate2 = new java.sql.Date(date2.getTime()).toLocalDate();
            for (int i = 0; i < dsHoaDonOutput.size(); i++) {
                LocalDate localDate = dsHoaDonOutput.get(i).getNgayTao().toLocalDate();
                if (localDate.isBefore(localDate1) || localDate.isAfter(localDate2)) {
                    dsHoaDonOutput.remove(i);
                    i--;
                    continue;
                }
                dsMaHoaDon.add(dsHoaDonOutput.get(i).getMaHoaDon());
            }
            for (int i = 0; i < dsChiTietHoaDonOutput.size(); i++) {
                if (!dsMaHoaDon.contains(dsChiTietHoaDonOutput.get(i).getHoaDon().getMaHoaDon())) {
                    dsChiTietHoaDonOutput.remove(i);
                    i--;
                }
            }
        }

        sapXepDuLieu(dsHoaDonOutput, dsChiTietHoaDonOutput);
    }

    /**
     * Lọc dữ liệu theo tháng, năm được chọn hoặc theo năm được chọn, dữ lệu
     * đúng được giữ lại
     *
     * @param month Tháng được chọn, có thể = 0 nếu chỉ cần lọc theo năm
     * @param year Năm được chọn
     * @param dsHoaDonInput Dữ liệu về hoá đơn
     * @param dsChiTietHoaDonInput Dữ liệu về chi tiết hoá đơn
     */
    private void locDuLieu(int month, int year, ArrayList<HoaDon> dsHoaDonInput, ArrayList<ChiTietHoaDon> dsChiTietHoaDonInput) {
        ArrayList<HoaDon> dsHoaDonOutput = new ArrayList<>(dsHoaDonInput);
        ArrayList<ChiTietHoaDon> dsChiTietHoaDonOutput = new ArrayList<>(dsChiTietHoaDonInput);
        ArrayList<String> dsMaHoaDon = new ArrayList<>();
        if (month == 0) {
            for (int i = 0; i < dsHoaDonOutput.size(); i++) {
                LocalDate localDate = dsHoaDonOutput.get(i).getNgayTao().toLocalDate();
                if (localDate.getYear() != year) {
                    dsHoaDonOutput.remove(i);
                    i--;
                    continue;
                }
                dsMaHoaDon.add(dsHoaDonOutput.get(i).getMaHoaDon());
            }
            for (int i = 0; i < dsChiTietHoaDonOutput.size(); i++) {
                if (!dsMaHoaDon.contains(dsChiTietHoaDonOutput.get(i).getHoaDon().getMaHoaDon())) {
                    dsChiTietHoaDonOutput.remove(i);
                    i--;
                }
            }
        } else {
            for (int i = 0; i < dsHoaDonOutput.size(); i++) {
                LocalDate localDate = dsHoaDonOutput.get(i).getNgayTao().toLocalDate();
                if (localDate.getYear() != year || localDate.getMonthValue() != month + 1) {
                    dsHoaDonOutput.remove(i);
                    i--;
                    continue;
                }
                dsMaHoaDon.add(dsHoaDonOutput.get(i).getMaHoaDon());
            }
            for (int i = 0; i < dsChiTietHoaDonOutput.size(); i++) {
                if (!dsMaHoaDon.contains(dsChiTietHoaDonOutput.get(i).getHoaDon().getMaHoaDon())) {
                    dsChiTietHoaDonOutput.remove(i);
                    i--;
                }
            }
        }

        sapXepDuLieu(dsHoaDonOutput, dsChiTietHoaDonOutput);
    }

    /**
     * Sắp xếp dữ liệu theo doanh thu và lợi nhuận giảm dần
     *
     * @param dsHoaDon Dữ liệu về hoá đơn
     * @param dsChiTietHoaDon Dữ liệu về chi tiết hoá đơn
     */
    private void sapXepDuLieu(ArrayList<HoaDon> dsHoaDon, ArrayList<ChiTietHoaDon> dsChiTietHoaDon) {
        ArrayList<Object[]> rowsDoanhThu = new ArrayList<>();
        ArrayList<Object[]> rowsLoiNhuan = new ArrayList<>();

        for (HoaDon hoaDon : dsHoaDon) {
            double doanhThu = 0.0f;
            double loiNhuan = 0.0f;
            for (ChiTietHoaDon cthd : dsChiTietHoaDon) {
                if (hoaDon.getMaHoaDon().equals(cthd.getHoaDon().getMaHoaDon())) {
                    doanhThu += cthd.getSoLuong() * cthd.getGiaBan();
                    loiNhuan += (cthd.getSoLuong() * cthd.getGiaBan()) - cthd.getQuanAo().getGiaNhap();
                }
            }
            Object[] rowDoanhThu = {hoaDon.getMaHoaDon(), hoaDon.getNgayTao(), hoaDon.getKhachHang() != null ? hoaDon.getKhachHang().getTenKH() : "Khách vãng lai", doanhThu};
            rowsDoanhThu.add(rowDoanhThu);

            Object[] rowLoiNhuan = {hoaDon.getMaHoaDon(), hoaDon.getNgayTao(), hoaDon.getKhachHang() != null ? hoaDon.getKhachHang().getTenKH() : "Khách vãng lai", loiNhuan};
            rowsLoiNhuan.add(rowLoiNhuan);
        }

        // sắp xếp giảm dần theo doanh thu
        sortGiamDan(rowsDoanhThu);

        // sắp xếp giảm dần theo lợi nhuận
        sortGiamDan(rowsLoiNhuan);

        tinhToanDuLieu(dsHoaDon, dsChiTietHoaDon);
        loadDuLieuLenTable(rowsDoanhThu, rowsLoiNhuan);
    }

    /**
     * Sắp xếp giảm dần theo doanh thu hoặc lợi nhuận
     *
     * @param rows Dữ liệu cần sắp xếp
     */
    private void sortGiamDan(ArrayList<Object[]> rows) {
        rows.sort((Object[] o1, Object[] o2) -> {
            double data1 = (double) o1[3];
            double data2 = (double) o2[3];
            return Double.compare(data2, data1);
        });
    }

    /**
     * Tính toán tổng quan dữ liệu
     *
     * @param dsHoaDon Dữ liệu về hoá đơn
     * @param dsChiTietHoaDon Dữ liệu về chi tiết hoá đơn
     */
    private void tinhToanDuLieu(ArrayList<HoaDon> dsHoaDon, ArrayList<ChiTietHoaDon> dsChiTietHoaDon) {
        int tongHD = 0;
        int tongQA = 0;
        double doanhThu = 0.0f;
        double loiNhuan = 0.0f;

        tongHD = dsHoaDon.size();

        for (ChiTietHoaDon cthd : dsChiTietHoaDon) {
            tongQA += cthd.getSoLuong();
            doanhThu += cthd.getSoLuong() * cthd.getGiaBan();
            loiNhuan += (cthd.getSoLuong() * cthd.getGiaBan()) - cthd.getQuanAo().getGiaNhap();
        }
        loadTongQuanDoanhThu(tongHD, tongQA, doanhThu, loiNhuan);
    }

    /**
     * Load dữ liệu lên bảng chi tiết
     *
     * @param rowDoanhThu Dữ liệu về doanh thu
     * @param rowLoiNhuan Dữ liệu về lợi nhuận
     */
    private void loadDuLieuLenTable(ArrayList<Object[]> rowDoanhThu, ArrayList<Object[]> rowLoiNhuan) {
        DefaultTableModel modelDoanhThu = (DefaultTableModel) tblTopQuanAo.getModel();

        modelDoanhThu.setRowCount(0);

        for (Object[] data : rowDoanhThu) {
            Object[] row = {data[0], DateStandard.formatDate((Date) data[1]), data[2], NumberStandard.formatMoney((double) data[3])};
            modelDoanhThu.addRow(row);
        }
        for (Object[] data : rowLoiNhuan) {
            Object[] row = {data[0], DateStandard.formatDate((Date) data[1]), data[2], NumberStandard.formatMoney((double) data[3])};
        }
    }

    /**
     * Load tổng quan dữ liệu
     *
     * @param tongHD Tổng số hoá đơn
     * @param tongQA Tổng số quần áo
     * @param doanhThu Tổng doanh thu
     * @param loiNhuan Tổng lợi nhuận
     */
    private void loadTongQuanDoanhThu(int tongHD, int tongQA, double doanhThu, double loiNhuan) {

        this.txtTongHD.setText(NumberStandard.formatInteger(tongHD));
        this.txtTongQA.setText(NumberStandard.formatInteger(tongQA));
        this.txtDoanhThu.setText(NumberStandard.formatMoney(doanhThu));
        this.txtLoiNhuan.setText(NumberStandard.formatMoney(loiNhuan));

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dchChonNgay;
    private com.toedter.calendar.JDateChooser dchDenNgay;
    private com.toedter.calendar.JDateChooser dchTuNgay;
    private javax.swing.JLabel lblChonNam;
    private javax.swing.JLabel lblChonNgay;
    private javax.swing.JLabel lblChonThangVaNam;
    private javax.swing.JLabel lblDenNgay;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblLoiNhuan;
    private javax.swing.JLabel lblTKQuanAoHet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblToanBo;
    private javax.swing.JLabel lblTongHD;
    private javax.swing.JLabel lblTongQA;
    private javax.swing.JLabel lblTuNgay;
    private com.toedter.calendar.JMonthChooser monthTheoThang;
    private javax.swing.JPanel pnlBangChiTiet;
    private javax.swing.JPanel pnlBieuDo;
    private javax.swing.JPanel pnlTkQuanAoHet;
    private javax.swing.JPanel pnlTkTheoKhoangThoiGian;
    private javax.swing.JPanel pnlTkTheoNam;
    private javax.swing.JPanel pnlTkTheoNgay;
    private javax.swing.JPanel pnlTkTheoThang;
    private javax.swing.JPanel pnlTkToanBo;
    private javax.swing.JPanel pnlTongQuan;
    private javax.swing.JPanel pnlTongQuanQuanAo;
    private javax.swing.JScrollPane scrTopQuanAo;
    private javax.swing.JTabbedPane tabLuaChonThongKe;
    private javax.swing.JTabbedPane tabXemThongTin;
    private javax.swing.JTable tblTopQuanAo;
    private javax.swing.JTextField txtDoanhThu;
    private javax.swing.JTextField txtLoiNhuan;
    private javax.swing.JTextField txtTongHD;
    private javax.swing.JTextField txtTongQA;
    private com.toedter.calendar.JYearChooser yearTheoNam;
    private com.toedter.calendar.JYearChooser yearTheoThang;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
