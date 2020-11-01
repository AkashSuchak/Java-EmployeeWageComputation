//Author :  Akash Suchak
//Compute Employee Wage for Multiple Compmnies

//packages
import java.util.Random;
import java.util.Scanner;


public class EmpWageComp {
    //Variables To Count Month Wages
    static int day = 1,totalWorkingHours = 0;
    //static int fullDayHours = 8, halfDayHours = 4, wagePerHour = 20 ;

    public static void main(String[] args) {
        System.out.println("welcome To Employee Wage Computation");
        int companyCount = 1;
        while (true){
            System.out.println("----------------------------------------------");
            System.out.println("Employee Wage Computation for Company "+companyCount);
            System.out.println("----------------------------------------------");
            //User-Inputs
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Wage Per Hour : ");
            int wph = input.nextInt();

            System.out.println("Enter Full Day Hours : ");
            int fdh = input.nextInt();

            System.out.println("Enter Half Day Hours : ");
            int hdh = input.nextInt();

            System.out.println("Enter Maximum Number of Days Employee can Work In a Month : ");
            int d = input.nextInt();

            System.out.println("Enter Maximum Working Hours Employee can Work In a Month : ");
            int twh = input.nextInt();

            EmpWageComp emp = new EmpWageComp();
            System.out.println("----------------------------------------------");
	    emp.days(fdh,hdh,d);
            //Setting Working Hours 100 if greater 100
            if (totalWorkingHours > twh) {
                totalWorkingHours = twh;
            }
            emp.totalWage(wph);
	    System.out.println("----------------------------------------------");

            System.out.println("Do You Want count for one more Company..?");
            System.out.println("Press y for yes");
            System.out.println("Press n for no");
            Scanner scanner = new Scanner(System.in);
            String cnfrm = scanner.nextLine();
            if(cnfrm.equals("y") || cnfrm.equals("yes")){
                companyCount+=1;
                continue;
            }else if (cnfrm.equals("n") || cnfrm.equals("no")){
                System.out.println("Have a Nice Day. Thank You!");
                break;
            }

        }
    }

    //Method of Display Total Working Hours with Total Wage
    public void totalWage(int wagePerHour) {
        int totalMonthlyWage = totalWorkingHours * wagePerHour;
        System.out.println("Employee worked " + totalWorkingHours + " Hours in a Month");
        System.out.println("Employee Wage : " + totalMonthlyWage);
    }
    //Method to count 20 days
    public void days(int fullDayHours, int halfDayHours, int d) {
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
        if (day <= d) {
            EmpWageComp emp = new EmpWageComp();
            emp.days(fullDayHours, halfDayHours, d);
        }
    }
}
