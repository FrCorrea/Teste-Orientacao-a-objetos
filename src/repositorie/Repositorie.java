package repositorie;

import classes.Employee;
import classes.Manager;
import classes.Secretary;
import classes.Seller;

import java.util.ArrayList;
import java.util.List;

public class Repositorie {
    public Repositorie() {

    }

    public List<Seller> getSellers() {
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

        return sellers;
    }

    public List<Employee> getBeneficiaries() {
        //upcasting
        Employee secretary1 = new Secretary("Jorge Carvalho",1,2018);
        Employee secretary2 = new Secretary("Maria Souza",12,2015);

        List<Seller> sellers= getSellers();

        List<Employee> employees = new ArrayList<>();
        employees.add(secretary1);
        employees.add(secretary2);

        for(Seller seller: sellers){
            Employee employee = seller;
            employees.add(employee);
        }

        return employees;
    }

    public List<Employee> getEmployees() {

        List<Employee> employees = getBeneficiaries();

        //upcasting
        Employee manager1 = new Manager("Juliana Alves",7,2017);
        Employee manager2 = new Manager("Bento Albino",9,2017);

        employees.add(manager1);
        employees.add(manager2);

        return employees;
    }
}
