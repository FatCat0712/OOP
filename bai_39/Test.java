public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("hai",2002);
        person1.setFullName("");
        System.out.println(person1);



        Pupil p1 = new Pupil("phuong",2002,"AV2","NBK");
        System.out.println(p1.getFullName());
        p1.setFullName("");
        System.out.println(p1.getFullName());
        p1.eat();
        p1.drink();
        p1.sleep();
        p1.doHomeWork();
    }
}
