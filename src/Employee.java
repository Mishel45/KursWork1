public class Employee {
    public String getLastFirstName;
    private String lastFirstName;
    private int departmentNumber;
    private int salary;
    private int idCont = 0;
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

    public int getSalary() {
        return this.salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int i) {
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


