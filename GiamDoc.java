// import CanBoCoHuu;
// import QuanLy;

class GiamDoc extends CanBoCoHuu implements QuanLy{
    private double phuCap;
    
    // Constructor
    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap){
        super(tenNhanVien, luongCoBan, heSoLuong);
        // setGiamDoc(tenNhanVien, luongCoBan, heSoLuong, phuCap);
        this.phuCap = phuCap;
    }

    // Setter
    public void setPhuCap(double pc){
        phuCap = pc;
    }
    public void setGiamDoc(String name, double basePay, double coef, double pc){
        setCanBoCoHuu(name, basePay, coef);
        setPhuCap(pc);
    }

    // Getter
    public double getPhuCap(){ return phuCap; }

    // Interface implement
    public double tinhHoaHong(){
        return 0.05*loiNhuanReport;
    }
    // Methods
    public double tinhLuong(){
        return getLuongCoBan()*getHeSoLuong() + phuCap + tinhHoaHong();
    }
    public void inThongTin(){
        System.out.println("Tên Giám Đốc: "+ getName());
        System.out.println("Lương: " + tinhLuong() + " VND");
        System.out.println("Phụ Cấp: " + phuCap + " VND");
        System.out.println("Hoa hồng: " + tinhHoaHong() + " VND");
    }
} 