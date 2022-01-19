import java.util.Scanner;
public class App2 {
  public static void main(String[] args) throws Exception {
    double hesoA1,hesoB1,hesoC1,hesoA2,hesoB2,hesoC2,dd,dx,dy;
    System.out.println("Nhap A1");
    Scanner sc = new Scanner(System.in);
    hesoA1 = sc.nextDouble();
    System.out.println("Nhap B1");
    hesoB1 = sc.nextDouble();
    System.out.println("Nhap C1");
    hesoC1 = sc.nextDouble();
    System.out.println("Nhap A2");
    hesoA2 = sc.nextDouble();
    System.out.println("Nhap B2");
    hesoB2 = sc.nextDouble();
    System.out.println("Nhap C2");
    hesoC2 = sc.nextDouble();
    dd=hesoA1*hesoB2-hesoB1*hesoA2; dx=hesoC1*hesoB2-hesoB1*hesoC2; dy=hesoA1*hesoC2-hesoA2*hesoC1;
    if(dd==0)
      if(dx==0 && dy==0){
        System.out.println("He vo so nghiem");
      }
      else System.out.println("He vo nghiem");
    else
      System.out.println("He co nghiem duy nhat" + " x =" + (dx/dd) + " va y = " +(dy/dd));
  }
}