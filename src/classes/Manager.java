package classes;

public class Manager extends Employee{
    private double salaryFix;

    public Manager(String name, Integer hiringMonth, Integer hiringYear) {
        super(name, hiringMonth, hiringYear);
        this.salaryFix = 20000.00;
    }
    double calculateSalaryManager(int month, int year){
        double salary = 0;
        double yearService = 0;

        if(this.hiringMonth <= month && this.hiringYear < year) {
            yearService = ((year) - this.hiringYear)*3000.00;
            salary = this.salaryFix + yearService;
        }
        if(this.hiringYear == year){
            salary = this.salaryFix;
        }
        if(this.hiringMonth > month && this.hiringYear < year){
            if(year - this.hiringYear > 1){
                yearService = ((year-1) - this.hiringYear)*3000.00;
                salary = this.salaryFix + yearService;
            }
            else{
                salary = this.salaryFix;
            }
        }
        return salary;
    }
}
