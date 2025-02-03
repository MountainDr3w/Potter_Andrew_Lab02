public class Worker extends Person {
    //Fields
    private double hourlyPayRate;

    //Constructor
    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    //Getters
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    //Setters
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }


    //Methods
    /**
     * returns the weekly pay calculated by the hours worked
     *
     * @param hoursWorked the number of hours the worker worked
     * @return the pay the worker should get
     */
    public double calculateWeeklyPay(double hoursWorked){
        double overtime = 0;

        if (hoursWorked > 40){
            overtime = (hoursWorked - 40) * (this.hourlyPayRate * 1.5);
        }
        return (hoursWorked * this.hourlyPayRate) + overtime;
    }

    /**
     * Displays the weekly pay to the screen
     *
     * @param hoursWorked the number of hours the worker worked
     * @return nothing
     */
    public void displayWeeklyPay(double hoursWorked){
        double regHours = hoursWorked;
        double overTime = 0;

        if (hoursWorked > 40){
            overTime = regHours - 40;
            regHours = 40;
        }

        System.out.println("+       |    Regular    |    Overtime    |    Total    |       +");
        System.out.printf("+ Hours | %13.2f | %14.2f | %11.2f |       +\n", regHours, overTime, hoursWorked);
        System.out.printf("+  Pay  | %13.2f | %14.2f | %11.2f |       +\n", (regHours*this.hourlyPayRate),(overTime*(this.hourlyPayRate*1.5)),calculateWeeklyPay(hoursWorked));
    }


    //Overloads
    @Override
    public String toCSV(){
        return this.getIDNum() + " , " + this.getFirstName() + " , " + this.getLastName() + " , " + this.getTitle() + " , " + this.getYOB() + " , " + this.getHourlyPayRate();
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
                '}';
    }
}
