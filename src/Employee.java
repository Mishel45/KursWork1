public class Employee {

    public double setSalary;
    private String lastFirstName;
    private int departmentNumber;
    private double salary;
    private static int idCont = 0;
    private int id;


    public Employee(String lastFirstName, int departmentNumber, int salary) {
        this.lastFirstName = lastFirstName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = ++idCont;
    }

    public int getId() {
        return id;
    }

    public String getLastFirstName() {
        return this.lastFirstName;
    }

    public int getDepartmentNumber() {
        return this.departmentNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Сотрудник " + lastFirstName + " Номер отдела: " + departmentNumber + " Зарплата: "
                + salary + " рублей.";
    }

    public String printShortInfo() {
        System.out.println("Сотрудник " + lastFirstName + " Зарплата: " + salary);
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }
}


