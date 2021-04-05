import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        Employee[] employee = new Employee[n];
        for(int i = 0; i < employee.length; i++){
            
            
            System.out.println("Nhap thong tin: ");
            employee[i] = new Employee();
            employee[i].input();
        }
        System.out.println("Thong tin sau khi nhap la: ");
        for(int i = 0; i < employee.length; i++){
            employee[i].display();
        }
    }
}
