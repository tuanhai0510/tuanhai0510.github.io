public class Kitchen extends Employee {

    private long serviceCharge;

    public Kitchen(String id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        // TODO Auto-generated method stub
        return this.getBasicSalary() + serviceCharge;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + serviceCharge + "\t Tong luong: " + calculatorSalary();

    }
    public static int compareName(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
    public static int compareSalary(Employee o1, Employee o2) {
        return (int) (o1.calculatorSalary() - o2.calculatorSalary());
    }

}
