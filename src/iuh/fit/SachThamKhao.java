package iuh.fit;

import java.time.LocalDate;

/**
 * @description:
 * @author: Khanh, Dinh Huynh Quoc
 * @version: 1.0
 * @created: 9/4/2024 7:45 AM
 */

public class SachThamKhao  extends Sach{
    private  double thue;

    public SachThamKhao() {
        super();
        this.thue = 0;
    }

    public SachThamKhao(String maSach, String tenSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, tenSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public double getThanhTien(){
        double tienThue  = soLuong * donGia * thue;
        return soLuong * donGia + tienThue;
    }
}
