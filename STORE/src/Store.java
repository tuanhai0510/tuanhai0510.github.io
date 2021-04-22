import java.util.Scanner;

public class Store {
    private int id, soLuongBan, soLuongTon;
    private String name, moTa;
    private long giaNhap, giaBan, loiNhuan;

    Scanner sc = new Scanner(System.in);

    public Store(int id, String name, String moTa, int soLuongBan, int soLuongTon, long giaNhap, long giaBan,
            long loiNhuan) {
        this.id = id;
        this.soLuongBan = soLuongBan;
        this.soLuongTon = soLuongTon;
        this.name = name;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.loiNhuan = loiNhuan;
    }

    public Store() {
    }

    public int getId() {
        return id;
    }

    public long getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(long loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public void input() {
        System.out.print("Nhap ma: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        name = sc.nextLine();
        
        System.out.print("Nhap gia nhap: ");
        giaNhap = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia ban: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap mo ta: ");
        moTa = sc.nextLine();
        System.out.print("Nhap so luong ban ra: ");
        soLuongBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong ton kho: ");
        soLuongTon = Integer.parseInt(sc.nextLine());
    }

    public long tinhLoiNhuan() {
        loiNhuan = (giaBan - giaNhap) * soLuongBan;
        return loiNhuan;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " - " + name + " - " + moTa + " - " + giaNhap + " - " + giaBan + " - " + soLuongBan + " - "
                + soLuongTon + " - " + tinhLoiNhuan();
    }
}
