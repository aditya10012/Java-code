class a202
{
public static void main(String args[]){
String name = "Aditya choudhary";
System.out.println("your name is :"+name);
int cAge = 25;
int pAge=0;
int nAge=0;

name = "Rahul";


int diff = cAge%10;
pAge = cAge - diff;

int diff2 = cAge/10;
nAge = cAge + diff2;

System.out.println("the current name is "+name);
System.out.println("the current age is "+cAge);
System.out.println("the previous age is "+pAge);
System.out.println("the next age is "+ nAge);

}
}