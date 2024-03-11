public class Test {
    public static void main(String[] args) {

        Animal a1 = new Animal("animal");
        a1.eat();
        a1.makeSound();
        a1.sleep();

        System.out.println();
        System.out.println();

        System.out.println("----test dog----");
        Dog d1 = new Dog();
        d1.eat();
        d1.makeSound();
        d1.sleep();

        System.out.println();
        System.out.println();

        System.out.println("----test cat----");
        Cat c1 = new Cat();
        c1.eat();
        c1.makeSound();
        c1.sleep();

        System.out.println();
        System.out.println();

        System.out.println("----test bird----");
        Bird b1 = new Bird();
        b1.eat();
        b1.makeSound();
        b1.sleep();



    }
}
