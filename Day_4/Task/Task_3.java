import java.util.*;
class Task_3
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mark = s.nextInt();
        if(mark >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}