class SoICT{
    private static void themNhanVien(NhanVien staff, NhanVien[] dsNV, int index, double loiNhuan){
        dsNV[index] = staff;
        staff.readLoiNhuan(loiNhuan);
    }
    public static void main(String[] args){
        CongTy soICT = new CongTy("SoICT", 1e12);
        CanBoQuanLy hieuPho1 = new CanBoCoHuu("Vu Anh Duc",
                                            5e7,
                                            2.5);
        GiamDoc giangVien1 = new GiamDoc("Tran Thanh Hai",
                                            3e7,
                                            2.5, 3e6);
        soICT.themNV(hieuPho1);
        soICT.themNV(giangVien1);
        soICT.inThongTin();
    }
}