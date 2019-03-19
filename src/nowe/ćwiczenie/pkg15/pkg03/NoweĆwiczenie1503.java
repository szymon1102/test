
package nowe.ćwiczenie.pkg15.pkg03;
import java.util.Scanner;

public class NoweĆwiczenie1503 {

    
    public static void main(String[] args) {
     
//     Scanner input = new Scanner(System.in);
//        System.out.println("Input first numer");
//        int a = input.nextInt();
//        System.out.println("Your number is: "+a );
//        System.out.println("input second number");
//        int b = input.nextInt();
//        System.out.println("Your secon namber is: "+b);
//        int c =a+b;
//        System.out.println("The sum of this numbers is : "+ c);
//        



//        int[] b = {20,30,40,50,150,147,220};
//        
//        int larg = 0;
//        for(int i=0; i<b.length;i++)
//        {
//            larg=b[0];
//            if (larg<b[i])
//            {
//                larg=b[i];
//            }
//     
//        }
//        System.out.println("The largest number in arrow is: "+larg);
        


//int[] a ={1,3,5};
//int[] b={5,6,7};
//
//for(int i=0;i<a.length;i++)
//{
//    int c=a[i];
//    int d=b[i];
//    int z= c*d;
//    
//    System.out.print(z); 
//    }:
       
        
 String[] a= {"jeden","dwa","trzy"};     
  
 for(int i =0;i<a.length;i++)
 {
     int shortest =a[0].length();
     if (a[i].length()<shortest)
     {
         shortest=a[i].length();
        System.out.println(a[i]);
     }
           
 }
  
    
}
  
  
}
