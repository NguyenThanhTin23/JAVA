
package LAB.Lab1;

import java.util.Scanner;

public class bai1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Ten sinh vien: ");
          String name = sc.nextLine();
          System.out.print("Nhap diem trung binh: ");
          float gpa = sc.nextFloat();
          System.out.printf("Ten: %s | GPA: %.2f", name, Math.ceil(gpa));
     }
}