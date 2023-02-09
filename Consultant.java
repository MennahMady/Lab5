public class Consultant extends HourlyWorker {
    private final int partTimeHours = 20;
  
    public Consultant(String name, double hourlyPay) {
      super(name, hourlyPay);
    }
  
    @Override
    public double calculateWeeklyPay() {
      return partTimeHours * getHourlyPay();
    }


  }
  