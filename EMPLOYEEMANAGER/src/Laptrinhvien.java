import java.util.Scanner;

public class Laptrinhvien extends Nhanvien {
    private int overTime;
    Scanner sc = new Scanner(System.in);

    public Laptrinhvien() {
    }

    public Laptrinhvien(int id, String name, int age, long phoneNumber, String email, long basicSalary, int overTime) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.overTime = overTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public long salaryCalculator() {
        return this.getBasicSalary() + overTime * 200000;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Over Time: ");
        setOverTime(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String display() {
        // TODO Auto-generated method stub
        return super.display() + "\t Over Time: " + getOverTime() + "\t Salary: " + salaryCalculator();
    }

}
