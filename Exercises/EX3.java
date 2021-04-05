import java.util.Scanner;

public class EX3 {
    public static void main(String[] args){
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu mang: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("");
        System.out.println("Phan tu lon nhat trong mang: " + max);
        System.out.println("Phan tu nho nhat trong mang: " +min);
        System.out.println("");
        System.out.println("Cac so nguyen to la: ");
        for(int i = 0; i<n; i++){
            if (check(arr[i]))
            System.out.print(arr[i]+ " ");
        }
        for(int i = 0; i<n; i++){
            if(check(arr[i]))
            sum += arr[i];
        }
        System.out.println("Tong so nguyen to la: " + sum);
        
        System.out.println("k: ");
        int k = sc.nextInt();
    }
    public static boolean check(int n){
        if(n <= 1){
            return false;
        }else {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if( n%i == 0)
                return false;
            }
        }
        return true;
    }
}
