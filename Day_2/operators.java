class operators
{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        //Arithmetic Operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Relational Operator
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);

        //Bitwise Operator
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(~b);

        //Unary Operator
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(b--);
        System.out.println(--b);
        System.out.println(+a);
        System.out.println(-b);

        //Logical Operator
        System.out.println(a>b && b>a);
        System.out.println(a>b || b>a);
        System.out.println(!(a>b));

        //Shift Operator
        System.out.println(a<<2);
        System.out.println(a>>3);
        System.out.println(b<<4);
        System.out.println(b>>1);
        System.out.println(a>>>1);
        System.out.println(b>>>2);

        //Assignment Operator
        System.out.println(a += 1);
        System.out.println(a -= 1);
        System.out.println(b += 2);
        System.out.println(b -= 1);
        System.out.println(a *= 2);
        System.out.println(b *= 1);
        System.out.println(a /= 2);
        System.out.println(b /= 3);
        System.out.println(a %= 2);
        System.out.println(b %= 2);
        System.out.println(a &= 1);
        System.out.println(b &= 2);
        System.out.println(a |= 2);
        System.out.println(b |= 1);
        System.out.println(a ^= 2);
        System.out.println(b ^= 2);
        System.out.println(a >>= 1);
        System.out.println(b >>= 2);
        System.out.println(a <<= 2);
        System.out.println(b <<= 1);
        System.out.println(a >>>= 1);
        System.out.println(b >>>= 1);

        //Ternary Operator
        int max = a > b ? a : b;
        System.out.println(max);
    }
}