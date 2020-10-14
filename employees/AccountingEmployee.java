package employees;

public class AccountingEmployee extends employee {
    int numberOfClients;

    public AccountingEmployee (int salary, int age, int numberOfClients) {
        this.name = "accounting employee";
        this.salary = salary;
        this.age = age;
        this.numberOfClients = numberOfClients;
    }

    public void information() {
        System.out.println("This is a " + name + ". They earn " + salary + "currency a year and are " + age + "years old. Their number of clients is " + numberOfClients + ".");
    }
}
