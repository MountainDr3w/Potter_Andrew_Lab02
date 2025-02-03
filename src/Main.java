import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Declare Vars
        Worker jerry = new Worker("00001","Jerry","McDonalds","Mr.",2001,21);
        Worker kevin = new Worker("00002","Kevin","Kevinson","Mr.",2001,23);
        Worker jones = new Worker("00003","Jones","Phones","Mr.",2001,21);

        SalaryWorker patricia = new SalaryWorker("00004","Patricia","IloveWritingCharacterNames","Ms.",1979,0,100000);
        SalaryWorker grace = new SalaryWorker("00005","Grace","Yippee","Ms.",1979,0,90000);
        SalaryWorker lindsey = new SalaryWorker("00006","Lindsey","MyFingersHurt","Ms.",1979,0,110000);


        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(jerry);
        workers.add(kevin);
        workers.add(jones);
        workers.add(patricia);
        workers.add(grace);
        workers.add(lindsey);

        for(int i = 0; i < 3; i++){
            System.out.printf("Week " + (i + 1) + "\n");
            for(Worker worker : workers){
                System.out.println(worker.fullName() + ":");
                if (i == 1) {
                    worker.displayWeeklyPay(50);
                } else {
                    worker.displayWeeklyPay(40);
                }
            }
            System.out.println();
        }
    }
}