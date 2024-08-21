package btHinhhoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào các cạnh của hình chữ nhật");
        System.out.println("Mời bạn nhập vào chiều dài");
        float length = Float.parseFloat(scanner.nextLine());
        System.out.println("Mời bạn nhập chiều rộng");
        float width = Float.parseFloat(scanner.nextLine());
        rectangle rectag = new rectangle(length,width);
        System.out.println(rectag);
        System.out.println("Mời bạn nhập vào cạnh của hình vuông");
        float side =Float.parseFloat(scanner.nextLine());
        square sqr =  new square(side);
        System.out.println(sqr);
    }
}
