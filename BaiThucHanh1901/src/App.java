import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      double hesoA, hesoB, hesoC, delta, x1, x2;
      System.out.print("Nhap he so A ");
      Scanner scan = new Scanner(System.in);
      hesoA = scan.nextDouble();
      System.out.print("Nhap he so B ");
      hesoB = scan.nextDouble();
      System.out.print("Nhap he so C ");
      hesoC = scan.nextDouble();
      delta = hesoB*hesoB-4*hesoA*hesoC;
      if (delta < 0) {
        System.out.println("Phuong Trinh vo nghiem");
    } else if (delta == 0) {
        x1 = -hesoB / (2 * hesoA);
        System.out.println("phuong trinh co 1 nghiem la x1 = x2 = " + x1);
    } else {
        x1 = (-hesoB + Math.sqrt(delta)) / (2 * hesoA);
        x2 = (-hesoB - Math.sqrt(delta)) / (2 * hesoA);
        System.out.println("Phuong trinh co 2 nghiem x1 = " + x1 + "  x2 = " + x2);

    }
    scan.close();
    }
}