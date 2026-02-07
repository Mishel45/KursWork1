import java.util.Arrays;

public class EmployeeBook {
    public static Employee[] employeeCard;

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

    public double[] calculateTax(String taxSystem) {
        double[] result = new double[employeeCard.length];
        double tax = 0;
        int i = 0;
        for (Employee employee : employeeCard) {
            if (employee == null) {
                break;
            } else {
                switch (taxSystem) {
                    case "PROPORTIONAL":
                        tax = employee.getSalary() * 13 / 100;
                        result[i] = tax;
                        i++;
                        break;
                    case "PROGRESSIVE":
                        if (employee.getSalary() < 150 && employee.getSalary() > 0) {
                            tax = employee.getSalary() * 13 / 100;
                            result[i] = tax;
                            i++;
                        } else if (employee.getSalary() < 350 && employee.getSalary() >= 150) {
                            tax = employee.getSalary() * 17 / 100;
                            result[i] = tax;
                            i++;
                        } else if (employee.getSalary() >= 350) {
                            tax = employee.getSalary() * 21 / 100;
                            result[i] = tax;
                            i++;
                        }
                        break;
                }
            }
        }
        return result;
    }

    public void increaseSalary(int bonusSalary, int bonusDepartmentNumber) {
        for (Employee employee : employeeCard) {
            if (employee == null) {
                break;
            } else {
                if (employee.getDepartmentNumber() != bonusDepartmentNumber) {
                    continue;
                } else {
                    employee.setSalary(employee.getSalary() + (employee.getSalary() * bonusSalary) / 100);
                }
            }
        }
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
                            + employee.getDepartmentNumber() + " зарплата больше " + salaryFigure + " рублей.";
                }
            }
        }
        return "";
    }

    public static String[] salaryLess(int wage, int employeeNumber) {
        String[] result = new String[employeeNumber];
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
                    result[count] = employee.getLastFirstName();
                    count++;
                }
            }
            i++;
        }
        System.out.println("Вот первые " + employeeNumber + " сотрудника(ов), имеющих зарплату меньше "
                + wage + " рублей." + Arrays.toString(result));
        return result;
    }

    public static boolean isEmployeeInArray(Employee employeeToCheck) {
        for (Employee employee : employeeCard) {
            if (employee != null && employee.equals(employeeToCheck)) {
                System.out.println("Сравниваем " + employee + " и " + employeeToCheck);
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

