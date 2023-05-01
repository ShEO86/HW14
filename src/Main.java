import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        System.out.println(staff);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        while (scanner.nextInt() != 0) {
            System.out.println("Выберете команду:\n 1 - Сиписок всех сотрудников.\n 2 - Нанять нового сотрудника.\n " +
                    "3 - Уволить сотрудника.\n 4 - Средняя зарплата сотрудников" +
                    "5 - Минимальная зарплата среди сотрудников.\n 6 - Максимальная зарплата среди сотрудников");
            switch (scanner) {
                case
            }
            System.out.println("Введите данные сотрудник");
            staff.addEmploye(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
            scanner.close();
            System.out.println("staff = " + staff);
        }


    }
}
