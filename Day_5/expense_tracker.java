import java.util.Scanner;
class expense_tracker
{
    public static void main(String[] args) {
        expense_tracker1 et1 = new expense_tracker1();
        int total = et1.total_expense();
        System.out.println("Total expenses: "+total);
    }
}
class expense_tracker1
{
    int total = 0;
    int expense = 0;
    int choice = 1;
    int total_expense()
    {
       System.out.println("Press 0 to exit or 1 to continue");
       Scanner s = new Scanner(System.in);
        do{ 
            System.out.print("Enter expense name: ");
            String expense_name = s.next();
            s.nextLine();
            System.out.print("Enter expenses: ");
            expense = s.nextInt();
            total += expense;
            System.out.print("Press 0 to exit or 1 to continue: ");
            choice = s.nextInt();
        }while(choice == 1); 
        return total;
    }
}