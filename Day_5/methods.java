import java.util.Scanner;
class methods{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter your Task: ");
       String str = s.nextLine();
       to_do_list t1 = new to_do_list();
        t1.todo(str);
    }
}
class to_do_list
{
    void todo(String str)
    {
        if(str.isBlank()){
            System.out.println("Please enter a valid task");
            return;
        }
        else
            System.out.println("The task you entered is "+str);
        System.out.println("Thank you for entering your task");
    }
}