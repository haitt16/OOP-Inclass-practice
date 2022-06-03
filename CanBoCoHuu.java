// import NhanVien;

class CanBoCoHuu extends NhanVien{
    //  Attributes 
    private static double luongCoBan;
    private double heSoLuong;
    private static final double LUONG_MAX = 2e8;

    // Constructor
    public CanBoCoHuu(String tenNhanVien, double luongCoBan, double heSoLuong){
        // setCanBoCoHuu(tenNhanVien, luongCoBan, heSoLuong);
        setName(tenNhanVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    // Setter
    public void setLuongCoBan(double basePay){ luongCoBan = basePay; }
    public void setHeSoLuong(double coef){ heSoLuong = coef; }
    public void setCanBoCoHuu(String name, double basePay, double coef){
        setName(name);
        setLuongCoBan(basePay);
        setHeSoLuong(coef);
    }

    // Getter
    public double getLuongCoBan(){ return luongCoBan;}
    public double getHeSoLuong(){ return heSoLuong; }

    // Methods
    public double tinhLuong(){
        return luongCoBan * heSoLuong;
    }
    public void tangHeSoLuong(double heSoTang){
        double luongNew = luongCoBan * (heSoLuong + heSoTang);
        if (!(luongNew > LUONG_MAX)){ 
            heSoLuong += heSoTang;
        }
    }
    public void inThongTin(){
        System.out.println("Tên Nhân Viên: " + getName());
        System.out.println("Lương nhân viên: " + tinhLuong());
    }
}
