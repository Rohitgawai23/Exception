package Exeception_in_java;

public class try_catch_block {

    public static void disp(int a, int b)
    {
        System.out.println("Result :"+(a/b));
    }
    public static void main(String[] args) {
        try {
            disp(4, 0);
        }
        catch(Exception e)
        {
            System.out.println("not allowed to divied by zero :");
        }


    }
}
