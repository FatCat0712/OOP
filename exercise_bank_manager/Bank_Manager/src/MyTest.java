import java.io.*;
import java.util.Scanner;

public class MyTest implements Serializable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        try {
            File f = new File("E:\\"+fileName);
            OutputStream os = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            Account ac = new Account(1111,"hai");
            oos.writeObject(ac);
            oos.flush();
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();;
        }
    }
}
