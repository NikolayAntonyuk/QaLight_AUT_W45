package sasha.homework;

/*                                                      Задача №3
  Написать метод с параметрами и проверкой в теле, что если результат умножения параметров друг на друга равняется 100,
то запустить цикл с 5 итерациями, в которых в первой итерации выводится результат деления первого параметра на второй,
а в остальных итерациях результат деления результата с первой итерации на второй параметр. Если результат умножения
параметров друг на друга НЕ равняется 100, то выводить в консоль сообщение, что цикл запущен не будет. */

public class Task3 {
    public static void main(String[] args) {
        checkMultiplication(25, 4);
        checkMultiplication(30, 57);
    }

    public static void checkMultiplication(double a, double b) {
        if (a * b == 100) {
            System.out.println("\n" + a + " * " + b + " = 100\nЗапускаю цикл:");
            double resultFromFirstLoop = 0;
            for (int i = 1; i <= 5; i++) {
                switch (i) {
                    case 1:
                        resultFromFirstLoop = a / b;
                        System.out.println("1) " + resultFromFirstLoop);
                        break;
                    case 2:
                        System.out.println("2) " + resultFromFirstLoop / b);
                        break;
                    case 3:
                        System.out.println("3) " + resultFromFirstLoop / b);
                        break;
                    case 4:
                        System.out.println("4) " + resultFromFirstLoop / b);
                        break;
                    case 5:
                        System.out.println("5) " + resultFromFirstLoop / b);
                        break;
                }
            }
        } else {
            System.out.println("\n" + a + " * " + b + " != 100\nЦикл запущен не будет");
        }
    }

}
