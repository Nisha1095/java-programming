class default_constructor
{
    public static void main(String[] args) {
        constructor1 c1 = new constructor1();
        System.out.println(c1.name);
        constructor1 c2 = new constructor1();
        c2.name = "Hi";
        System.out.println(c2.name);
    }
}
class constructor1
{
    String name = "Hello";
    constructor1() {
        System.out.println("Default constructor");
    }
    
}