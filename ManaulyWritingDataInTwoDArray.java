package javaapplication22;

import java.util.Scanner;

public class ManaulyWritingDataInTwoDArray {
    //public static final String NAME = "Rajesh";
    //public static final int EMPLOYEE_ID = 1234;
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] myarray = new int[4][7];
        // 4 1-D arrays with 7 Elements each
        
        for(int a = 0; a<4; a++)
        {
            for(int e = 0; e<7; e++) 
            {
                myarray[a][e] = 3*a+2*e;
                System.out.print(myarray[a][e]+"  ");
            }
            System.out.println();
        }
        
        System.out.println("myarray[1][3]: " +myarray[1][3]);
        
        System.out.println(myarray[3][5]);
        
//        int i = 1, j = 1;
//        for(;i<=5;)
//        {    
//            System.out.print(i);
//            if(i==j)
//            {
//                j=0;
//                System.out.println(" ");
//                i++;
//            }
//            j++;
//        }
    }
}
