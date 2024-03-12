package test;

import code.Infor;
import code.Sub_info;

public class Sub_Info extends Infor {
    public void get(){
//        super.a; => cannot access
//        super.b; => cannot access
        super.c = 3; //=> access due to inheritance
        super.d = 4; //=> access due to public attribute
    }
}
