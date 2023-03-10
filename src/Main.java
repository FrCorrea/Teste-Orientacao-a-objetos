import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller("Ana Silva", 12, 2021);
        seller.addSaleForSeller(12, 2021, 5200);
        seller.addSaleForSeller(01,2022,4000);
        seller.addSaleForSeller(02,2022,4200);
        seller.addSaleForSeller(03,2022,5850);
        seller.addSaleForSeller(04,2022,7000);

        Seller seller1 = new Seller("João Mendes", 12, 2021);
        seller1.addSaleForSeller(12, 2021, 3400);
        seller1.addSaleForSeller(01,2022,7700);
        seller1.addSaleForSeller(02,2022,5000);
        seller1.addSaleForSeller(03,2022,5900);
        seller1.addSaleForSeller(04,2022,6500);

        List<Seller> sellers = new ArrayList<>();
        sellers.add(seller);
        sellers.add(seller1);

        Seller topSeller = seller.TopSeller(sellers,01,2022);
        System.out.printf("O maior vendedor(a) foi: " + topSeller.getName());
    }
}