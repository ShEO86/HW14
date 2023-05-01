import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        System.out.println(staff);
        while (true) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Выберете команду:\n 1 - Сиписок всех сотрудников.\n 2 - Нанять нового сотрудника.\n " +
                    "3 - Уволить сотрудника.\n 4 - Средняя зарплата сотрудников.\n " +
                    "5 - Минимальная зарплата среди сотрудников.\n 6 - Максимальная зарплата среди сотрудников.\n " +
                    "7 - Общий расход на зарплату сотрудников.\n 8 - Колличество сотрудников.\n " +
                    "0 - Выход.");
            if (scanner.hasNextInt()) {
                switch (scanner.next()) {
                    case "1":
                        System.out.println(staff);
                        continue;
                    case "2":
                        System.out.print("Введите данные сотрудника.\n###Фамилия: ");
                        Scanner scanner1 = new Scanner(System.in).useLocale(Locale.US);
                        String lastName = scanner1.nextLine();
                        System.out.print("###Имя: ");
                        String firstName = scanner1.nextLine();
                        System.out.print("###Отчество: ");
                        String middleName = scanner1.nextLine();
                        int department;
                        System.out.print("###Номер департамента: ");
                        if (scanner1.hasNextInt()) {
                            department = scanner1.nextInt();
                        } else {
                            System.out.println("Введите корректный номер департамента");
                            scanner1.close();
                            continue;
                        }
                        double salary;
                        System.out.print("###Заработная плата: ");
                        if (scanner1.hasNextInt()) {
                            salary = scanner1.nextDouble();
                        } else {
                            System.out.println("Введите корректную заработную плату сотрудника");
                            scanner1.close();
                            continue;
                        }
                        staff.addEmploye(lastName, firstName, middleName, department, salary);
                        scanner1.close();
                        break;
                    case "3":
                        System.out.print("Введите данные сотрудника.\n###Фамилия: ");
                        Scanner scanner2 = new Scanner(System.in);
                        String lastNameDismiss = scanner2.nextLine();
                        System.out.print("###Имя: ");
                        String firstNameDismiss = scanner2.nextLine();
                        System.out.print("###Отчество: ");
                        String middleNameDismiss = scanner2.nextLine();
                        staff.dismissEmploye(lastNameDismiss, firstNameDismiss, middleNameDismiss);
                        scanner2.close();
                        break;
                    case "4":
                        staff.getAverageSalary();
                        continue;
                    case "5":
                        staff.getMinSalary();
                        continue;
                    case "6":
                        staff.getMaxSalary();
                        continue;
                    case "7":
                        staff.getTotalSalary();
                        continue;
                    case "8":
                        staff.printStaffCount();
                        continue;
                    case "0":
                        System.out.println("Выход из программы");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Такого пункта меню не существует");
                        break;
                }
                scanner.close();
            } else {

                System.out.println("Введено не допустимое значение");
                break;
            }

        }
    }
}

