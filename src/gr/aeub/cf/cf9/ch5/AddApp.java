package gr.aeub.cf.cf9.ch5;

/**
 * demo of addition method
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        sum = AddApp.add (num1 , num2 );

        System.out.println("Sum = " + sum);
    }
    public static int add(int a , int b){
       /* //dilosi kai arkikopoiish
        int sum = 0;

        // epexergasia dedomenon eisodou
        sum = a + b ;

        // epistrofi apotelesmatos
        return sum ; */

        return a + b;

    }
}
