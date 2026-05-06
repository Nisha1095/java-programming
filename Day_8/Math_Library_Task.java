class Math_Library_Task{
    public static void main(String[] args) {
        double marks1 = 85.6, marks2 = 92.3;
        double value = 16.0;
        double angle = 45.0; // In degrees
        System.out.println("Max Marks: " + Math.max(marks1, marks2));
        System.out.println("Min Marks: " + Math.min(marks1, marks2));
        System.out.println("Rounded Marks1: " + Math.round(marks1));
        System.out.println("Square of 4: " + Math.pow(4, 2));
        System.out.println("Square Root of " + value + ": " + Math.sqrt(value));
        System.out.println("Absolute Difference: " + Math.abs(marks1 - marks2));
        System.out.println("Ceil of 85.6: " + Math.ceil(marks1));
        System.out.println("Floor of 85.6: " + Math.floor(marks1));
        int randomNum = (int) (Math.random() * 101);
        System.out.println("Random Number (0-100): " + randomNum);
        System.out.println("Exponential of 2: " + Math.exp(2));
        System.out.println("Log of 10: " + Math.log(10));
        double radians = Math.toRadians(angle);
        System.out.println("Sine(45): " + Math.sin(radians));
        System.out.println("Cosine(45): " + Math.cos(radians));
        System.out.println("Cube of 5: " + Math.pow(5, 3));
    }
}
