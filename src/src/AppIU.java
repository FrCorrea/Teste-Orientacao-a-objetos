import java.util.List;
import java.util.Scanner;

public class AppIU {
    public AppIU() {
    }
    public void showMenu(){
        Scanner input = new Scanner(System.in);
        Service service = new Service();
        Repositorie repositorie = new Repositorie();
        List<Seller> sellers= repositorie.getSellers();
        List<Employee> employees = repositorie.getEmployees();
        List<Employee> beneficiaries = repositorie.getBeneficiaries();

        int op = 0;
        while(op <= 6) {
            System.out.println("MENU - ESCOLHA A FUNÇÃO");
            System.out.println("REALIZADO COM OS DADOS DISPONIBILIZADOS");
            System.out.println("1 - SALÁRIO TOTAL COM BENEFÍCIOS");
            System.out.println("2 - TOTAL PAGO SOMENTE EM SALÁRIOS");
            System.out.println("3 - TOTAL PAGO EM BENEFICIOS");
            System.out.println("4 - FUNCINÁRIO QUE RECEBEU MAIOR SALÁRIO");
            System.out.println("5 - FUNCIONÁRIO QUE RECEBEU MAIOR BENEFÍCIO");
            System.out.println("6 - FUNCIONÁRIO QUE MAIS VENDEU");
            System.out.println("OUTRO - SAIR");
            System.out.println("OPCAO: ");
            op = input.nextInt();

            int month = 0, year = 0;

            try {
                switch (op) {
                    case 1:
                        System.out.println("Digite o mês");
                        month = input.nextInt();
                        System.out.println("Digite o ano");
                        year = input.nextInt();
                        input.nextLine();
                        System.out.println("O valor total pago foi:" + String.valueOf(service.sumSalary(employees, month, year)));
                        input.nextLine();
                        break;
                    case 2:
                        System.out.println("Digite o mês");
                        month = input.nextInt();
                        System.out.println("Digite o ano");
                        year = input.nextInt();
                        input.nextLine();
                        System.out.println("O valor em salários pago foi:" + service.totalMonthSalary(employees, month, year));
                        input.nextLine();
                        break;
                    case 3:
                        System.out.println("Digite o mês");
                        month = input.nextInt();
                        System.out.println("Digite o ano");
                        year = input.nextInt();
                        input.nextLine();
                        System.out.println("O valor em beneficios pago foi:" + service.totalBeneficiesMonth(beneficiaries, month, year));
                        input.nextLine();
                        break;
                    case 4:
                        System.out.println("Digite o mês");
                        month = input.nextInt();
                        System.out.println("Digite o ano");
                        year = input.nextInt();
                        input.nextLine();
                        Employee topEmployee = service.highestPaidEmployee(employees, month, year);
                        System.out.println("O funcionário q recebeu maior salario foi o(a) :" + topEmployee.name);
                        input.nextLine();
                        break;
                    case 5:
                        System.out.println("Digite o mês");
                        month = input.nextInt();
                        System.out.println("Digite o ano");
                        year = input.nextInt();
                        input.nextLine();
                        System.out.println("O funcionário q recebeu mais beneficios foi o(a) :" + service.highestBeneficiaryEmployee(beneficiaries, month, year));
                        input.nextLine();
                        break;
                    case 6:
                        System.out.println("Digite o mês");
                        month = input.nextInt();
                        System.out.println("Digite o ano");
                        year = input.nextInt();
                        input.nextLine();
                        Seller topSeller = service.topSeller(sellers, month, year);
                        System.out.println("O funcionário q mais vendeu foi o(a) :" + topSeller.name);
                        input.nextLine();
                        break;
                    default:
                        op = 7;
                }
            }catch (IlegalMonthOrYearException imy){
                System.out.println(imy.getMessage());
            }
        }

    }
}
