package employees;

public class SalesEmployee extends employee {
    protected int numberOfSales;

    public SalesEmployee (int salary, int age, int numberOfSales) {
        this.name = "sales employee";
        this.salary = salary;
        this.age = age;
        this.numberOfSales = numberOfSales;
    }

    public void information() {
        System.out.println("This is a " + name + ". They earn " + salary + "currency a year and are " + age + "years old. Their number of sales is " + numberOfSales + ".");
    }
}
