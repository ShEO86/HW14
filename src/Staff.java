import java.util.Arrays;

public class Staff {
    private final Employee[] employees;
    private int size;
    public Staff() {
        this.employees = new Employee[10];
    }
    public void addEmploye(String lastName, String firstName, String middleName, int department, double salary) {
        if (size < employees.length) {
            Employee newEmploye = new Employee(lastName, firstName, middleName, department, salary);
            employees[size++] = newEmploye;
        } else {
            System.out.println("Штат сотрудников набран");
        }
    }
/*    public void printAllStaff() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees.toString());
        }
    }*/

    @Override
    public String toString() {
        return "Staff{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

    public void printStaffCount() {
        if (staffIsEmpty(employees)) {
            System.out.println("В штате сейчас нет ни одного сотруника");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    System.out.println("Количество сотрудников в штате равно: " + size);
                    break;
                }
                System.out.println("Количество сотрудников в штате равно: 10");
                break;
            }
        }
    }
    public void getTotalSalary() {
        if (staffIsEmpty(employees)) {
            System.out.println("В штате сейчас нет ни одного сотруника");
        } else {
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            } else System.out.println("Суммарная зарплата всех сотрудников равна: " + totalSalary);
        }
        }
    }
    public void getMaxSalary() {
        if (staffIsEmpty(employees)) {
            System.out.println("В штате сейчас нет ни одного сотруника");
        } else {
            int i = 0;
            while (i < employees.length) {
                if (employees[i] != null) {
                    i++;
                } else break;
            }
            double[] maxSalary = new double[i];
            for (int x = 0; x < maxSalary.length; x++) {
                maxSalary[x] = employees[x].getSalary();
            }
            System.out.println("Максимальная зарплата среди сотрудников равна: " + Arrays.stream(maxSalary).max());
        }
    }
    public void getMinSalary() {
        if (staffIsEmpty(employees)) {
            System.out.println("В штате сейчас нет ни одного сотруника");
        } else {
            int i = 0;
            while (i < employees.length) {
                if (employees[i] != null) {
                    i++;
                } else break;
            }
            double[] minSalary = new double[i];
            for (int x = 0; x < minSalary.length; x++) {
                minSalary[x] = employees[x].getSalary();
            }
            System.out.println("Максимальная зарплата среди сотрудников равна: " + Arrays.stream(minSalary).max());
        }
    }
    public void dismissEmploye(String firstName, String lastName, String middleName) {
        if (staffIsEmpty(employees)) {
            System.out.println("В штате сейчас нет ни одного сотруника");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getFirstName().equals(firstName) && employees[i].getLastName().equals(lastName) && employees[i].getMiddleName().equals(middleName)) {
                    System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                    employees[size - 1] = null;
                    size--;
                    System.out.print("Сотрудник уволен");
                }
                System.out.println("Сотрудник с указанным ФИО не найден.");
            }
        }
    }
    private boolean staffIsEmpty(Employee[] employees) {
        if (employees[0] == null) {
            return true;
        }
        return false;
    }
    public void getAverageSalary() {
        if (staffIsEmpty(employees)) {
            System.out.println("В штате сейчас нет ни одного сотруника");
        } else {
            int i = 0;
            while (i < employees.length) {
                if (employees[i] != null) {
                    i++;
                } else break;
            }
            double[] averageSalary = new double[i];
            for (int x = 0; x < averageSalary.length; x++) {
                averageSalary[x] = employees[x].getSalary();
            }
            System.out.println("Максимальная зарплата среди сотрудников равна: " + Arrays.stream(averageSalary).average());

        }
    }

}
