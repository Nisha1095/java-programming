import java.util.Scanner;
class sin_cos_tan
{
    public static void main(String[] args) {
      Scanner s1 = new Scanner(System.in);
      // Sine Value
      System.out.print("Enter angle value for sine: ");
      double sin_angle = s1.nextDouble();
      double sin_radian = Math.toRadians(sin_angle);
      System.out.println("Sine value: "+Math.sin(sin_radian));

      // Cosine Value
      System.out.print("Enter angle value for cosine: ");
      double cos_angle = s1.nextDouble();
      double cos_radian = Math.toRadians(cos_angle);
      System.out.println("Cosine value: "+Math.cos(cos_radian));

      // Tangent Value
      System.out.print("Enter angle value for tangent: ");
      double tan_angle = s1.nextDouble();
      double tan_radian = Math.toRadians(tan_angle);
      System.out.println("Tangent value: "+Math.tan(tan_radian)); 
    }
}