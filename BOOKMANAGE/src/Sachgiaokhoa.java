import java.util.Scanner;

public class Sachgiaokhoa extends Sach implements IMuon{

   private int soTrang, tongSoluong, soLuongMuon;
   private String tinhTrang;

   Scanner sc = new Scanner(System.in);

   public Sachgiaokhoa(){}

public Sachgiaokhoa(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soTrang, int tongSoluong,
        int soLuongMuon, String tinhTrang) {
    super(maSach, tenSach, nhaXuatBan, namXuatBan);
    this.soTrang = soTrang;
    this.tongSoluong = tongSoluong;
    this.soLuongMuon = soLuongMuon;
    this.tinhTrang = tinhTrang;
}

public int getSoTrang() {
    return soTrang;
}

public void setSoTrang(int soTrang) {
    this.soTrang = soTrang;
}

public int getTongSoluong() {
    return tongSoluong;
}

public void setTongSoluong(int tongSoluong) {
    this.tongSoluong = tongSoluong;
}

public int getSoLuongMuon() {
    return soLuongMuon;
}

public void setSoLuongMuon(int soLuongMuon) {
    this.soLuongMuon = soLuongMuon;
}

public String getTinhTrang() {
    return tinhTrang;
}

public void setTinhTrang(String tinhTrang) {
    this.tinhTrang = tinhTrang;
}

@Override
public String tonKho() {
    // TODO Auto-generated method stub
    return null;
}


    
    
}
