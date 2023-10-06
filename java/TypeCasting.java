package com.java;

public class TypeCasting {
    public static void main(String[] args) {
        //when one type of data is assigned to another type of variable and type changes
        // cond1: two type should be compatible
        //cond2: destination type should be greater than source type RHS>LHS
        //cond3: manual do narrowing conversion
/*
        int num = (int)(6584.876);
        System.out.println(num);

        //automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);// adding 257%256 = 1;


        int m = 'a';
        System.out.println(m);

        // type promotion rules
        // 1: all the byte, short, char values are promoted to int
        // 2: if any one of the operands is long.... , then the whole process will be termed as long
        // 3: values converted to higher one
        // 4: int*int = int,  int*float = float

*/
        byte n = 42;
        char c = 'c';
        short s = 1024;
        int i = 500000;
        float f = 5.675f;
        double d = 0.1234;
        double result = (f * n) + (i / c) - (d * s);
        System.out.println( (f * n) +" "+ (i / c) + " "+  (d * s));
        System.out.println(result);

    }
}
