package exercise9;

import java.util.ArrayList;

public class Exercise9 {
    public static void main(String[] args) {
      generate(30);
    }

    public static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if((isPrimeNumber(i)) && (n % i == 0)){
                numbers.add(i);
            }
        }

        return numbers;
    }

    public static boolean isPrimeNumber(int number) {
        if ((number == 2) || (number == 3)){
            return true;
        } else if((number % 2 == 0) || (number % 3 == 0) || (number == 1)){
            return false;
        }

        int i = 5;
        int j = 2;

        while (i * i <= number) {
            if (number % i == 0){
                return false;
            }

            i += j;
            j = 6 - j;

        }
        return true;
    }

}