class a203
{
public static void main(String args[]){
float length = 23f;
float breadth = 20f;

float r = 3.4f;
float base = 13.5f;
float height = 23.2f;
float area_Rectangle = length*breadth;
float area_Circle = (float)Math.PI * r *r;
float area_Triangle = 0.5f*base*height;

System.out.println("displaying the output");
System.out.println("Area of rectangle "+area_Rectangle);
System.out.println("Area of Circle "+area_Circle);
System.out.printf("Area pf triangle is %.2f",area_Triangle);
}
}