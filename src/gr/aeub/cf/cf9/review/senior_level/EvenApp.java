package gr.aeub.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * This program calculates
 */
public class EvenApp {
    public static void main(String[] args) {
        //dilosi kai arxikopoiisi metavliton
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        //eisodos dedomenon , validation kai data binding
        System.out.println("Please enter a number");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        //epixeirisiaki logiki - parastaseis
        result = isEven(num);

        //ektuposi apotelesmatos
        System.out.println("The number is even : " + result);
    }
    /** checks if a number is even
     * @param num  the number to check
     * @return true if the number is even ,false otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}


