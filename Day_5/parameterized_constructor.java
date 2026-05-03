class parameterized_constructor
{
    public static void main(String[] args) {
        constructor2 c1 = new constructor2("Hi");
        constructor2 c2 = new constructor2("Hello");
        
    }
}
class constructor2
{
    constructor2(String a) {
        System.out.println("Parameterized constructor");
        System.out.println(a);
    } 
}