public class Waiter extends Employee {
    private long compensate;

    public Waiter(String id, String name, int age, long basicSalary, long compensate ) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    @Override
    public long calculatorSalary() {
        // TODO Auto-generated method stub
        return this.getBasicSalary() + compensate;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + compensate + "\t Tong luong: " + calculatorSalary();
    }
    public static int compareName(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
    public static int compareSalary(Employee o1, Employee o2) {
        return (int) (o1.calculatorSalary() - o2.calculatorSalary());
    }



   

}
