public class Test {
    public static void main(String[] args) {
        System.out.println("---Test single inheritance---");
        Dog dog = new Dog();
        System.out.println(dog.getName());
        dog.eat();
        dog.drink();
        dog.bark();
        dog.wavingTail();

        System.out.println();
        System.out.println();
        System.out.println("---Test multilevel inheritance");
        BabyDog babi1 = new BabyDog();
        System.out.println(babi1.getName());
        babi1.eat();
        babi1.drink();
        babi1.bark();
        babi1.wavingTail();
        babi1.weep();

        System.out.println();
        System.out.println();
        System.out.println("---Test hierarchical inheritance");
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.eat();
        cat.drink();
        cat.sound();
        System.out.println();
        System.out.println();
        Bird bird = new Bird();
        System.out.println(bird.getName());
        bird.eat();
        bird.drink();
        bird.fly();



    }
}
