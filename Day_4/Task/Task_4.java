import java.util.*;
class Task_4
{    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        if(num1 > num2)
            System.out.println("Largest number: "+num1);
        else if(num1 < num2)
            System.out.println("Largest number: "+num2);
        else
            System.out.println("Both numbers are Equal");
    } }