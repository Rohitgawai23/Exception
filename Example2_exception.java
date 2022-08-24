package Exception_;

import java.util.Scanner;

public class Example2_exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int arr[] = new int[10];
            int i;
            String s=null;

            System.out.println("Enter the element");
            for (i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("printing element");
            for (i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }

            System.out.println(s.length());
            System.out.println("last element " + arr[11]);
        }
        catch(Exception e)
        {
            System.out.println("plz check code carefully....");
            System.out.println(e);
        }
    }
}


/*
    Enter the element
        1 2 3 4 5 6 7 8 9 0
        printing element
        1
        2
        3
        4
        5
        6
        7
        8
        9
        0
        plz check code carefully....
        java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null*/
