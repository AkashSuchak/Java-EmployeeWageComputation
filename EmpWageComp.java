//Author :  Akash Suchak
//Manage Employee Wage of Multiple Companies

//packages
import java.util.Random;

class CompanyEmpWage{
    public final String company;
    public final int wagePerHour;
    public final int workingDays;
    public final int maxMonthHours;
    public int totalMonthlyWage;
    //Constructor
    public CompanyEmpWage(String company, int wagePerHour, int workingDays, int maxMonthHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxMonthHours = maxMonthHours;
    }
    public void setTotalMonthlyWage(int totalMonthlyWage){
        this.totalMonthlyWage=totalMonthlyWage;
    }
    @Override
    public String toString(){
        return "Total employee Wage for " + company + " is : "+ totalMonthlyWage;
    }
}
class EmpWageBuilderArray{
    //Computing Wage for Companies
    private int numOfCompany=0;
    private CompanyEmpWage[] EmpWageBuilderArray;

    public EmpWageBuilderArray() {
        EmpWageBuilderArray = new CompanyEmpWage[5];
    }
    void addEmpWageBuilder(String company, int wagePerhour, int workingDays, int maxMonthHours){
        EmpWageBuilderArray[numOfCompany] = new CompanyEmpWage(company, wagePerhour, workingDays,maxMonthHours);
        numOfCompany++;
    }
    void totalWage(){
        for (int i=0; i<numOfCompany; i++){
            EmpWageBuilderArray[i].setTotalMonthlyWage(this.totalWage(EmpWageBuilderArray[i]));
            System.out.println(EmpWageBuilderArray[i]);
        }
    }
    private int totalWage(CompanyEmpWage companyEmpWage) {
        //Variables
        int totalMonthlyWage=0,totalWorkingHours=0, fullDayHours=8, halfDayHours=4;
        for (int i=0; i<companyEmpWage.workingDays; i++) {
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

            if (totalWorkingHours > companyEmpWage.maxMonthHours) {
                totalWorkingHours = companyEmpWage.maxMonthHours;
                break;
            }
        }
        //Counting Total Monthly Wage
        return totalMonthlyWage=totalWorkingHours * companyEmpWage.wagePerHour;
    }
}

public class EmpWageComp {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        System.out.println("====================================");
        EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
        empWageBuilderArray.addEmpWageBuilder("Company1",20,20,100);
        empWageBuilderArray.addEmpWageBuilder("Company2", 25,25, 120);
        empWageBuilderArray.totalWage();
    }
}
