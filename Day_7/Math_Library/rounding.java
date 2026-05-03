import java.util.Scanner;
class rounding
{
    public static void main(String[] args) {
      Scanner s1 = new Scanner(System.in);
      // Ceil
      System.out.print("Enter a whole number: ");
      int num1 = s1.nextInt();
      System.out.print("Enter a float number: ");
      float num2 = s1.nextFloat();
      // Round up
      System.out.println("Ceil Value of whole number: "+Math.ceil(num1));
      System.out.println("Ceil Value of float number: "+Math.ceil(num2));
      // Round down
      System.out.println("Floor Value of whole number: "+Math.floor(num1));
      System.out.println("Floor Value of float number: "+Math.floor(num2));

      //Rounds to nearest integer
      System.out.println("RoundOff Value of whole number: "+Math.round(num1));
      System.out.println("RoundOff Value of float number: "+Math.round(num2));
    }
}