import java.util.Arrays;
import java.util.Scanner;
class Task_3
{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
       int arr[] = new int[5];
       for(int i=0;i<5;i++)
       {
            arr[i] = s1.nextInt();
       }
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
}
}