package exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        printAsterisksVerticalLine(3);
    }

    private static void printAsterisksVerticalLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }
}
