package task1;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int current = 1;
        System.out.print("Path: ");
        do {
            System.out.print(current);
            current = (current + m - 2) % n + 1;
        } while (current != 1);
    }
}
