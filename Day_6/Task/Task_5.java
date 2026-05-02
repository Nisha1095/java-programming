import java.util.Scanner;
class Task_5
{
    public static void main(String[] args) {
        String[] arr = {"","",""};
        Scanner s = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
           System.out.print("Enter Task"+(i+1)+":");
           arr[i] = s.nextLine();
        }
        System.out.println("Your to-do-list");
        for(int i=0;i<3;i++)
        {
            System.out.println((i+1)+")"+arr[i]);
        }
    } }