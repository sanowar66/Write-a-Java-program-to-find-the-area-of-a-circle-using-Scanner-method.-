import java.util.Scanner;
class AreaCircle{
  public static void main(String args[])
  {
     Scanner input=new Scanner(System.in);
        double area,r;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        r = input.nextFloat();
        area = 3.1416 * r * r;
        System.out.println("Area of circle: "+area);
  }  
}