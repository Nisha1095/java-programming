import java.util.Random;
class Random_class_Task1{
    public static void main(String[] args) {
        // Array of customers
        String[] customers = { "Arun", "Bala", "Cathy", "Divya", "Eshan" };

        // Create Random object
        Random random = new Random();

        // Generate a random index between 0 and customers.length - 1
        int randomIndex = random.nextInt(customers.length);

        // Pick and display the winner
        String winner = customers[randomIndex];
        System.out.println("Winner is: " + winner);
    }
}
