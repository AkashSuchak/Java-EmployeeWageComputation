//Author :  Akash Suchak
//Computing Day Wage Of Employee

//package
import java.util.Random;

public class EmpWageComp {
    public static void main(String[] args){
        //object of class
        EmpWageComp ewc = new EmpWageComp();

        //To Generate Randoms 0 or 1
        Random ran= new Random();
        int ran1 = ran.nextInt(2);

        //Employee is Present or Not
        if( ran1 == 0 ) {
            System.out.println("Employee is Present");
            ewc.wage();
        }else {
            System.out.println("Employee is Absent");
        }
    }
    //Method to count Day Wage
    public void wage(){
        int wagePerHr = 20;
        int dailyWorkHrs = 8;

        int totalDayWage = wagePerHr * dailyWorkHrs;
        System.out.println("Wage : " + totalDayWage);
    }
}

