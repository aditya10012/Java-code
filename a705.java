
import java.util.Scanner;
class a705{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the value of n : ");
     float n = sc.nextFloat();
     float sum=0,i;
     for(i=1;i<=n;++i)
      {
         sum = sum + (1/i);
         System.out.print("1/"+i+" + ");
      }
      System.out.print(" = " + sum);

   }
}