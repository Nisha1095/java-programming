class String_Buffer{
    public static void main(String[] args) {
        // Start with the initial status
        StringBuffer orderStatus = new StringBuffer("Order Placed");

        // Use append to update the status step by step
        orderStatus.append(" -> Packed");
        orderStatus.append(" -> Shipped");
        orderStatus.append(" -> Delivered");

        // Print the final tracking sequence
        System.out.println(orderStatus.toString());
    }
}
