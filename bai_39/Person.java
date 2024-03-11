public class Person {
    private String fullName;
    private int yearOfBirth;

    public Person(String fullName, int yearOfBirth) {
        if(!fullName.isEmpty()){
            this.fullName = fullName;
        }
        if(yearOfBirth > 0){
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if(!fullName.isEmpty()){
            this.fullName = fullName;
        }

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth > 0){
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void eat(){
        System.out.println("Eating ....");
    }

    public void drink(){
        System.out.println("Drinking ....");
    }

    public void sleep(){
        System.out.println("sleeping ....");
    }

    public String toString(){
        return fullName + "-" + yearOfBirth;
    }
}
