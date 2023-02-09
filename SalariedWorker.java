
/*
 * SalariedWorker.java
 * 
 * This class overrides the Employee.calculateWeeklyPay method because
 * the weekly pay for a salaried worker is calculated differently than
 * the weekly pay for an hourly worker.
 */
public class SalariedWorker extends Employee {
    private double monthlyPay;
    public SalariedWorker() {
    super();
    }
    public SalariedWorker(String name, double salary) {
    super(name, salary);
    }
    public SalariedWorker(String name, int social, double pay) {
    super(name, social);
    if( pay > 0.0) {
    monthlyPay = pay;
    }
    }
    public double calculateWeeklyPay() {
    return monthlyPay / 4;
    }
    }