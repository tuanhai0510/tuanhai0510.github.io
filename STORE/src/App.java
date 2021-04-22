import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("So luong san pham can nhap: ");
            n = Integer.parseInt(sc.nextLine());
            while (n <= 0 || n >= 100) {
                System.out.println("So luong nhap ko cho phep ");
                System.out.print("Nhap lai so luong: ");
                n = Integer.parseInt(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("So luong ko hop le !!! ");

        }
        ArrayList<Store> product = new ArrayList<Store>(n);
        for (int i = 0; i < n; i++){
            Store pr = new Store();
            pr.input();
            product.add(i, pr);
        }
        for (Store insp : product) {
            System.out.println(insp);
        }
       
        boolean check = true;
        while (check) {
            Store sp2 = new Store();
            System.out.println("Nhap lua chon:");
            System.out.println("1- Them san pham; 2 - Sua san pham; 3 - Xoa san pham; 4 - Thoat chinh sua");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
            case 1:
                sp2.input();
                product.add(sp2);
                break;

            case 2:
                System.out.println("Nhap san pham can sua:");
                int change = Integer.parseInt(sc.nextLine());
                sp2.input();
                product.set(change, sp2);
                break;

            case 3:
                System.out.println(("Nhap san pham muon xoa:"));
                int delete = Integer.parseInt(sc.nextLine());
                product.remove(delete);
                break;

            case 4:
                check = false;
                break;

            default:
                break;
            }
        }
        
        System.out.println("Danh sach san pham sau khi sua: ");
        for (Store insp : product) {
            System.out.println(insp);
        }

        for (int i = 0; i < n; i++) {
            if (product.get(i).getSoLuongTon() < 5) {
                System.out.println("Nhap them san pham thu "+i);
            }
        }
        
    }
}
