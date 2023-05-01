public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private double salary;
 //   private static int count = 1;


    @Override
    public String toString() {
        return "Сотрудник: \n" + "ФИО: " + lastName + " " + firstName + " " + middleName + ";\n ИД департамента: " + department + ";\n Зарплата: " + salary + "\n";
    }

    public Employee(String lastName, String firstName, String middleName, int department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
