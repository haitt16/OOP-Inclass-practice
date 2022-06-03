abstract class NhanVien{
    private String tenNhanVien;
    public double loiNhuanReport;
    public void setName(String name){ tenNhanVien = name; }
    public String getName(){ return tenNhanVien;}
    public void readLoiNhuan(double loiNhuan){ loiNhuanReport = loiNhuan; }
    public abstract double tinhLuong();
    public abstract void inThongTin();
}


