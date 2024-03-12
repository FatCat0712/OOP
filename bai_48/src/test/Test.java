package test;

import code.Infor;

public class Test {
    private Infor info;

    public Test(){
//        this.info.a; => cannot access
 //       this.info.b => cannot access
//        this.info.c; => cannot access
        this.info.d = 4; // access due to public attribute
    }
}
