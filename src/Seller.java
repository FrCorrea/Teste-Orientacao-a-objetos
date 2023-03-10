import java.util.ArrayList;
import java.util.List;
public class Seller {
    private String name;
    private Integer hiringMonth;
    private Integer hiringYear;
    private List<Sale> saleList;

    public String getName() {
        return name;
    }

    public Seller(String name, Integer hiringMonth, Integer hiringYear) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.hiringMonth = hiringMonth;
        this.saleList = new ArrayList<>();
    }

    public void addSaleForSeller(int mounthSale, int yearSale, double value){
        Sale sale = new Sale(mounthSale,yearSale,value);
        this.saleList.add(sale);
    }

    // Função que retorna o vendedor que mais vendeu.
    public Seller TopSeller(List<Seller> sellers, int month, int year){
        double saleValue = 0;
        double bestSale = 0;
        Seller topSeller = null;
        for(Seller seller: sellers){
            for(Sale sale: seller.saleList){
                if(sale.getYearSale() == year && sale.getMonthSale() == month) {
                    saleValue = sale.getValue();
                }
            }
            if(saleValue > bestSale){
                bestSale = saleValue;
                topSeller = new Seller(seller.name, seller.hiringYear, seller.hiringMonth);
            }
        }
        return topSeller;
    }
}
