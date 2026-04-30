import java.util.*;
class Task_5
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age >= 18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible to Vote");
    }
}