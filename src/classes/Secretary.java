package src;

public class Secretary extends Employee{

    private double salaryFix;

    public Secretary(String name, Integer hiringMonth, Integer hiringYear) {
        super(name,hiringMonth,hiringYear);
        this.salaryFix = 7000.00;
    }

    //calcula o salário parcial do vendedor
    double calculateSalarySecretary(int month, int year){
        double salary = 0;
        double yearService = 0;

        if(this.hiringMonth <= month && this.hiringYear < year) {
            yearService = ((year) - this.hiringYear)*1000.00;
            salary = this.salaryFix + yearService;
        }
        if(this.hiringYear == year){
            salary = this.salaryFix;
        }
        if(this.hiringMonth > month && this.hiringYear < year){
            if(year - this.hiringYear > 1){
                yearService = ((year-1) - this.hiringYear)*1000.00;
                salary = this.salaryFix + yearService;
            }
            else{
                salary = this.salaryFix;
            }
        }
        return salary;
    }

    //calculo do bonus do vendedor
    double calculateBonificationSecretary(int month, int year){
        return calculateSalarySecretary(month, year) * 0.2;
    }
    //calcula o salario total do secretário com beneficios
    public double calculateFullSalarySecretary(int month, int year){
        return calculateSalarySecretary(month, year) + calculateBonificationSecretary(month, year);
    }
}
