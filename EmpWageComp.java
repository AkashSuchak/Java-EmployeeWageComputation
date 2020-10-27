//Author :  Akash Suchak
//Switch Case : Computing Month Wage Of Employee(Fulltime And PartTime)

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
        switch (ran1){
            case 0 :
                System.out.println("Employee is Present and Working FullTime");
                ewc.fullTime();
                break;
            case 1:
                System.out.println("Employee is Present and Working PartTime");
                ewc.partTime();
                break;
            case 2:
                System.out.println("Employee is Absent");
                break;
        }

    }
    //Method to count Fulltime Month Wage
    public void fullTime(){
        int wagePerHr = 20;
        int dailyWorkHrs = 8;
        int workingDays = 20;

        int totalMonthWage = wagePerHr * dailyWorkHrs * workingDays;
        System.out.println("Monthly Wage : " + totalMonthWage);
    }
    //Method to count Parttime Month Wage
    public void partTime(){
        int wagePerHr = 20;
        int dailyWorkHrs = 4;
        int workingDays = 20;

        int totalMonthWage = wagePerHr * dailyWorkHrs * workingDays;
        System.out.println("Monthly Wage : " + totalMonthWage);
    }
}

