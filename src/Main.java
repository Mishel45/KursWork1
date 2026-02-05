//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Уважаемый наставник представляю твоему вниманию курсовую работу за " +
                "1 блок обучения.(введение в профессию и синтаксис языва) ");
        System.out.println();
        Employee employee1 = new Employee("Павлов И.М.", 2, 50);
        Employee employee2 = new Employee("Васильев А.В.", 3, 200);
        Employee employee3 = new Employee("Чичиков А.Ю.", 5, 300);
        Employee employee4 = new Employee("Копин Б.Л.", 1, 100);
        Employee employee5 = new Employee("Павлов И.М.", 2, 50);
        Employee employee6 = new Employee("Шкрабов Д.Р.", 1, 250);
        Employee employee7 = new Employee("Гадов П.К.", 4, 450);
        Employee employee8 = new Employee("Шубина А.П.", 4, 350);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
        System.out.println(employee7);
        System.out.println(employee8);
        employee1.printShortInfo();
        employee2.printShortInfo();
        employee3.printShortInfo();
        employee4.printShortInfo();
        employee5.printShortInfo();
        employee6.printShortInfo();
        employee7.printShortInfo();
        employee8.printShortInfo();
        System.out.println();

        EmployeeBook employeeBook = new EmployeeBook();
        EmployeeBook.employeeCard[0] = employee1;
        employeeBook.employeeCard[1] = employee2;
        employeeBook.employeeCard[2] = employee3;
        employeeBook.employeeCard[3] = employee4;
        employeeBook.employeeCard[4] = employee5;
        employeeBook.employeeCard[5] = employee6;
        employeeBook.employeeCard[6] = employee7;
        employeeBook.employeeCard[7] = employee8;
        employeeBook.printAllEmployees();

        double averageSalary = employeeBook.calculateAverageSalary();
        System.out.println("Средняя зарплата: " + averageSalary);

        System.out.println();
        String taxSystem = "PROPORTIONAL";
        System.out.println(EmployeeBook.calculateTax(taxSystem));
        System.out.println(EmployeeBook.calculateTax("PROGRESSIVE"));

        System.out.println();
        int bonusSalary = 10;
        int bonusDepartmentNumber = 4;
        System.out.println(EmployeeBook.salaryIncrease(bonusSalary, bonusDepartmentNumber));

        System.out.println();
        int numberDepartment = 1;
        int salaryFigure = 200;
        System.out.println(EmployeeBook.salaryHigher(numberDepartment, salaryFigure));

        System.out.println();
        int wage = 350;
        int employeeNumber = 3;
        System.out.println(EmployeeBook.salaryLess(wage, employeeNumber));

        System.out.println();
        Employee employee9 = new Employee("Кошкин А.В.", 4, 430);
        System.out.println(EmployeeBook.isEmployeeInArray(employee1));
        System.out.println(EmployeeBook.isEmployeeInArray(employee9));

        System.out.println();
        System.out.println(EmployeeBook.fillingEmployeeBook(employee9));
        employeeBook.printAllEmployees();

        System.out.println();
        System.out.println(EmployeeBook.getEmployeeById(9));

        System.out.println();
        Employee employee10 = new Employee("Кошкин А.В.", 4, 430);
        Employee employe11 = new Employee("Кошкин А.В.", 4, 430);
        EmployeeBook employeeBook1 = new EmployeeBook();
        EmployeeBook.fillingEmployeeBook(employee1);
        EmployeeBook.fillingEmployeeBook(employee2);
        EmployeeBook.fillingEmployeeBook(employee3);
        EmployeeBook.fillingEmployeeBook(employee4);
        EmployeeBook.fillingEmployeeBook(employee5);
        EmployeeBook.fillingEmployeeBook(employee6);
        EmployeeBook.fillingEmployeeBook(employee7);
        EmployeeBook.fillingEmployeeBook(employee8);
        EmployeeBook.fillingEmployeeBook(employee9);
        EmployeeBook.fillingEmployeeBook(employee10);

        employeeBook.printAllEmployees();

    }
}




