import java.util.Scanner;
class inputs_in_java
{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a byte value: ");
    byte a = s.nextByte();
    System.out.println("Enter a short value: ");
    short b = s.nextShort();
    System.out.println("Enter a integer value: ");
    int c = s.nextInt();
    System.out.println("Enter a long value(mobile number): ");
    long d = s.nextLong();
    System.out.println("Enter a float value: ");
    float e = s.nextFloat();
    System.out.println("Enter a double value: ");
    double f = s.nextDouble();
    System.out.println("Enter a character value: ");
    char g = s.next().charAt(0);
    System.out.println("Enter a word or string: ");
    String h = s.next();
    s.nextLine();
    System.out.println("Enter a sentence: ");
    String i = s.nextLine();
    System.out.println("Byte Value: "+a);
    System.out.println("Short Value: "+b);
    System.out.println("Integer Value: "+c);
    System.out.println("Long Value: "+d);
    System.out.println("Float Value: "+e);
    System.out.println("Double Value: "+f);
    System.out.println("Character Value: "+g);
    System.out.println("Word: "+h);
    System.out.println("Sentence Value: "+i);
    }
}