package BaiThucHanh;

public class NhanVien {
    String name;
    static int cnt;
}

class NhanVienMainClass {
    public static void main(String[] args) {
        NhanVien[] arrNV = new NhanVien[3];
        arrNV[0] = new NhanVien();
        arrNV[0].name = "Ngọc Trinh";
        arrNV[0].cnt++;

        arrNV[1] = new NhanVien();
        arrNV[1].name = "Bá Tùng";
        arrNV[1].cnt++;

        arrNV[2] = new NhanVien();
        arrNV[2].name = "Kiều Max";
        arrNV[2].cnt++;

        for (int i = 0; i < arrNV.length; i++) {
            NhanVien nv = arrNV[i];
            System.out.println(nv.name + " cnt = " + nv.cnt);
        }
    }
}
