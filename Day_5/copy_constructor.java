class copy_constructor
{
    public static void main(String[] args) {
        constructor3 c1 = new constructor3();
        constructor3 c2 = new constructor3(c1);
        
    }
}
class constructor3
{   int num = 10;
    constructor3() {
        System.out.println("Default constructor");
        System.out.println("num: "+num);
    }
    constructor3(constructor3 c3) {
        System.out.println("Copy constructor");
        System.out.println("num: "+c3.num);
    } 
}