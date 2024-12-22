package luatdoanhnghiep.khoinhanuoc.tienluong;

public class TienLuong {
    public static final float BAC_TRUNG_CAP = 1.55f;
    public static final float BAC_CAO_DANG = 1.80f;
    public static final float BAC_DAI_HOC = 2.34f;
    public static final double LUONG_CO_BAN = 2889000;
    public static final float HE_SO_BHXH = 16;
    public static final float HE_SO_THAM_NIEN = 5;

    public static double luongCoBan(float hocVi, int namCongTac) {
        double luongCoBan = (hocVi*LUONG_CO_BAN) + namCongTac*(5/100*LUONG_CO_BAN);
        return luongCoBan;
    }

    public static double soTienBaoHiem(double luong) {
        return (HE_SO_BHXH/100)*luong;
    }
}
