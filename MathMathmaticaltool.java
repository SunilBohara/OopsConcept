package javaapplication22;
import java.util.Scanner;
public class MathMathmaticalTool {
   
    public static void main (String args []) 
    {
        Scanner sc = new Scanner(System.in);
        
//        char chars = sc.next().charAt(0);
//        char b = 'a';
          

        System.out.print("Enter the first number for addition - ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the Second number for addition - ");
        int secondNumber  = sc.nextInt();
        int Addition = firstNumber+secondNumber;
        System.out.println("Addition is = " + ++Addition);
        
        System.out.print("Enter the first number for Subtraction - ");
        int s = sc.nextInt();
        System.out.print("Enter the Second number for Subtraction - ");
        int s1 = sc.nextInt();
        int results = s-s1;
        System.out.println("Subtraction is = " + ++results);
        
        System.out.print("Enter the first number for Multiplication - ");
        int m = sc.nextInt();
        System.out.print("Enter the Second number for Multiplication - ");
        int m2 = sc.nextInt();
        int result = m*m2;
        System.out.println("Multiplication is = " + ++result);
        
        System.out.print("Enter the first number for Division - ");
        int d = sc.nextInt();
        System.out.print("Enter the Second number for Division - ");
        int d1 = sc.nextInt();
        int Division = d/d1;
        System.out.println("Division is = " + ++Division);
        
        System.out.print("Enter the first number for Reminder - ");
        int r = sc.nextInt();
        System.out.print("Enter the Second number for Reminder - ");
        int r2 = sc.nextInt();
        int result1 = r%r2;
        System.out.println("(D) Reminder is = " + ++result1);
        

        
//        if(firstNumber==secondNumber)
//        {
//            System.out.println("We cannot take the same number");
//        }
//        else
//        {
//            int Addition = firstNumber+secondNumber;
//            System.out.println(Addition);
//        }

                
        /*obj o = new obj();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of cubesize - ");
        int i = sc.nextInt();
        System.out.print("Enter the heigth of cubesize - ");
        int j = sc.nextInt();
        System.out.print("Enter the breath of cubesize - ");
        int k = sc.nextInt();
        System.out.print("Enter the width of cubesize - ");
        int f = sc.nextInt();

        o.cubeSize(i, j, k, f);
        System.out.println("Your cubetotalsize is - " +o.getcubetotalSize(i, j, k, f));*/
    }
}
