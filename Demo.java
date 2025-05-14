class Person {
    String name;
    String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    void Display() {
        System.out.println("Name of the Person is: " + name);
        System.out.println("Date of birth is: " + dob);
    }
}

class Employee extends Person {
    int emp_id;
    double salary;

    public Employee(String name, String dob, int emp_id, double salary) {
        super(name, dob);
        this.emp_id = emp_id;
        this.salary = salary;
    }

    void DisplayDetails() {
        System.out.println("Employee Id is: " + emp_id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Demo {
    public static void main(String[] args) {
        Employee e = new Employee("Appy", "26-08-2004", 1, 500000);
        e.Display();
        e.DisplayDetails();
    }
}
