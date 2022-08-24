package Exception_;
//Q2.WAP to use catch / handle the ArrayIndexOutOfBoundsException.

import java.util.Scanner;

public class ExampleOfTryCatchblock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int arr[] = new int[5];
            int i;

            System.out.println("Enter the element");
            for (i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("last element " + arr[11]);
            }
        catch(Exception e)
        {
            System.out.println("plz check code carefully....");
            System.out.println(e);
        }

    }
}


 /*   Enter the element
        1
        2
        3
        4
        a
        plz check code carefully....
        java.util.InputMismatchException
*/