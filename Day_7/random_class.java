import java.util.Random;
class random_class
{
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100);       //Returns 0 (inclusive) to bound (exclusive)
        float b = r.nextFloat(200);
        boolean c = r.nextBoolean();  //Returns true or false randomly
        double d = r.nextDouble();    //Returns a value between 0.0 and 1.0
        double e = r.nextGaussian(10,10);  //Normal distribution — mean 0.0, std dev 1.0
        System.out.println("Random Integer value: "+a);
        System.out.println("Random Float value: "+b);
        System.out.println("Random Boolean value: "+c);
        System.out.println("Random Double value: "+d);
        System.out.println("Random Gaussian value: "+e);
    }
}