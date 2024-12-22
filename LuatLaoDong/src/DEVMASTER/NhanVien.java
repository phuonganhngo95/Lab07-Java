package DEVMASTER;

import luatdoanhnghiep.khoinhanuoc.tienluong.TienLuong;

public class NhanVien {
    public static void main(String[] args) {
        int tham_nien_cong_tac = 8;
        double luong = TienLuong.luongCoBan(TienLuong.BAC_CAO_DANG, tham_nien_cong_tac);
        System.out.println("Lương của nhân viên: " + luong);
        System.out.println("Phí bảo hiểm: " + TienLuong.soTienBaoHiem(luong));
    }
}
