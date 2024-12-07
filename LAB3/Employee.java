// Parent class
class User {
    private String name;
    private int age;

    // Constructor for User class
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display user details
    public void displayUserDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Employee extends User {
    private double salary;

    // Constructor for Employee class
    public Employee(String name, int age, double salary) {
        super(name, age); // Call parent class constructor
        this.salary = salary;
    }

    // Method to display employee salary
    public void displaySalaryDetails() {
        displayUserDetails(); // Access parent class method
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee emp = new Employee("John Doe", 30, 75000);

        // Access parent class details through child class object
        emp.displaySalaryDetails();
    }
}
