package btMang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập sô employee");
        int employAmt = Integer.parseInt(scanner.nextLine());
        Employee employees[] = new Employee[employAmt];
        for(int i =0;i<employAmt;++i){
            System.out.println("Mời bạn nhập vào id của employee thứ" + (i+1));
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập vào tên của employee thứ "+ (i+1));
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập vào tuổi của employee thứ" + (i+1));
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập vào số năm kinh nghiệm của employee thứ"+ (i+1));
            double experience=Double.parseDouble(scanner.nextLine());
            employees[i]= new Employee(id,name,age,experience);
        }

        for(Employee employ:employees){
            System.out.println(employ);
        }
    }
}
