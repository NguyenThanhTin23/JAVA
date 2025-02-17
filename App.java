import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Chua lon");
        }
        else {
            System.out.println("Lon roi");
        }

    }
}
