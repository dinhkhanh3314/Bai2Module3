package iuh.fit;

import java.time.LocalDate;

/**
 * @description:
 * @author: Khanh, Dinh Huynh Quoc
 * @version: 1.0
 * @created: 9/4/2024 7:35 AM
 */

public class SachGiaoKhoa extends Sach {
    private  TinhTrang tinhTrang;

    public SachGiaoKhoa(){
        super();
        this.tinhTrang = TinhTrang.MOI;
    }
    public SachGiaoKhoa(String maSach, String tenSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, TinhTrang tinhTrang) {
        super(maSach, tenSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public TinhTrang getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(TinhTrang tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    @Override
    public double getThanhTien(){
        return  this.tinhTrang == TinhTrang.MOI
                ? this.soLuong * this.donGia
                : this.soLuong * this.donGia * 0.5;
    }
}
