package db;

public class PrintStar {

    public static void main(String[] args) {
        final int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}

