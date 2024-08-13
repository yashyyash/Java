
/* 
    W.A.P to accept a month number from the user & display the name of the season

    Month Number                 Season Name
    1,2,11,12                    Winter
    3,4,5,6                      Summer
    7,8,9,10                     Rainy
    Any other value              Wrong input
*/
package dravid;

import java.util.Scanner;


 class SwitchSeason 
 {
     public static void main(String[] args) 
     {
         int month;
         Scanner sc=new Scanner(System.in);
         System.out.print("Ener month number(1 to 12) ");
         month=sc.nextInt();
         
         switch(month)
         {
             case 1 : case 2 : case 11 : case 12 :
                                           System.out.println("Winter Season");
                                           break;
            case 3 : case 4 : case 5 : case 6 :
                                           System.out.println("Summer Season");
                                           break; 
            case 7 : case 8 : case 9 : case 10 :
                                           System.out.println("Rainy Season");
                                           break;
            default :
                       System.out.println("Wrong Input");
         } //end of switch
       }//end of main()
 }
