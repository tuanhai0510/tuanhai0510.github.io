import java.util.Scanner;

public class Nhanvien {
    private int id;
    private String name;
    private int age;
    private long phoneNumber;
    private String email;
    private long basicSalary;
    Scanner sc = new Scanner(System.in);

    public Nhanvien() {
    }

    public long salaryCalculator() {
        return 0;
    }

    public Nhanvien(int id, String name, int age, long phoneNumber, String email, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void input() {
        System.out.println("Id: ");
        setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Name: ");
        setName(sc.nextLine());
        System.out.println("Age");
        setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Phone Number: ");
        setPhoneNumber(sc.nextLong());
        sc.nextLine();

        System.out.println("Email: ");
        setEmail(sc.nextLine());
        
        System.out.println("Basic Salary: ");
        setBasicSalary(Integer.parseInt(sc.nextLine()));
    }

    public String display() {
        return "\n ID: " + getId() + "\t Name: " + getName() + "\t Age: " + getAge() + "\tPhone Number: "
                + getPhoneNumber() + "\t Email: " + getEmail() + "\t Basic Salary: " + getBasicSalary();

    }

}
