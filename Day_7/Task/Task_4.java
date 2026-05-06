import java.util.Arrays;
class Task_4{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = new int[5];
        System.arraycopy(a, 0, b, 0, 5);         // Copy using arraycopy()
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println("");
        int c[] = a.clone();                  //copy using clone()
        System.out.println(Arrays.toString(c)); //to print without for loop
        int d[] = Arrays.copyOf(a, 5);              //copy using copyOf()
        System.out.println(Arrays.toString(d)); //to print without for loop     
    }
}