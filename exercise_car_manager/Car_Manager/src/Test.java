import java.util.Scanner;

public class Test {
    public static Vehicle nhapXe(){
        Scanner sc = new Scanner(System.in);
        String carID,owner;
        double price, cyclinderCapacity;
        System.out.println("nhập mã xe: ");
        carID = sc.nextLine();
        System.out.println("nhập giá xe:");
        price = sc.nextDouble();
        System.out.println("nhập dung tích: ");
        cyclinderCapacity = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhập chủ sở hữu");
        owner = sc.nextLine();
        return new Vehicle(carID,price,cyclinderCapacity,owner);
    }
    public static void main(String[] args) {
        Vehicle[] arr = null;
        int choice;
        int number = 0;
        do{
            System.out.println("1. Tạo đối tượng xe và nhập thông tin: ");
            System.out.println("2. Xuất bản công khai tiền thuế: ");
            System.out.println("3. Thoát");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Bạn muốn nhập bao nhiêu xe");
                    number = sc.nextInt();
                    arr = new Vehicle[number];
                    for(int i = 1; i <= arr.length; i++){
                        System.out.println("Nhập thông tin xe "+i);
                        arr[i-1] = nhapXe();
                    }
                    break;
                case 2:
                    for(int i = 0; i < number; i++){
                        System.out.println(arr[i].toString());
                    }
                    break;
            }
        }while(choice != 3);



    }


}
