import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int id1,id2,id3;
        String str1,str2,str3;
        float cs1,cs2,cs3;
        float ps1,ps2,ps3;
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Enter info for student1 ---");
        Student s1 = new Student();
        System.out.print("Enter id for student1: ");
        id1 = sc.nextInt();
        s1.setStudentID(id1);

        sc.nextLine();

        System.out.print("Enter name for student1: ");
        str1 = sc.nextLine();
        s1.setFullName(str1);



        System.out.print("Enter classScore for student1: ");
        cs1 = sc.nextFloat();
        s1.setClassScore(cs1);

        System.out.print("Enter practiseScore for student1: ");
        ps1 = sc.nextFloat();
        s1.setPractiseScore(ps1);


        System.out.println("--- Enter info for student2 ---");
        Student s2 = new Student();
        System.out.print("Enter id for student2: ");
        id2 = sc.nextInt();
        s2.setStudentID(id2);

        sc.nextLine();

        System.out.print("Enter name for student2: ");
        str2 = sc.nextLine();
        s2.setFullName(str2);



        System.out.print("Enter classScore for student2: ");
        cs2 = sc.nextFloat();
        s2.setClassScore(cs2);

        System.out.print("Enter practiseScore for student2: ");
        ps2 = sc.nextFloat();
        s2.setPractiseScore(ps2);

        System.out.println("--- Enter info for student3 ---");
        Student s3 = new Student();
        System.out.print("Enter id for student3: ");
        id3 = sc.nextInt();
        s3.setStudentID(id3);

        sc.nextLine();

        System.out.print("Enter name for student3: ");
        str3 = sc.nextLine();
        s3.setFullName(str3);



        System.out.print("Enter classScore for student3: ");
        cs3 = sc.nextFloat();
        s3.setClassScore(cs3);

        System.out.print("Enter practiseScore for student3: ");
        ps3 = sc.nextFloat();
        s3.setPractiseScore(ps3);





        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}