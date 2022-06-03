// import CanBoCoHuu;
// import QuanLy;

class CanBoQuanLy extends CanBoCoHuu implements QuanLy{

    // Constructor
    public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong){
        super(tenNhanVien, luongCoBan, heSoLuong);
    }

    // Interface implement
    public double tinhHoaHong(){
        return 0.002*loiNhuanReport;
    }

    //  Methods
    public double tinhLuong(){
        return getLuongCoBan()*getHeSoLuong() + tinhHoaHong();
    }
    public void inThongTin(){
        System.out.println("Tên Cán Bộ Quản Lý: "+ getName());
        System.out.println("Lương: " + tinhLuong() + " VND");
        System.out.println("Hoa hồng: " + tinhHoaHong() + " VND");
    }
}