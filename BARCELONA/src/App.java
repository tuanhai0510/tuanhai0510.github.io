import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Player list: ");
        Team team = new Team();
        ArrayList<Player> player = new ArrayList<Player>();
        player = team.getAllPlayer();

        for (int i = 0; i < player.size(); i++) {
            System.out.println(player.get(i).getFullName() + " - " + player.get(i).getNumber() + " - "
                    + player.get(i).getPosition());
        }
        player = team.buildTeam();
        for (int i = 0; i < player.size(); i++) {
            System.out.println(player.get(i).getNumber() + " - " + player.get(i).getFullName() + " - "
                    + player.get(i).getPosition());
        }

        boolean check = true;
        while (check) {
            System.out.println("Do you want to see another option? Type Y or N");
            String option = sc.nextLine();
            if (option.toUpperCase().equals("Y")) {
                check = true;
            } else {
                check = false;
                System.exit(0);
            }
            System.out.println("Lua chon doi hinh: ");
            System.out.println(
                    "Nhap 1 de chon doi hinh 4-3-3 \nNhap 2 de chon doi hinh 4-4-2 \nNhap 3 de chon doi hinh 3-5-2 \n");
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
            case 1:
                team.buildTeam1(4, 3, 3);

                break;
            case 2:
                team.buildTeam1(4, 4, 2);
                break;
            case 3:
                team.buildTeam1(3, 5, 2);
                break;
            default:
                System.out.println("Khong co lua chon nay");
                break;
            }
        }
    }

}
