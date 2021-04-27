public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private long basicSalary, calculatorSalary;

    public Employee(String id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public long getCalculatorSalary() {
        return calculatorSalary;
    }

    public void setCalculatorSalary(long calculatorSalary) {
        this.calculatorSalary = calculatorSalary;
    }

    public Employee(long calculatorSalary) {
        this.calculatorSalary = calculatorSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract long calculatorSalary();

    public Employee() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " - " + name + " - " + age + " - " + basicSalary;
    }

}
