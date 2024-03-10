public class Class {
    private String className;
    private String facultyName;

    public Class(String className, String facultyName) {
        if(!className.isEmpty()){
            this.className = className;
        }
        if(!facultyName.isEmpty()){
            this.facultyName = facultyName;
        }
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        if(!className.isEmpty()){
            this.className = className;
        }
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        if(!facultyName.isEmpty()){
            this.facultyName = facultyName;
        }
    }


}
