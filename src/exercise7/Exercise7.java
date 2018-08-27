package exercise7;

public class Exercise7 {
    public static void main(String[] args) {
      drawDiamondWithName(3);
    }

    private static void drawDiamondWithName(int number) {
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
            if (i != biggest) {
                printAsterisks(i);
            } else {
                System.out.println("Carlos");
            }
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