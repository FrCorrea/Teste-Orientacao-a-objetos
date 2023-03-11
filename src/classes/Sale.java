package src;

import java.util.List;

public class Sale {
    private int yearSale;
    private int monthSale;
    private double value;

    public Sale(int monthSale, int yearSale, double value) {
        this.monthSale = monthSale;
        this.yearSale = yearSale;
        this.value = value;
    }
    public int getYearSale() {
        return yearSale;
    }

    public int getMonthSale() {
        return monthSale;
    }

    public double getValue() {
        return value;
    }
}
