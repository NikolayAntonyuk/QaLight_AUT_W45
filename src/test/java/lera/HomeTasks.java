package lera;

public class HomeTasks {
    public void whileTask(int a, int b) {
        int c = a * b;
        System.out.println("c = " + c);
        if (c == 100) {
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    c = a / b;
                    System.out.println(i + ". " + a + "/" + b + "=" + c);

                } else {
                    int r = c / b;
                    System.out.println(i + ". " + c + "/" + b + "=" + r);
                }

            }

        } else {
            System.out.println("The result of multiplying the parameters by each other is NOT 100, the cycle will not" +
                    " be started");
        }
    }
}
