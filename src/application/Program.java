package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = key.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the number: ");
            num[i] = key.nextInt();
        }

        System.out.println();
        System.out.println("Negatives Numbers");
        for (Integer numbers : num) {
            if (numbers < 0) {
                System.out.println(numbers);
            }
        }

    }
}
