public class Student {
    private int studentID;
    private String fullName;
    private float classScore;
    private float practiseScore;

    public Student(){

    }

    public Student(int studentID, String fullName, float classScore,float practiseScore){
        if(studentID > 0){
            this.studentID = studentID;
        }
        this.fullName = fullName;
        if(classScore >= 0){
            this.classScore = classScore;
        }
        if(practiseScore >= 0){
            this.practiseScore = practiseScore;
        }
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if(studentID > 0){
            this.studentID = studentID;
        }

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getClassScore() {
        return classScore;
    }

    public void setClassScore(float classScore) {
        if(classScore > 0){
            this.classScore = classScore;
        }

    }

    public float getPractiseScore() {
        return practiseScore;
    }

    public void setPractiseScore(float practiseScore) {
        if(practiseScore > 0){
            this.practiseScore = practiseScore;
        }
    }

    public double averageScore(){
        return (practiseScore + classScore)/2;
    }

    public String toString(){
        return studentID + "-" + fullName + "-" + classScore + "-" + practiseScore +"-"+averageScore();
    }
}
