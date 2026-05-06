import java.util.Arrays;
import java.util.Random;
class Random_class_Task2{
    public static void main(String[] args) {
        Random random = new Random();
        int studentID = random.nextInt(1000);
        double marks = random.nextDouble() * 100;
        float attendance = random.nextFloat() * 100;
        boolean isPass = random.nextBoolean();
        String status = isPass ? "Pass" : "Fail";
        long regNum = random.nextLong();
        double perfScore = random.nextGaussian() * 10;
        byte[] randomBytes = new byte[5];
        random.nextBytes(randomBytes);
        int[] streamNumbers = random.ints(5).toArray();

        System.out.println("Student ID: " + studentID);
        System.out.printf("Marks: %.2f\n", marks);
        System.out.printf("Attendance: %.2f%%\n", attendance);
        System.out.println("Status: " + status);
        System.out.println("Registration Number: " + regNum);
        System.out.printf("Performance Score: %.2f\n", perfScore);
        System.out.println("Random Bytes: " + Arrays.toString(randomBytes));
        System.out.println("Stream Randoms: " + Arrays.toString(streamNumbers)); }
}
