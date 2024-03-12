package code;

public class Example {
    private Infor info;
    public void method(){
//        this.info.a => cannot access
       this.info.b = 2;     // => access due to same package
        this.info.c = 3;   // => access due to same package
        this.info.d = 4; // => access due to public attribute


    }
}
