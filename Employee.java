/*
 * Employee.java - Abstract
 * This is the superclass of all workers in this company
 * All employees must have a name and social security number.
 */

/*
 * Q&A
 * 1. In the Employee hierarchy, only the calculateWeeklyPay method is
 * polymorphic,
 * as it is declared as an abstract method in the Employee class,
 * and is thus subject to overriding in any subclasses.
 *
 * 2. private static Employee[] employees = {new HourlyWorker("John Doe",
 * 123456789, 50.0, 40),
 * new SalariedWorker("Jane Doe", 987654321, 5000.0),
 * new Manager("Jim Smith", 111111111, 10000.0, 500.0)};
 * 
 * public static Employee getRandomEmployee() {
 * int randomIndex = (int) (Math.random() * employees.length);
 * return employees[randomIndex];
 * }
 * 
 * public static void main(String[] args) {
 * Employee randomEmployee = getRandomEmployee();
 * System.out.println("Random Employee: " + randomEmployee.getName());
 * System.out.println("Weekly Pay: $" + randomEmployee.calculateWeeklyPay());
 * }
 *
 * The code demonstrates late binding by calling the calculateWeeklyPay
 * method on the randomEmployee object, which is assigned to a random
 * Employee object from the employees array. Since the calculateWeeklyPay
 * method is polymorphic, the correct implementation of the method is determined
 * at runtime based on the actual type of the randomEmployee object, rather than
 * its declared type.
 */
// notice the abstract keyword? That prevents us from making objects of this
// type!
public abstract class Employee {
    private String name;
    private int social;

    public Employee() {
    }

    public Employee(String newName, int newSocial) {
        name = newName;
        social = newSocial;
    }

    public Employee(String name2, double salary) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public abstract double calculateWeeklyPay();
}