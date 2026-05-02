import java.util.Arrays;
class Arr{
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
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(a)); //to print without for loop
    }
}