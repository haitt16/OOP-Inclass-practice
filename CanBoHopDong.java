// import NhanVien;

class CanBoHopDong extends NhanVien{
    // Attributes
    private double luongHopDong;
    public CanBoHopDong(String tenNhanVien, double luongHopDong){
        setName(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }

    // Getter
    public double getluongHopDong(){ return luongHopDong; }
    public double tinhLuong(){
        return luongHopDong;
    } 
    public void inThongTin(){
        System.out.println("Tên Nhân Viên: " + getName());
        System.out.println("Lương Nhân Viên: " + tinhLuong());
    }
}