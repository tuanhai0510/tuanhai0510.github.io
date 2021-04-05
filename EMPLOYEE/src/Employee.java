import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private int dateOfBirth;
    private String address;
    private String position;
    private long basicSalary;

    Scanner sc = new Scanner(System.in);

    public Employee(){

    }
    public void input(){
        System.out.println("Nhap id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        dateOfBirth = sc.nextInt();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        position = sc.nextLine();
        System.out.println("Nhap muc luong co ban: ");
        basicSalary = sc.nextLong();
    }
    public Employee(int id, String name, int dateOfBirth, String address, String position, long basicSalary) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.position = position;
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
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public long getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void display(){
        System.out.println(getId() + " - " + getName() +" - " + getDateOfBirth() +" - " + getAddress() +" - " + getPosition() +" - " + getBasicSalary());
    }
    
}
    
   

    

