class method_1 {
    void method1() {
        System.out.println("Method 1 from method_1 class");
    }
}

class method_2 extends method_1 {
    // This method overrides the parent class method
    void method2() {
        System.out.println("Method 2 from method_2 class");
    }
}

class method_overriding {
    public static void main(String[] args) {
        method_1 d1 = new method_1();
        method_2 d2 = new method_2();
        d1.method1(); // Calls the method from method_1
        d2.method1(); // Calls the overridden method from method_1
        d2.method2(); // Calls the method from method_2
    }
}   
