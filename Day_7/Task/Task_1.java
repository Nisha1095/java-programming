import java.util.Scanner;
class Task_1
{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner s1 = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i] = s1.nextInt();
        }
        arr[1] = 2;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}