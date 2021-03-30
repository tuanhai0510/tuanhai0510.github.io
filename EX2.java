import java.util.Scanner;
import static java.lang.Math.sqrt;

public class EX2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        float x1, x2, delta;
        a = sc.nextInt();
        System.out.println("a = " + a);
        b = sc.nextInt();
        System.out.println("b = " + b);
        c = sc.nextInt();
        System.out.println("c = " + c);
        delta = (b*b - (4*a*c));
        if(delta<0) {
            System.out.println("PT vo nghiem");
        }else if(delta==0) {
            x1=x2= (-b/(2*a));
            System.out.println("PT co nghiem x1 = x2= " + x1);
        }
        else {
            x1= (float) ((-b + sqrt(delta))/(2*a));
            x2= (float) ((-b - sqrt(delta))/(2*a));
            System.out.println("PT co 2 nghiem: x1 = " + x1 + "x2 = " + x2);
        }
    }
}


