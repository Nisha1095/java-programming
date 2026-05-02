import java.util.Scanner;
class Task_3
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if(str.startsWith("Java"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}