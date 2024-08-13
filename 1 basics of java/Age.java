

    //W.A.P to accept the age of the user & display it on the screen

    import java.util.Scanner;
    //import java.util.*;

    class Age
    {
       public static void main(String[] args)
       {
            Scanner sc;  //object reference of Scanner is created in stack area
            sc=new Scanner(System.in);
            int age; //4 bytes

            System.out.println("Enter your age ");
            age=sc.nextInt();

            System.out.println("Your age is "+age);
        }//end of main()
    } // end of class

            
 