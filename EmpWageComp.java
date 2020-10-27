//Author :  Akash Suchak
//Calculate Monthly Wage Untill TotalWorkingHours Or Days is reached

//package
import java.util.Random;

public class EmpWageComp {
    public static void main(String[] args){
        //Assign Values for wage
        int wagePerHour=20;
        int fullDayHours=8;
        int halfDayHours=4;
        int workingDays=20;
        int totalWorkingHours=0;

        for (int i=0; i<workingDays; i++) {
            //To Generate Randoms 0, 1 and 2
            Random ran = new Random();
            int ran1 = ran.nextInt(3);

            //Employee is Present or Not
            if (ran1 == 0) {
                totalWorkingHours += fullDayHours;
            } else if (ran1 == 1) {
                totalWorkingHours += halfDayHours;
            } else {
                totalWorkingHours += 0;
            }
            //Setting Working Hours 100 if greater than 100
            if (totalWorkingHours > 100) {
                totalWorkingHours = 100;
                break;
            }
        }
        //Display Total Working Hours with Total Wage
        int totalMonthlyWage=totalWorkingHours * wagePerHour;
        System.out.println("Total Working Hours : " + totalWorkingHours );
        System.out.println("Total Wage : " + totalMonthlyWage);
    }
}
