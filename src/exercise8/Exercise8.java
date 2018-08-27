package exercise8;

public class Exercise8 {
    public static void main(String[] args) {
      fizzBuzz(15);
    }

    private static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(correctWord(i));
        }
    }

    public static String correctWord(int number) {
        if((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        } else if(number % 3 == 0) {
            return "Fizz";
        } else if(number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

}