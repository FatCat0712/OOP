public class Animal {
    protected String name;

    public Animal(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public void eat(){
        System.out.println("Eating ...");
    }

    public void makeSound(){
        System.out.println(".......");
    }

    public void sleep(){
        System.out.println("Zzzzzzzz");
    }
}
