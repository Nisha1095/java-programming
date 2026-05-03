import java.util.Scanner;
class exponent_root
{
    public static void main(String[] args) {
      Scanner s1 = new Scanner(System.in);
      // Exponent
      System.out.print("Enter the base number: ");
      int base = s1.nextInt();
      System.out.print("Enter the exponent number: ");
      int exp = s1.nextInt();
      System.out.println("Exponent Value: "+Math.pow(base,exp));

      //Square Root
      System.out.print("Enter the number to find square root: ");
      int num1 = s1.nextInt();
      System.out.print("Square root: "+Math.sqrt(num1));

      //Cube Root
      System.out.print("Enter the number to find cube root: ");
      int num2 = s1.nextInt();
      System.out.print("Square root: "+Math.cbrt(num1));
    }
}