
  //W.A.P to accept roll number & percentage from the user & display it on the screen

  import java.util.Scanner;

  class RollPer
  {
     public static void main(String[] args)
     {
        int rollno;
        double per;

        Scanner sc;
        sc=new Scanner(System.in);
        //Scanner sc=new Scanner(System.in);

        System.out.println("Enter your roll number ");
        rollno=sc.nextInt();   

        System.out.println("Enter your percentage ");
        per=sc.nextDouble();

        System.out.println("Your roll number is "+rollno);
        System.out.println("Your percentage is "+per);
      } //end of main()
  }//end of class

        

            
 