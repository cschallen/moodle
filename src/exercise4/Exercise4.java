package exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        drawRightTriangle(3);
    }

    public static void printAsterisks(int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.print("*");
        }
    }

    private static void drawRightTriangle(int number) {
        for (int i = 0; i <= number; i++) {
            printAsterisks(i);
            System.out.println();
        }
    }
}
