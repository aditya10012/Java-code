

import java.util.Scanner;
class a706{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the value of x : ");
     double x = sc.nextDouble();
     System.out.print("Enter the value of n : ");
     int n = sc.nextInt();
     double sum=0.0,i;
     for(i=0;i<=n;++i)
      {
         sum = sum + (1/Math.pow(x,i));
         System.out.print("1/"+x+"^"+i+" + ");
      }
      System.out.print(" = " + sum);

   }
}