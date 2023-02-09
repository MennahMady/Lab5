public class PermanentHire extends SalariedWorker {
    private double bonus;
  
    public PermanentHire(String name, double salary, double bonus) {
      super(name, salary);
      this.bonus = bonus;
    }
  
    @Override
    public double calculateWeeklyPay() {
      return super.calculateWeeklyPay() + bonus / 4;
    }
  }
  