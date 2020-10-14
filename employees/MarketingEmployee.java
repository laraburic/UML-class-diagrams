package employees;

public class MarketingEmployee extends employee {
    int numberOfProjects;

    public MarketingEmployee (int salary, int age, int numberOfProjects) {
        this.name = "marketing employee";
        this.salary = salary;
        this.age = age;
        this.numberOfProjects = numberOfProjects;
    }

    public void information() {
        System.out.println("This is a " + name + ". They earn " + salary + "currency a year and are " + age + "years old. Their number projects is " + numberOfProjects + ".");
    }
}

