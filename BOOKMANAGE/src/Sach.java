import java.util.Scanner;

public class Sach {
    private String maSach, tenSach, nhaXuatBan;
    private int namXuatBan;

    Scanner sc = new Scanner(System.in);

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;

    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void input() {
        System.out.println("Ma sach: ");
        setMaSach(sc.nextLine());
        System.out.println("Ten sach: ");
        setTenSach(sc.nextLine());
        System.out.println("Nha xuat ban: ");
        setNhaXuatBan(sc.nextLine());
        System.out.println("Nam xuat ban: ");
        setNamXuatBan(sc.nextInt());
    }

    @Override
    public String toString() {
        return getMaSach() + " ; " + getTenSach() + " ; " + getNhaXuatBan() + " ; " + getNamXuatBan();
    }

}
