import java.util.Scanner;
class basic_arithmetic
{
    public static void main(String[] args) {
      Scanner s1 = new Scanner(System.in);
      System.out.print("Enter integer num1: ");
      int num1 = s1.nextInt();
      System.out.print("Enter integer num2: ");
      int num2 = s1.nextInt();
      System.out.println("Minimum value: "+Math.min(num1,num2)); 
      System.out.println("Minimum value: "+Math.max(num1,num2)); 
      System.out.print("Enter float num1: ");
      float num3 = s1.nextFloat();
      System.out.print("Enter float num2: ");
      float num4 = s1.nextFloat();
      System.out.println("Minimum value: "+Math.min(num3,num4)); 
      System.out.println("Minimum value: "+Math.max(num3,num4));
      System.out.print("Enter a negative number: ");
      int num5 = s1.nextInt();
      System.out.println("Absolute value: "+Math.abs(num5));
      
    }
}