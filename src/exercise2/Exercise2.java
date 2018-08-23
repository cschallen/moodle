package exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        printSomeAsterisks(8);
    }

    private static void printSomeAsterisks(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
}
