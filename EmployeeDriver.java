import java.util.ArrayList;

/*
 * Driver
 * Lab 
 * 
 * A simple driver to exercise the Employee hierarchy 
 */
public class EmployeeDriver {
    public static void main(String[] args) {
        Accountant emp1 = new Accountant("Rick", 123456789);
        // This next employee makes a bit more than Rick.
        Accountant emp2 = new Accountant("Tim", 55555555, 10000);
        // Now let's make an hourly worker.
        HourlyWorker emp3 = new HourlyWorker("Jim", 11111111);
        // Then a salaried worker.Í
        SalariedWorker emp4 = new SalariedWorker("Jane", 222222222, 5000);
        // TODO: Build some PermanentHire and Consultant objects here
        // and add them to the ArrayList below
        // Next we build a list of employees.
        ArrayList<Employee> myEmployees = new ArrayList<Employee>();
        myEmployees.add(emp1);
        myEmployees.add(emp2);
        myEmployees.add(emp3);
        myEmployees.add(emp4);
        // TODO: Add your PermanentHire and Consultant instances to the list.
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee permanentHire1 = new PermanentHire("John Doe", 100000, 5000);
        Employee permanentHire2 = new PermanentHire("Jane Doe", 110000, 6000);
        
        employees.add(permanentHire1);
        employees.add(permanentHire2);
        
        
        Consultant consultant1 = new Consultant("Bob Smith", 30.00);
        Consultant consultant2 = new Consultant("Alice Johnson", 35.00);
        
        employees.add(consultant1);
        employees.add(consultant2);
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        // This code doesn't need to change, even if you add 10 new employee classes and
        // add 102 new employees - this is an example of the generic code that you can
        // write when you use inheritance hierarchies are.
        for (int i = 0; i < myEmployees.size(); i++) {
            Employee current = myEmployees.get(i);
            System.out.println(current.getName() + " makes " +
                    current.calculateWeeklyPay() + " per week.");
        }
    }
}