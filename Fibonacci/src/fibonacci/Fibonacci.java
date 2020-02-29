
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Durjoy
 */
public class Fibonacci {

    public static void main(String[] args) {
         Scanner input  = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers you want to see ? ");
        int range = input.nextInt();
        if ( range == 1 ) System.out.println("0");
        else if ( range == 2) System.out.println("0 1");
        else {
            System.out.print("0 1 ");
            printfb(range- 2,0,1);
        }
    }
    public static void printfb(int i,int a,int b) {
        int fibo ;
        if ( i == 0) {
            System.out.println("");
            return ;
        }
        else {
            fibo = a + b ;
            System.out.print(fibo + " ");
            a = b ;
            b = fibo ;
            printfb(i-1,a,b);
        }
    }
    }
    

