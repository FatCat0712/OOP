package test;

import code_a.Example;

public class TestExample {
    public static void main(String[] args) {
        Example ex1 = new Example(3,5);
        System.out.println(ex1.getA());
        System.out.println(ex1.getB());

        System.out.println();
        System.out.println();

        code_b.Example ex2 = new code_b.Example(2,3,5);
        System.out.println(ex2.getA());
        System.out.println(ex2.getB());
        System.out.println(ex2.getC());



    }
}
