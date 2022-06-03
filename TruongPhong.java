// import CanBoCoHuu;

class TruongPhong extends CanBoCoHuu{
    private double phuCap;

    // Constructor
    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap){
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
    }
    // Setter
    public void setPhuCap(double pc){ phuCap = pc; }

    // Getter 
    public double getPhuCap(){ return phuCap; }

    // Methods
    public double tinhLuong(){
        return getLuongCoBan()*getHeSoLuong() + phuCap;
    }
    public void inThongTin(){
        System.out.println("Tên Cán Bộ Quản Lý: "+ getName());
        System.out.println("Lương: " + tinhLuong());
        System.out.println("Phụ Cấp: " + phuCap);
    }
}