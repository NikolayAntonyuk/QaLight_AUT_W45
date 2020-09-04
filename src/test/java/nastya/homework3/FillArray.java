package nastya.homework3;

import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        System.out.println("Please input an one integer for 2d array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = size;

        for (int i = 0; i < size * size; i++) {
            arr[row][col] = i + 1;
            if (--visits == 0) {
                visits = size * (dirChanges % 2) + size * ((dirChanges + 1) % 2) - (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
