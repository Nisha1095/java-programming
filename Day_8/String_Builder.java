import java.util.Scanner;
class String_Builder{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String firstName = s1.nextLine();
        String city = s1.nextLine();
        String hobby = s1.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" FROM ");
        sb.append(city);
        sb.append(" LOVES ");
        sb.append(hobby);
        // Convert the entire sentence to uppercase and print
        String result = sb.toString().toUpperCase();
        System.out.println(result); } 
        }
