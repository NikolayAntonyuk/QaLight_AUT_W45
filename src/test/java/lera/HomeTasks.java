package lera;

public class HomeTasks {
    public void whileTask(int a, int b) {
        int c = a * b;
        System.out.println("c = " + c);
        if (c == 100) {
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    c = a / b;
                    System.out.println(i + ". "+ a + "/" + b + "=" + c);

                } else {
                    int r = c / b;
                    System.out.println(i + ". " + c + "/" + b + "=" + r);
                }

            }

        } else {
            System.out.println("Результат умножения параметров друг на друга НЕ равняется 100, цикл запущен не будет");
        }
    }
}
