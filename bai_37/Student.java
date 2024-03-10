public class Student {
    private String studentID;
    private String fullName;
    private DateOfBirth dateOfBirth;
    private double averageScore;
    private Class studentClass;

    public Student(String studentID, String fullName, DateOfBirth dateOfBirth, double averageScore, Class studentClass) {
        if(!studentID.isEmpty()){
            this.studentID = studentID;
        }
        if(!fullName.isEmpty()){
            this.fullName = fullName;
        }
        this.dateOfBirth = dateOfBirth;
        if(averageScore >= 0){
            this.averageScore = averageScore;
        }

        this.studentClass = studentClass;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        if(!studentID.isEmpty()){
            this.studentID = studentID;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if(!fullName.isEmpty())
        {
            this.fullName = fullName;
        }
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        if(averageScore >= 0){
            this.averageScore = averageScore;
        }

    }

    public String getStudentClass() {
        return studentClass.getClassName();
    }

    public void setStudentClass(Class studentClass) {
        this.studentClass = studentClass;
    }

    public String getFacultyName(){
        return this.studentClass.getFacultyName();
    }

    public boolean checkIfStudentPass(){
        return this.averageScore >= 5;
    }

    public boolean checkIfSameBirthday(Student other){
        if(this == other)
            return true;
        if(other == null)
            return false;
        if(this.dateOfBirth.getDay() != other.dateOfBirth.getDay())
            return false;
        if(this.dateOfBirth.getMonth() != other.dateOfBirth.getMonth())
            return false;
        if(this.dateOfBirth.getYear() != other.dateOfBirth.getYear())
            return false;
        return true;
    }
}
