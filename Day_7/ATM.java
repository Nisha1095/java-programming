import java.util.Scanner;
class ATM
{
    int choice;
    public static void main(String[] args) {
    Operations o = new Operations();
    int pin_no = 1234;
    Scanner s1 = new Scanner(System.in);
    System.out.print("Enter PIN: ");
    int PIN_NO = s1.nextInt();
    if(PIN_NO == pin_no)
    {
    System.out.println("Enter Operation to perform");
    System.out.println("1) Deposit\n2) Withdraw\n3) Check balance\n4) Exit");
    int choice = s1.nextInt();
    do{
    if(choice == 1) {
        System.out.print("Enter amount to deposit: ");
        float amount = s1.nextFloat();
        o.set_balance(amount); }
    else if(choice == 2) {
        System.out.print("Enter amount to withdraw: ");
        float amount = s1.nextFloat();
        o.withdraw(amount); }
    else if(choice == 3) {
        double balance = o.get_balance();
        System.out.println("Current Balance: "+balance);
    }
    System.out.println("Enter Operation to perform");
    System.out.println("1) Deposit\n2)Withdraw\n3)Check balance\n4)Exit");
    choice = s1.nextInt();
    }while(choice != 4);
}
    else{
        System.out.println("Enter PIN number correctly"); } } }
class Operations
{
    private double balance = 0.0;
    double get_balance() 
    {
        return balance;
}
    void set_balance(double a1) {
        balance += a1; }
    void withdraw(double a2) {
        if(a2 > balance)
            System.out.println("Amount not available");
        else
        {
            System.out.println("Withdrawed successfully");
            balance -= a2; 
            } 
        } 
}