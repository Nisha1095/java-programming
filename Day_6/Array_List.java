import java.util.ArrayList;
import java.util.Collections;
class Array_List
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(44);
        System.out.println(arr);
        arr.set(2,4);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        arr.contains(5);
        System.out.println(arr.contains(5));
        System.out.println(arr.contains(2));
    }
}