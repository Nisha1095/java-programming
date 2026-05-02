import java.util.Scanner;
class Task_4
{
    public static void main(String[] args) {
        expense_tracker et1 = new expense_tracker();
        int total = et1.total_expense();
        System.out.println("Total expenses: "+total);
    }
}
class expense_tracker
{
    int expense_name_choice;
    int total = 0;
    int expense = 0;
    int choice = 1;
    int food_expense;
    int travel_expense;
    int shopping_expense;
    int total_expense()
    {
       Scanner s = new Scanner(System.in);
        do{ 
            System.out.println("Choose expense name");
            System.out.println("1) Food\n2)Travel\n3)Shopping");
            expense_name_choice = s.nextInt();
            System.out.print("Enter expenses: ");
            expense = s.nextInt();
            switch(expense_name_choice)
            {
                case 1:
                    food_expense += expense;
                    total += expense;
                    break;
                case 2:
                    travel_expense += expense;
                    total += expense;
                    break;
                case 3:
                    shopping_expense += expense;
                    total += expense;
                    break;
            }
            System.out.print("Press 0 to exit or 1 to continue: ");
            choice = s.nextInt();
        }while(choice == 1); 
        System.out.println("Expense on Food: "+food_expense);
        System.out.println("Expense on Travel: "+travel_expense);
        System.out.println("Expense on Shopping: "+shopping_expense);
        return total;
    }
}