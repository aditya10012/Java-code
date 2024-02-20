

import java.util.Scanner;
class a707{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the value of n : ");
     int n = sc.nextInt();
     double sum=0.0,i;
     for(i=1;i<=n;++i)
      {
         sum = sum + (1/i*(i-1));
         System.out.print("1/"+i+"!"+" + ");
      }
      System.out.print(" = " + sum);

   }
}