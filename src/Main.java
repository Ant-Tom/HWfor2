
public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int moneyMonth = 15000;
        double interestRate = 12.0;
        int dreamSum = 2459000;
        double savings = 0;
        int month = 1;

        while (savings < dreamSum) {
            double monthRate = interestRate / 1200;
            savings *= (1 + monthRate);
            savings += moneyMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n", month, savings);
            month++;
        }
        System.out.println("Цель достигнута! Вам потребовалось " + (month - 1) + " месяцев.");

        System.out.println("Task 2");

        int number = 1;

        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 3");

        int human = 12000000;
        double birthRate = 17;
        double deathRate = 8;
        int forecastYear = 10;

        for (int year = 1; year <= forecastYear; year++) {
            int birth = (int) (birthRate * human / 1000); // рост населения
            int death = (int) (deathRate * human / 1000); // смертность
            int humanYear = human + birth - death;
            System.out.printf("Год %d, численность населения составляет %d.\n", year, humanYear);
        }
        System.out.println("Task 4");

        double startSum = 15000;
        double dream = 12000000;
        double bank = 0.07;
        int oneMonth = 1;

        while (startSum < dream) {
            startSum *= (1 + bank);
            System.out.printf("Месяц %d, сумма накоплений: %.2f рублей.\n", oneMonth, startSum);
            oneMonth++;
        }

        System.out.println("Task 5");

        double sum = 15000;
        double targetSum = 12000000;
        double rate = 0.07;
        int forMonth = 1;

        while (sum < targetSum) {
            sum *= (1 + rate);
            if (forMonth % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений: %.2f рублей.\n", forMonth, sum);
            }
            forMonth++;
        }
        System.out.println("Цель достигнута! Вам потребовалось " + (forMonth - 1) + " месяцев.");

        System.out.println("Task 6");

        double sumVasilia = 15000;
        double targetVasilia = 0.07;
        int monthTheYear = 12;
        int acumulation = 9;
        int oneMonthVasilia = 1;
        while (oneMonthVasilia <= acumulation * monthTheYear) {
            sumVasilia *= (1 + targetVasilia);
            if (oneMonthVasilia % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений: %.2f рублей.\n", oneMonthVasilia, sumVasilia);
            }
            oneMonthVasilia++;
        }
        System.out.println("Task 7");

        for (int day = 2; day < 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Task 8");

        for (int year = 2024 - 200; year < 2024 + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        System.out.println("End");
    }
}

