import java.util.List;

public class Service {
    public Service() {
    }

    // Um método que receba uma lista de funcionários, mês e ano
    // e retorne o valor total pago (salário e benefício) a esses funcionários no mês.
    public double sumSalary(List<Employee> employees, int month, int year){
        double totalCost = 0;
        for(Employee employee: employees){

            //downcasting
            if(employee instanceof Secretary){
                Secretary secretary = (Secretary) employee;
                totalCost += ((Secretary) employee).calculateFullSalarySecretary(month, year);
            }
            if(employee instanceof Seller){
                Seller seller = (Seller) employee;
                totalCost += ((Seller) employee).calculateFullSalarySeller(month, year);
            }
            if(employee instanceof Manager){
                Manager manager = (Manager) employee;
                totalCost += ((Manager) employee).calculateSalaryManager(month,year);
            }
        }
        return totalCost;
    }

    //Um método que receba uma lista de funcionários, mês e ano
    // e retorne o total pago somente em salários no mês.
    public double totalMonthSalary(List<Employee> employees,int month, int year){
        double totalCost = 0;
        for(Employee employee: employees){
            //downcasting
            if(employee instanceof Secretary){
                Secretary secretary = (Secretary) employee;
                totalCost += ((Secretary) employee).calculateSalarySecretary(month, year);
            }
            if(employee instanceof Seller){
                Seller seller = (Seller) employee;
                totalCost += ((Seller) employee).calculateSalarySeller(month, year);
            }
            if(employee instanceof Manager){
                Manager manager = (Manager) employee;
                totalCost += ((Manager) employee).calculateSalaryManager(month,year);
            }
        }
        return totalCost;
    }

    //Um método que receba uma lista somente com os funcionários que recebem benefícios,
    // mês e ano e retorne o total pago em benefícios no mês.
    public double totalBeneficiesMonth(List<Employee> employees, int month, int year){
        double totalCost = 0;
        for(Employee employee: employees){
            //downcasting
            if(employee instanceof Secretary){
                Secretary secretary = (Secretary) employee;
                totalCost += ((Secretary) employee).calculateBonificationSecretary(month, year);
            }
            if(employee instanceof Seller){
                Seller seller = (Seller) employee;
                totalCost += ((Seller) employee).calculateBonificationSeller(month, year);
            }
        }
        return totalCost;
    }

    //Um método que receba uma lista de funcionários, mês e ano
    // e retorne o que recebeu o valor mais alto no mês.
    public Employee highestPaidEmployee(List<Employee> employees, int month, int year){
        double salaryValue = 0;
        double value = 0;
        Employee hpEmployee = null;

        for(Employee employee: employees){
            //downcasting
            if(employee instanceof Secretary){
                Secretary secretary = (Secretary) employee;
                salaryValue = ((Secretary) employee).calculateFullSalarySecretary(month, year);
            }
            if(employee instanceof Seller){
                Seller seller = (Seller) employee;
                salaryValue = ((Seller) employee).calculateFullSalarySeller(month, year);
            }
            if(employee instanceof Manager){
                Manager manager = (Manager) employee;
                salaryValue = ((Manager) employee).calculateSalaryManager(month,year);
            }
            if(salaryValue > value){
                value = salaryValue;
                hpEmployee = employee;
            }
        }
        return hpEmployee;

    }

    //Um método que receba uma lista somente com os funcionários que recebem benefícios, mês e ano e
    // retorne o nome do funcionário que recebeu o valor mais alto em benefícios no mês.
    public String highestBeneficiaryEmployee(List<Employee> employees, int month, int year){
        Employee hbEmployee = null;
        double value = 0;
        double benefitValue = 0;

        for(Employee employee: employees){
            //downcasting
            if(employee instanceof Secretary){
                Secretary secretary = (Secretary) employee;
                value = ((Secretary) employee).calculateBonificationSecretary(month, year);
            }
            if(employee instanceof Seller){
                Seller seller = (Seller) employee;
                value = ((Seller) employee).calculateBonificationSeller(month, year);
            }
            if(value > benefitValue){
                benefitValue = value;
                hbEmployee = employee;
            }
        }
        return hbEmployee.name;
    }

    //Um método que receba uma lista de vendedores, mês e ano e retorne o que mais
    // vendeu no mês.
    public Seller topSeller(List<Seller> sellers, int month, int year){
        Seller topSeller = null;
        double value = 0;
        double sellerValue = 0;
        for(Seller seller:sellers){
            for(Sale sale: seller.getSaleList()){
                if(month == sale.getMonthSale() && year == sale.getYearSale()) {
                    value = sale.getValue();
                    break;
                }
            }
            if(value > sellerValue){
                sellerValue = value;
                topSeller = seller;
            }
        }
        return topSeller;
    }


}

