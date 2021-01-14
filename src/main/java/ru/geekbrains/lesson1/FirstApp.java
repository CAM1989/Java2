package ru.geekbrains.lesson1;
//   1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

public class FirstApp {
    public static void main(String[] args) {
//   2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        // Одиночный символ
        char c = 'A';
        //от –128 до 127
        byte b = 1;
        //от –32768 до 32767
        short Sh = 366;
        //от –214748364 до 2147483647
        int i = 365;
        //от –9223372036854775808 до 9223372036854775807
        long k = 1000000000000000000L;
        //Вещественное число с плавающей точкой
        float Pi = 3.14f;
        //Вещественное число в диапазоне от	1.7е–308 до 1.7е+308
        double D = 3.141592653589793238462643383279;
        //Логическое значение
        boolean res = true;

        System.out.println("\nЗадание №2");
        System.out.println("Буква " + c + " - " + b + "я буква в алфавите");
        System.out.println("Количество дней в году " + i + ", в високосном году " + Sh);
        System.out.println("Значение Пи = " + Pi);
        System.out.println("Значение Пи = " + D);
        System.out.println("Число квинтиллион " + k);
        System.out.println("Ответ " + res);

        //вывод метода printResult3
        System.out.println("\nЗадание №3");
        printResult3(1, 3, 6, 3);

        //вывод результата метода printResult4
        System.out.println("\nЗадание №4");
        System.out.println(printResult4(6, 7)); //true
        System.out.println(printResult4(16, 7)); //false

        //вывод метода printResult5
        System.out.println("\nЗадание №5");
        printResult5(-1);
        printResult5(0);
        printResult5(1);

        //вывод метода printResult6
        System.out.println("\nЗадание №6");
        System.out.println(printResult6(-1));
        System.out.println(printResult6(0));
        System.out.println(printResult6(1));

        //вывод метода printResult7
        System.out.println("\nЗадание №7");
        printResult7("Андрей");

        //вывод метода printResult8
        System.out.println("\nЗадание №8");
        printResult8(2020);
    }

//   3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//   где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static void printResult3(float a, float b, float c, float d) {
        float result;
        // Вычисление выражения: a * (b + (c / d))
        result = (a * (b + c / d));
        System.out.println(result);
    }

//    4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean printResult4(int a, int b) {
        //При выполнение условия что сумма лежит в пределах от 10 до 20 (включительно) возвращает true
        return a + b >= 10 && a + b <= 20;
    }

//    5. Написать метод, которому в качестве параметра передается целое число, метод должен
//    напечатать в консоль, положительное ли число передали или отрицательное. Замечание:
//    ноль считаем положительным числом.

    public static void printResult5(int a) {
        //Проверка на положительное или отрицательное значение числа
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

//    6. Написать метод, которому в качестве параметра передается целое число. Метод должен
//    вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean printResult6(int a) {
        return a < 0;
    }

//    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void printResult7(String a) {
        System.out.println("Привет, " + a + "!");
    }

//    8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в
//    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
//    високосный.

    public static void printResult8(int year) {
        if(year % 4 == 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        } else if (year % 100 == 0) {
            System.out.println("Год " + year + " не високосный");
        } else
            System.out.println("Год " + year + " не високосный");
    }

}

