package exercise6;

public class Exercise6 {
    public static void main(String[] args) {
      drawDiamond(10);
    }

    private static void drawDiamond(int number) {
        printTriangle(0, number);
        printTriangle(number, 0);
    }

    public static void printTriangle(int start, int end) {
        boolean increment = true;
        int biggest = start > end ? start : end;
        if(start > end){
            increment = false;
        }
        for (int i = start; i != end;) {
            i = calculateIndex(i, increment);
            printSpaces(biggest, i);
            printAsterisks(i);
        }
    }

    public static void printAsterisks(int quantity) {
        quantity = quantity * 2 - 1;
        for (int i = 0; i < quantity; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static int calculateIndex(int index, boolean increment) {
        int result = increment ? index + 1 : index - 1;
        return result;
    }

    private static void printSpaces(int number, int i) {
        int spaces = number - i;
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
    }
}