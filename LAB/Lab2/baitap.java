package LAB.Lab2;

import java.util.Scanner;

public class baitap {
     public static void ptbacnhat(float a, float b) {
          if (a == 0 && b == 0)
               System.out.println("Phuong trinh co vo so nghiem");
          else if (a == 0 && b != 0)
               System.out.println("Phuong trinh vo nghiem");
          else
               System.out.printf("Nghiem cua phuong trinh la: %.2f", -b / a);
     }

     public static void ptbachai(float a, float b, float c) {
          float denta = b * b - 4 * a * c;
          if (denta < 0)
               System.out.println("Phuong trinh vo nghiem");
          else if (denta == 0)
               System.out.printf("Phuong trinh co nghiem kep la: %.2f", -b / (2 * a));
          else
               System.out.printf("Phuong trinh co 2 nghiem phan biet la x1 = %.2f ; x2 = %.2f",
                         (-b - Math.sqrt(denta)) / (2 * a), (-b + Math.sqrt(denta)) / (2 * a));
     }

     public static void tinhThue() {
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("================MENU=============");
          System.out.println("1. Giai phuong trinh bac nhat");
          System.out.println("2. Giai phuong trinh bac hai");
          System.out.println("3. Tinh thue");
          System.out.println("!. Thoat chuong trinh!!!");
          System.out.println("===================================");
          System.out.print("Nhap lua chon: ");
          int choice = sc.nextInt();
          switch (choice) {
               case 1: {
                    System.out.println("Chuong trinh giai phuong trinh bac nhat");
                    System.out.print("Nhap he so a: ");
                    float a = sc.nextFloat();
                    System.out.print("Nhap he so b: ");
                    float b = sc.nextFloat();
                    ptbacnhat(a, b);
                    break;
               }
               case 2:
                    System.out.println("Chuong trinh giai phuong trinh bac 2");
                    System.out.print("Nhap he so a: ");
                    float a = sc.nextFloat();
                    System.out.print("Nhap he so b: ");
                    float b = sc.nextFloat();
                    System.out.print("Nhap he so c: ");
                    float c = sc.nextFloat();
                    ptbachai(a, b, c);
                    break;
               default:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
          }
          sc.close();
     }
}
