package metods;

import java.util.Scanner;

public class Metods {
    static Scanner num = new Scanner(System.in);

    public static void PrintThreeWords() {
        String[] words = {"Orange", "Banana", "Apple"};
        String text = "";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                text = text + words[i];
            } else {
                text = text + words[i] + "\n";
            }


        }
        System.out.println(text);
    }

    public static void CheckSumSign() {
        System.out.println("Введіть перше число");
        int a = num.nextInt();
        System.out.println("Введіть друге число");
        int b = num.nextInt();

        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void PrintColor() {
        System.out.println("зараз необхідно буде ввести число, щоб отримати колір");
        int numColor = num.nextInt();
        ;

        if (numColor <= 0) {
            System.out.println("Червоний");
        } else if (numColor > 0 && numColor <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void СompareNumbers() {
        System.out.println("зараз необхідно буде ввести число, щоб перевірили яке з них більше");
        System.out.println("Введіть число a");
        int a = num.nextInt();
        System.out.println("Введіть число b");
        int b = num.nextInt();

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void CheckingForIntegers() {
        System.out.println("зараз необхідно буде ввести число, щоб перевірили сумму");
        System.out.println("Введіть число a");
        int a = num.nextInt();
        System.out.println("Введіть число b");
        int b = num.nextInt();

        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void PositiveOrNot() {
        System.out.println("зараз необхідно буде ввести число, щоб перевірити яке число додатнє або від’ємне");
        System.out.println("Введіть число ");
        int a = num.nextInt();

        if (a > 0) {
            System.out.println("число додатнє");
        } else if (a == 0) {
            System.out.println("число позитивне");
        } else {
            System.out.println("число від’ємне");
        }

    }

    public static void PositiveNumber() {
        System.out.println("зараз необхідно буде ввести число, щоб перевірити яке воно позитивне чи ні");
        System.out.println("Введіть число ");
        int a = num.nextInt();

        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void CounterWords() {
        System.out.println("зараз необхідно буде ввести число, щоб ми могли стільки повторити слово");
        System.out.println("Введіть число");
        int a = num.nextInt();
        System.out.println("Введіть слово");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String texted = "";
        for (int i = 1; i <= a; i++) {
            texted = texted + line + "\n";
        }
        System.out.println(texted);
    }

    public static void LeapYear() {
        System.out.println("Введіть рік");
        int a = num.nextInt();
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("високосний рік");
        }else{
            System.out.println("Цей рік  ні є високосним");
        }
    }


}

/*
Если год делится на 4 без остатка, перейдите   на шаг 2. В противном случае перейдите к выполнению действия 5.
Если год делится на 100 без остатка, перейдите на шаг 3. В противном случае перейдите к выполнению действия 4.
Если год делится на 400 без остатка, перейдите на шаг 4. В противном случае перейдите к выполнению действия 5.
Год високосный (366 дней).
Год не високосный год (365 дней).
 */
