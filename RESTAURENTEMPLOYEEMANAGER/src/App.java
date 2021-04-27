import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Waiter("WT", "H", 23, 7000000, 500000));
        list.add(new Waiter("WT", "A", 22, 8000000, 350000));

        list.forEach(n -> System.out.println(n));

        System.out.println("");
        Collections.sort(list, (o1, o2) -> Waiter.compareName(o1, o2));

        System.out.println("DS sap xep waiter theo ten: ");
        list.forEach(n -> System.out.println(n));

        System.out.println("");
        Collections.sort(list, (o1, o2) -> Waiter.compareSalary(o1, o2));

        System.out.println("DS sap xep waiter theo luong: ");
        list.forEach(n -> System.out.println(n));
        System.out.println("");

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(new Kitchen("KC", "N", 26, 9000000, 500000));
        list1.add(new Kitchen("KC", "B", 19, 7000000, 350000));
        list1.forEach(n1 -> System.out.println(n1));

        System.out.println("");
        Collections.sort(list1, (o1, o2) -> Kitchen.compareName(o1, o2));

        System.out.println("DS sap xep kitchen theo ten: ");
        list1.forEach(n1 -> System.out.println(n1));

        System.out.println("");
        Collections.sort(list1, (o1, o2) -> Kitchen.compareSalary(o1, o2));

        System.out.println("DS sap xep waiter theo luong: ");
        list1.forEach(n1 -> System.out.println(n1));
        System.out.println("");


        


    }
}
