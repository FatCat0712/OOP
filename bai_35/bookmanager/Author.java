package bookmanager;

public class Author {
    private String authorName;
    private MyDate dateOfBirth;

    public Author(String name,MyDate date){
        if(!name.isEmpty()){
            this.authorName = name;
        }
        this.dateOfBirth = date;
    }

    public String getAuthorName(){
        return this.authorName;
    }

    public void setAuthorName(String name){
        if(!name.isEmpty()){
            this.authorName = name;
        }
    }
    public String getDateOfBirth(){
        return this.dateOfBirth.toString();
    }

    public void setDateOfBirth(int d, int m, int y){
        this.dateOfBirth.setDay(d);
        this.dateOfBirth.setMonth(m);
        this.dateOfBirth.setYear(y);
    }

    public String toString(){
        return this.authorName +" - "+this.dateOfBirth.toString();
    }

}
