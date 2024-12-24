package LAB.Lab1;

import java.util.Scanner;

public class bai2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float a = sc.nextFloat();
          System.out.printf("The tich hinh lap phuong la: %.2f", Math.pow(a, 3));
          sc.close();
     }
}
