class data_types
{
    public static void main(String[] args) {

        //Primitive Datatypes
        byte a = 10;
        short b = 2000;
        int c = 50000;
        long d = 90230000L;

        float e = 14.38f;
        double f = 95.89;

        char g = 'N';
        boolean h = true;

        //Non Primitive Datatypes
        String i = "abc";            // String is not a Non Primitive Datatype. It is a Class
        int[] arr = {1, 2, 3, 4};

        // Printing Primitive Types
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);

        // Printing Non-Primitive Types
        System.out.println("String: " + i);
        System.out.print("Array: ");
        for(int k : arr)
        {
            System.out.print(k);
        }
    }
}