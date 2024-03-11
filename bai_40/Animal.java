public class Animal {
    protected String name;

    public Animal(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public void eat(){
        System.out.println("Eating ...");
    }

    public void drink(){
        System.out.println("Drinking ...");
    }
}
