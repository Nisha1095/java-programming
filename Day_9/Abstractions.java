// Abstract class defines the concept but hides implementation
abstract class abs_class {
     abstract void method1();
}

// Concrete class defines the actual execution
class normal_class extends abs_class {
    void method1() {
        System.out.println("Method 1 implemented in normal_class");
    }
}

class Abstractions {
    public static void main(String[] args) {
        // User interacts with the abstraction, ignoring implementation details
        abs_class a1 = new normal_class();
        a1.method1();
    }
}
