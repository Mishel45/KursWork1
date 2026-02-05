public class EmployeeBook {
    public static Employee[] employeeCard;

    private String methodTaxation;

    public EmployeeBook() {
        this.employeeCard = new Employee[10];
    }

    public void printAllEmployees() {
        for (Employee employee : employeeCard) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public double calculateAverageSalary() {
        double totalSalary = 0.0;
        int count = 0;
        for (Employee employee : employeeCard) {
            if (employee == null) {
                break;
            }
            totalSalary = totalSalary + employee.getSalary();
            count++;
        }
        if (count == 0) {
            return 0.0;
        }
        return totalSalary / count;
    }

    public static String calculateTax(String taxSystem) {
        StringBuilder result = new StringBuilder();
        double tax = 0;
        for (Employee employee : employeeCard) {
            if (employee == null) {
                break;
            } else {
                switch (taxSystem) {
                    case "PROPORTIONAL":
                        tax = employee.getSalary() * 13 / 100;
                        break;
                    case "PROGRESSIVE":
                        if (employee.getSalary() < 150 && employee.getSalary() > 0) {
                            tax = employee.getSalary() * 13 / 100;
                        } else if (employee.getSalary() < 350 && employee.getSalary() >= 150) {
                            tax = employee.getSalary() * 17 / 100;
                        } else if (employee.getSalary() >= 350) {
                            tax = employee.getSalary() * 21 / 100;
                        }
                        break;
                    default:
                        result.append("Введена не корректная система налогообложения\n");
                        continue;
                }
                result.append("Налог сотрудника: " + employee.getLastFirstName() + " по системе налогообложения: " + taxSystem
                        + " составляет: " + tax + " рублей.\n");
            }
        }
        return result.length() == 0 ? "Такого сотрудника нет" : result.toString();
    }

    public static String salaryIncrease(int bonusSalary, int bonusDepartmentNumber) {
        StringBuilder result = new StringBuilder();
        for (Employee employee : employeeCard) {
            if (employee == null) {
                break;
            } else {
                if (employee.getDepartmentNumber() != bonusDepartmentNumber) {
                    continue;
                } else {
                    double increase = (employee.getSalary() * bonusSalary) / 100;
                    employee.setSalary((int) (employee.getSalary() + increase));
                    result.append("Повышение зарплаты сотрудника: " + employee.getLastFirstName() + " из отдела № "
                            + employee.getDepartmentNumber() + " составляет: " + increase + " рублей.\n");
                }
            }
        }
        return result.toString();
    }

    public static String salaryHigher(int numberDepartment, int salaryFigure) {
        for (Employee employee : employeeCard) {
            if (employee == null) {
                break;
            } else {
                if (employee.getDepartmentNumber() != numberDepartment) {
                    continue;
                } else if (employee.getSalary() > salaryFigure) {
                    return "У сотрудника: " + employee.getLastFirstName() + " из отдела № "
                            + employee.getDepartmentNumber() + " зарплата больше " + salaryFigure + " рублей."
                            + employee.printShortInfo();
                }
            }
        }
        return "";
    }

    public static String salaryLess(int wage, int employeeNumber) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int count = 0;
        while (i < employeeCard.length && count < employeeNumber) {
            Employee employee = employeeCard[i];
            if (employee == null) {
                break;
            } else {
                if (employee.getSalary() >= wage) {
                    i++;
                    continue;
                } else {
                    count++;
                    result.append(employee.printShortInfo());
                }
            }
            i++;
        }
        result.append("Вот первые " + employeeNumber + " сотрудника(ов), имеющих зарплату меньше "
                + wage + " рублей.");
        return result.toString();
    }

    public static boolean isEmployeeInArray(Employee employeeToCheck) {
        for (Employee employee : employeeCard) {
            if (employee != null && employee.equals(employeeToCheck)) {
                System.out.println("Сравниваем "+employee +" и " +employeeToCheck);
                return true;
            }
        }
        return false;
    }

    public static boolean fillingEmployeeBook(Employee employee) {
        for (int i = 0; i < employeeCard.length; i++) {
            if (employeeCard[i] == null) {
                employeeCard[i] = employee;
                System.out.println("Сотрудник внесен в книгу сотрудников.");
                return true;
            }
        }
        System.out.println("Массив заполнен.");
        return false;
    }

    public static Employee getEmployeeById(int id) {
        for (Employee employee : employeeCard) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}




















