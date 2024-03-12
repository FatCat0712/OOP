package code;

public class Sub_info extends Infor{
    public void get(){
//        super.a; => cannot access
        super.b = 2; // => access due to same package not inheritance
        super.c = 3; // => access due to inheritance
        super.d = 4; // => access due to public attribute
    }
}
