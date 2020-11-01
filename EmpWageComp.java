//Author :  Akash Suchak
//Total Wage for Each Company 

//packages
import java.util.Random;

class EmpWageBuilder{
    private final String company;
    private final int wagePerHour;
    private final int workingDays;
    private final int maxMonthHours;
    private int totalMonthlyWage;
    //Constructor
    EmpWageBuilder(String company, int wagePerHour, int workingDays, int maxMonthHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxMonthHours = maxMonthHours;

    }

    //Computing Wage for Companies
    public void totalWage() {
        //Variables
        int totalWorkingHours=0, fullDayHours=8, halfDayHours=4;
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

            if (totalWorkingHours > maxMonthHours) {
                totalWorkingHours = maxMonthHours;
                break;
            }
        }
        //Counting Total Monthly Wage
        totalMonthlyWage=totalWorkingHours * wagePerHour;
    }
    @Override
    public String toString(){
        return "Total employee Wage for " + company + " is : "+ totalMonthlyWage;
    }
}

public class EmpWageComp {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        System.out.println("====================================");
        EmpWageBuilder company1 = new EmpWageBuilder("company1",20,20,100);
        company1.totalWage();
        System.out.println(company1);
        System.out.println("---------------------------------------");
        EmpWageBuilder company2 = new EmpWageBuilder("company2", 25,25, 120);
        company2.totalWage();
        System.out.println(company2);
    }
}
