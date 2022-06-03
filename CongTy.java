// import NhanVien;

class CongTy{
    private String tenCongTy;
    private int soNhanVien;
    public static final int SO_NV_MAX = 200; 
    public static double loiNhuan;
    private NhanVien[] dsNhanVien = new NhanVien[SO_NV_MAX];
    // Constructor 
    public CongTy(String tenCongTy, double loiNhuan){
        this.tenCongTy = tenCongTy;
        this.loiNhuan = loiNhuan;
    }

    // Setter
    public void setTenCongTy(String comName){ tenCongTy = comName; }
    public void setLoiNhuan(double profit){ loiNhuan = profit; }

    // Getter
    public String getTenCongTy(){ return tenCongTy; }
    public double getLoiNhuan(){ return loiNhuan; }

    // Methods
    void themNV(NhanVien staff){
        if(soNhanVien < SO_NV_MAX){
            soNhanVien = soNhanVien + 1;
            staff.readLoiNhuan(loiNhuan);
            dsNhanVien[soNhanVien - 1] = staff;
            System.out.println("Registration for new staff is successful!");
        }
        else{
            System.out.println("Cannot regist for new staff!");
        }
    }
    public void inThongTin(){
        System.out.println("======== " + tenCongTy + " =======");
        for(int i = 0; i < soNhanVien; i++){
            NhanVien staff = dsNhanVien[i];
            staff.inThongTin();
            System.out.println("===============================");
        }
    }
    public double tinhTongLuong(){
        double tongLuong = 0;
        for(int i = 0; i < soNhanVien; i++){
            NhanVien staff = dsNhanVien[i];
            tongLuong = tongLuong + staff.tinhLuong();
        }
        return tongLuong;
    }
}