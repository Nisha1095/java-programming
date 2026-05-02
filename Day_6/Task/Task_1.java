import java.util.Scanner;
class Task_1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if(str.length() >= 5)
            System.out.println("Long");
        else
            System.out.println("Short");
    }
}