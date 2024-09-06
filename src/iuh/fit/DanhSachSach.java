package iuh.fit;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author: Khanh, Dinh Huynh Quoc
 * @version: 1.0
 * @created: 9/4/2024 7:48 AM
 */

public class DanhSachSach {
    private Sach[] dsSach;
    private int count = 0;

    public DanhSachSach(){
        dsSach = new Sach[10];
    }
    public DanhSachSach(int n){
        if(n<=0)
            throw new IllegalArgumentException("n > 0");
        this.dsSach = new Sach[n];
    }
    public Sach[] getDsSach() {
        return dsSach;
    }

    public  void themSach(Sach sach){
        if(sach == null)
            throw new IllegalArgumentException("Sach khong duoc null");
        for(int i=0; i<count;i++){
            Sach s = dsSach[i];
            if(s.getMaSach().equalsIgnoreCase(sach.getMaSach()))
                throw new IllegalArgumentException("Trung ma sach");
        }
        if(count == dsSach.length){
            int newLength = (int)(dsSach.length * 1.5);
            dsSach = Arrays.copyOf(dsSach, newLength);
        }
        dsSach[count++] = sach;
    }
    public double getTongTienSachGK(){
        double tongTien = 0.0;
        for(Sach s: dsSach){
            if(s != null && s instanceof SachGiaoKhoa)
                tongTien += s.getThanhTien();
        }
        return tongTien;
    }

    public double getTongTienSachTK(){
        double tongTien =0;
        for(Sach s: dsSach){
            if(s != null && s instanceof SachThamKhao)
                tongTien += s.getThanhTien();
        }
        return tongTien;
    }

    public Sach[] listDSSachGKTheoNXB(String nxb){
       int n =0;
        Sach[] result = new Sach[dsSach.length];
       for(int i=0; i<dsSach.length; i++) {
           if (dsSach[i] instanceof SachGiaoKhoa && dsSach[i].getNhaXuatBan().equalsIgnoreCase(nxb)) {
               result[n++] = dsSach[i];
           }
       }
        return result;
    }

    public double getThanhTienCaoNhat(){
        double max = 0;
        for(Sach s: dsSach)
            if(s!= null && s.getThanhTien() > max)
                max = s.getThanhTien();
        return max;
    }
}
