public class Test {
    public static void main(String[] args) {
        DateOfBirth date1 = new DateOfBirth(16,10,2002);
        DateOfBirth date2 = new DateOfBirth(7,1,2002);
        DateOfBirth date3 = new DateOfBirth(7,1,2002);

        Class class1 = new Class("AN2001","CyberSecurity");
        Class class2 = new Class("PM2002","SoftwareEngineering");
        Class class3 = new Class("KH2003","ComputerScience");

        Student student1 = new Student("1","Mai Son Hai",date1,2.5,class1);
        Student student2 = new Student("2","Nguyen Vu Thanh Nguyen",date2,8.5,class2);
        Student student3 = new Student("3","Tran Thanh Quang",date3,9.5,class3);

        System.out.println(student1.getFacultyName());
        System.out.println(student2.getFacultyName());
        System.out.println(student3.getFacultyName());

        System.out.println(student1.checkIfStudentPass());
        System.out.println(student2.checkIfStudentPass());
        System.out.println(student3.checkIfStudentPass());

        System.out.println(student1.checkIfSameBirthday(student2));
        System.out.println(student2.checkIfSameBirthday(student3));






    }
}
