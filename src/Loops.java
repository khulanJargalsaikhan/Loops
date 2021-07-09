
import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;

        // 1. Write a program that prints the numbers 1-10.
        for (int i=1; i<11; i++){
            System.out.println(i);
        }
        System.out.println("------------");
        // 2. Write a program that prints the numbers 1-10 backwards.
        for (int i=10; i>0; i--){
            System.out.println(i);
        }
        System.out.println("------------");
        // 3. Write a program that prints all the odd numbers from 1-20.
        for (int i=1; i<=20; i++){
            if (i % 2 != 0)
                System.out.println(i);
        }
        System.out.println("------------");
        // 4. Write a program that prints all the even numbers from 1-20.
        for (int i=1; i<=20; i++){
            if (i % 2 == 0)
                System.out.println(i);
        }
        System.out.println("------------");
        // 5. Have the user input a number and print all numbers from that input value to 1.
        System.out.println("Enter a number");
        int num = input.nextInt();
        num = 1;
        System.out.println(num);
        System.out.println("------------");

        // 6. Sum all values from 1-10.
        for (int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println("Sum all values from 1-10: " + sum);
        System.out.println("------------");

        // 7. Have the user enter a number and print the sum of all numbers from that inputted value to 1.
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter a number");
        int num2 = input.nextInt();
        int total = num1 + num2;
        System.out.println("total of 2 numbers you entered: " + total);
        total = 1;
        System.out.println("After total is assigned to 1: " + total);

        // 8. Write loops to print the following:
        // i)
        int row, col;
        for(row=0; row<5; row++){
            for (col=0; col<5; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ii)
        int i, j, n=5;

        // outer loop to handle number of rows
        // n in this case
        for(i=0; i<n; i++)
        {
            //  inner loop to handle number of columns
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }

        // iii)

        // outer loop to handle number of rows
        for(i=0; i<n; i++) {
            // inner loop to handle number spaces
            for (j = n-i-1; j > 0; j--) {
                // printing spaces
                System.out.print("");
            }
            //  inner loop to handle number of *
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print(" *");
            }
            // ending line after each row
            System.out.println();
        }

        //  8. Factorial of a Number
        System.out.println("Enter a single number to determine the factorial of it: ");
        num = input.nextInt();

        System.out.println("factorial of " + num + " is: " + findFactorial(num));



    }

    public static int findFactorial(int num){
        if (num == 0)
            return 1;
        else
            return num * findFactorial(num - 1);
    }
}
