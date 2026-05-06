import java.util.Scanner;
class Task_2
{
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        for(int i=0;i<9;i++)
        {
            if(arr[i] == num)
            {
                System.out.println("Patient ID present");
                return;
            }
        }
        System.out.println("Patient ID not present");
    }
}