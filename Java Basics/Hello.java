class Hello
{
    public static void main(String args[])
    {
        // System.out.println("Hello Java, I am Saamer");
        // System.out.println(8+9);

        // int num1 = 5;
        // int num2 = 3;
        // int result = num1 + num2;
        // System.out.println(result);

        // int num1 = 9;
        // byte by = 127;
        // short sh = 558;
        // long l = 585858585858l;

        // float f = 5.8f;
        // double d = 5.8;

        // char c = 'J';

        // boolean b = true;


        //literals
        // int num1 = 0b101;
        // int num1 = 0x7e;
        // int num1 = 10_00_00_000;
        // double num1 = 12e10;
        // boolean num1 = 1; -->Can't convert to boolean
        // char c = 'a';
        // c++; //--> it will be 'b'
        // System.out.println(c);


        //Type casting & conversions
        // byte b = 125;
        // int a = b;

        // int a = 200;
        // byte k = (byte)a;

        // float f = 5.6f;
        // int t = (int) f; //-->we will loose value after point

        // byte a = 10;
        // byte b = 20;
        // int result = a * b;//-->Type promotion here

        // System.out.println(result);


        //  Operators
        // int num1 = 7;
        // int num2 = 5;

        // int result = num1 + num2;
        // int result = num1 - num2;
        // int result = num1 * num2;
        // int result = num1 / num2;
        // int result = num1 % num2;

        // num1 = num1 + 2;
        // num1 = num1 += 2;
        // num1 = num1 -= 2;
        // num1 = num1 *= 2;
        // num1 = num1 /= 2;
        // num1 = num1 %= 2;

        // num1++;  //--> Increment
        // ++num1;
        // num1--;  //--> Decrement

        // System.out.println(num1);


        // Relational / Comparison operators
        // int x = 6;
        // int y = 6;

        // boolean result = x > y;
        // boolean result = x >= y;  // -> true
        // boolean result = x <= y;     // -> true

        // Logical Operators

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // boolean result = x > y || a > b;
        boolean result = x < y || a < b || a > 1;
        // boolean result = a > b;
        // System.out.println(!result);
        System.out.println(result);

    }
}