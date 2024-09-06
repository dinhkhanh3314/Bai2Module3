package iuh.fit;

import java.time.LocalDate;

/**
 * @description:
 * @author: Khanh, Dinh Huynh Quoc
 * @version: 1.0
 * @created: 9/4/2024 7:28 AM
 */

public abstract class Sach {
    //Attributes
    protected String maSach;
    protected String tenSach;
    protected LocalDate ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    //Constructors
    public Sach() {
        this("","",LocalDate.now(),0,0,"");
    }

    public Sach(String maSach, String tenSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public abstract  double getThanhTien();

    //Getters and Setters
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-40s %-15s %10.2f %10d %10.2f  %-20s ", maSach, tenSach, ngayNhap, donGia, soLuong, getThanhTien(),nhaXuatBan);
    }
}
