import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        callMyself(1);
        //sumOffAllNumbersIteration();
        //System.out.println("Suma "+sumOfAllNumbers(3));
    }
    /* The recursive Java method */
    public static void callMyself(int i) {
        if (i < 0) {
            System.out.println("BlynasBASE "+ i);
            return;
        }
        System.out.println("BlynasIN "+i);
        i = i - 1;
        callMyself(i);
        System.out.println("BlynasOUT "+i);
      }

    public static void sumOffAllNumbersIteration(){
        //Scanner keyboard = new Scanner(System.in);
        //System.out.println("Enter a positive integer");
        //int num = keyboard.nextInt();
        int num = 2;
        int total = 0;
        for (int x=1;x <= num;x++) {
            total = total + x;
            System.out.println("Tarpinis " +total);
        }
        System.out.println("Suma " +total);
    }

    /* A recursive Java example to sum all natural numbers up to a given long. */
    public static long sumOfAllNumbers(long number) {
        /* Stop the recursive Java program at zero */
        if (number != 0) {
            return number + sumOfAllNumbers(number - 1);
        } else {
            return number;
        }
    }
}