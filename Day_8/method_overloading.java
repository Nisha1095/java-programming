class method_overloading {
    public static void main(String[] args) {
        method_overloading1 m1 = new method_overloading1();
        System.out.println(m1.add(5, 10)); // Calls add(int, int)
        System.out.println(m1.add(5.5, 10.5)); // Calls add(double, double)
        System.out.println(m1.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println(m1.add(5, 10, 15.5, 20.5)); // Calls add(int, int, double, double)
    }
}
class method_overloading1 {
    // Overloaded by changing parameter type
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    // Overloaded by changing number of parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }
     
     static int add(int a, int b, double c, double d) {
        return (int)(a + b + c + d);   
     }
}