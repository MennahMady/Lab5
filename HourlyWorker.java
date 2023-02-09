/*
 * HourlyWorker.java
 * 
 * This class overrides the Employee.calculateWeeklyPay method because
 * the weekly pay for an hourly worker is calculated differently than
 * the weekly pay for a salaried worker.
 */
public class HourlyWorker extends Employee {
    private double hourlyPay;
    public static final double MINIMUM_WAGE = 15.74;
    public HourlyWorker() {
    super();
    }
    public HourlyWorker(String name, int social) {
    super(name, social);
    hourlyPay = MINIMUM_WAGE;
    }
    public HourlyWorker(String name, int social, double pay) {
    super(name, social);
    if( pay > 0.0) {
    hourlyPay = pay;
    }
    }
    public HourlyWorker(String name, double hourlyPay2) {
        super(name, hourlyPay2);
    }
    // Notice how we override this method to act accordingly for an hourly wage.
    @Override
    public double calculateWeeklyPay() {
    return hourlyPay * 40;
    }
    public double getHourlyPay(){
        return hourlyPay;
        
    }
    }