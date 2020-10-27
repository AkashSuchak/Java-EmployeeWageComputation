//Author :  Akash Suchak
//Computing Day Wage Of Employee(Fulltime And PartTime)

//package
import java.util.Random;

public class EmpWageComp {
    public static void main(String[] args){
        //object of class
        EmpWageComp ewc = new EmpWageComp();

        //To Generate Randoms 0, 1 and 2
        Random ran= new Random();
        int ran1 = ran.nextInt(3);

        //Employee is Present or Not
        if( ran1 == 0 ) {
            System.out.println("Employee is Present and Working FullTime");
            ewc.fullTime();
        }else if (ran1 == 1){
            System.out.println("Employee is Present and Working PartTime");
            ewc.partTime();
        }else {
            System.out.println("Employee is Absent");
        }

    }
    //Method to count Fulltime Day Wage
    public void fullTime(){
        int wagePerHr = 20;
        int dailyWorkHrs = 8;

        int totalDayWage = wagePerHr * dailyWorkHrs;
        System.out.println("Wage : " + totalDayWage);
    }
    //Method to count Parttime Day Wage
    public void partTime(){
        int wagePerHr = 20;
        int dailyWorkHrs = 4;

        int totalDayWage = wagePerHr * dailyWorkHrs;
        System.out.println("Wage : " + totalDayWage);
    }
}
