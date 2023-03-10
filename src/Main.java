import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Repositorie repositorie = new Repositorie();
        List<Seller> sellers= repositorie.getSellers();
        List<Employee> employees = repositorie.getEmployees();
        List<Employee> beneficiaries = repositorie.getBeneficiaries();

        System.out.println("1 - " + String.valueOf(service.sumSalary(employees,2,2022)));
        System.out.println("2 - " + service.totalMonthSalary(employees,2,2022));
        System.out.println("3 - " + service.totalBeneficiesMonth(beneficiaries,2,2022));

        Employee topEmployee = service.highestPaidEmployee(employees,2,2022);
        System.out.println("4 - " + topEmployee.name);

        System.out.println("5 - " + service.highestBeneficiaryEmployee(beneficiaries,2,2022));

        Seller topSeller = service.topSeller(sellers,12,2021);
        System.out.println("6 - " + topSeller.name);




    }
}