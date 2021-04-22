public class Product {
    private String ten, moTa, hang, danhMuc;
    private float giaNhap, giaBan;
    private int maSp, soLuongTon, soLuongBan;
    public Product(){}
    public Product(String ten, String moTa, String hang, String danhMuc, float giaNhap, float giaBan, int maSp,
            int soLuongTon, int soLuongBan) {
        this.ten = ten;
        this.moTa = moTa;
        this.hang = hang;
        this.danhMuc = danhMuc;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.maSp = maSp;
        this.soLuongTon = soLuongTon;
        this.soLuongBan = soLuongBan;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public String getHang() {
        return hang;
    }
    public void setHang(String hang) {
        this.hang = hang;
    }
    public String getDanhMuc() {
        return danhMuc;
    }
    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
    public float getGiaNhap() {
        return giaNhap;
    }
    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }
    public float getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    public int getMaSp() {
        return maSp;
    }
    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }
    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    public int getSoLuongBan() {
        return soLuongBan;
    }
    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }
     @Override
     public String toString() {
         // TODO Auto-generated method stub
         return maSp +" "+ten+" "+moTa+" "+ giaNhap+" "+giaBan+" "+soLuongTon+" "+ soLuongBan+" "+hang+" "+ danhMuc;
     }
}
