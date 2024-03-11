public class Pupil extends Person {
    private String className;
    private String schoolName;

    public Pupil(String fullName,int yearOfBirth,String className,String schoolName){
        super(fullName, yearOfBirth);
        if(!className.isEmpty()){
            this.className = className;
        }
        if(!schoolName.isEmpty()){
            this.schoolName = schoolName;
        }
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void doHomeWork(){
        System.out.println("Working on homework ....");
    }

}
