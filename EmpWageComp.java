//Author :  Akash Suchak
//Refactor the code to write a class Method to compute Employee Wage

//package
import java.util.Random;

public class EmpWageComp {
    //Variables To Count Month Wages
    static int wagePerHour = 20, day = 1;
    static int fullDayHours = 8, halfDayHours = 4, totalWorkingHours = 0;

    public static void main(String[] args) {
        EmpWageComp emp = new EmpWageComp();
        emp.days();
        //Setting Working Hours 100 if greater 100
        if (totalWorkingHours > 100) {
            totalWorkingHours = 100;
        }
        emp.totalWage();
    }

    //Method of Display Total Working Hours with Total Wage
    public void totalWage() {
        int totalMonthlyWage = totalWorkingHours * wagePerHour;
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Wage : " + totalMonthlyWage);
    }
    //Method to count 20 days
    public void days() {
        //To Generate Randoms 0, 1 and 2
        Random ran = new Random();
        int ran1 = ran.nextInt(3);

        //Employee is Present or Not
        if (ran1 == 0) {
            totalWorkingHours += fullDayHours;
        } else if (ran1 == 1) {
            totalWorkingHours += halfDayHours;
        }
        day += 1;
        if (day <= 20) {
            EmpWageComp emp = new EmpWageComp();
            emp.days();
        }
    }
}
