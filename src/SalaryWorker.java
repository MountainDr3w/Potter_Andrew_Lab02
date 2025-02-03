public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(IDNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked){
        return annualSalary/52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked){
        System.out.printf("Total pay: %10.2f\n" +
                "Weekly pay: %10.2f\n", annualSalary, calculateWeeklyPay(0));
    }

    @Override
    public String toCSV(){
        return this.getIDNum() + " , " + this.getFirstName() + " , " + this.getLastName() + " , " + this.getTitle() + " , " + this.getYOB() + " , " + this.getHourlyPayRate() + " , " + this.getAnnualSalary();
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + this.getIDNum() + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", YOB=" + this.getYOB() + '\'' +
                ", hourlyRate='" + this.getHourlyPayRate() +'\'' +
                ", annualSalary='" + this.getAnnualSalary() +'\'' +
                '}';
    }
}
