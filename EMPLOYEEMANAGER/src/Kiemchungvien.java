import java.util.Scanner;

public class Kiemchungvien extends Nhanvien {
    private int errorNumber;
    Scanner sc = new Scanner(System.in);

    public Kiemchungvien() {
    }

    public Kiemchungvien(int id, String name, int age, long phoneNumber, String email, long basicSalary,
            int errorNumber) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.errorNumber = errorNumber;
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(int errorNumber) {
        this.errorNumber = errorNumber;
    }

    public long salaryCalculator() {
        return this.getBasicSalary() + errorNumber * 50000;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Error Number: ");
        setErrorNumber(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String display() {
        // TODO Auto-generated method stub
        return super.display() + "\t Error Number: " + getErrorNumber() + "\t Salary: " + salaryCalculator();
    }
}
