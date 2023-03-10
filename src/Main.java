import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Repositorie repositorie = new Repositorie();


        List<Seller> sellers= repositorie.getSellers();

        List<Employee> employees = repositorie.getEmployees();

        System.out.printf(String.valueOf(service.sumSalary(employees,2,2021)));
        Seller topSeller = service.topSeller(sellers,2,2022);


        System.out.printf("\n" + topSeller.name);


    }
}