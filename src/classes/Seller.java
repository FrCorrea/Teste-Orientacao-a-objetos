package src;

import java.util.ArrayList;
import java.util.List;
public class Seller extends Employee{
    private double salaryFix;
    private List<Sale> saleList;

    public String getName() {
        return name;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    public Seller(String name, Integer hiringMonth, Integer hiringYear) {
        super(name, hiringMonth, hiringYear);
        this.salaryFix = 12000.00;
        this.saleList = new ArrayList<>();
    }

    //calculo do salario parcial do vendedor
    double calculateSalarySeller(int month, int year){
        double salary = 0;
        double yearService = 0;

        if(this.hiringMonth <= month && this.hiringYear < year) {
            yearService = ((year) - this.hiringYear)*1800.00;
            salary = this.salaryFix + yearService;
        }
        if(this.hiringYear == year){
            salary = this.salaryFix;
        }
        if(this.hiringMonth > month&& this.hiringYear < year){
            if(year - this.hiringYear > 1){
                yearService = ((year-1) - this.hiringYear)*1800.00;
                salary = this.salaryFix + yearService;
            }
            else{
                salary = this.salaryFix;
            }
        }
        return salary;
    }

    //calculo do bonus do vendedor
    double calculateBonificationSeller(int month, int year){
        double sumSales = 0;
        for (Sale sale: this.saleList){
            if(sale.getYearSale() == year && sale.getMonthSale() == month){
                sumSales = sale.getValue();
            }
        }
        double bonification = sumSales * 0.3;

        return bonification;
    }

    //calcula o salario total com beneficios
    public double calculateFullSalarySeller(int month, int year){
        return calculateSalarySeller(month, year) + calculateBonificationSeller(month, year);
    }

    //adiciona uma venda ao vendedor
    public void addSaleForSeller(int mounthSale, int yearSale, double value){
        Sale sale = new Sale(mounthSale,yearSale,value);
        this.saleList.add(sale);
    }


}
