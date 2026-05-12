class Wrapper_class {
    public static void main(String[] args) {
        // Numeric Wrapper Classes
        Byte byteObj = 10;           // byte to Byte
        Short shortObj = 20;         // short to Short
        Integer intObj = 100;        // int to Integer
        Long longObj = 1000L;        // long to Long
        Float floatObj = 10.5f;      // float to Float
        Double doubleObj = 20.99;    // double to Double

        // Character and Boolean Wrapper Classes
        Character charObj = 'A';     // char to Character
        Boolean boolObj = true;      // boolean to Boolean

        // Displaying Values
        System.out.println("Integer Object: " + intObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);

        // Explicit Unboxing (Optional with Autoboxing)
        int primitiveInt = intObj.intValue(); 
        char primitiveChar = charObj.charValue();
        boolean primitiveBool = boolObj.booleanValue();

        System.out.println("Unboxed primitive int: " + primitiveInt);
        System.out.println("Unboxed primitive char: " + primitiveChar);
        System.out.println("Unboxed primitive boolean: " + primitiveBool);
    }
}
