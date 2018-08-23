package exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        drawIsoscelesTriangle(10);
    }

    public static void printAsterisks(int quantity) {
        quantity = quantity * 2 - 1;
        for (int i = 0; i < quantity; i++) {
            System.out.print("*");
        }
    }

    private static void drawIsoscelesTriangle(int number) {
        for (int i = 0; i <= number; i++) {
            printSpaces(number, i);
            printAsterisks(i);
            System.out.println();
        }
    }

    private static void printSpaces(int number, int i) {
        int spaces = number - i;
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
    }
}