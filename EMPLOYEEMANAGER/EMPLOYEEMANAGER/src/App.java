import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Number: ");
        int soNhanVien = sc.nextInt();
        Nhanvien[] nhanVien = new Nhanvien[soNhanVien];

        System.out.println("Employee Information: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Information of employee " + (i + 1) + ":");
            System.out.print("Select employee type (1 - Developer, 2 - Tester ): ");
            int choose = sc.nextInt();

            if (choose == 1) {
                nhanVien[i] = new Laptrinhvien();
            } else if (choose == 2) {
                nhanVien[i] = new Kiemchungvien();
            }

            nhanVien[i].input();
            nhanVien[i].salaryCalculator();
        }
        System.out.println("Information of employees in the company: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].display());
        }
    }
}
