import java.util.LinkedList;
import java.util.Scanner;

public class App109 {
  public static void main(String[] args){
      int n;  
      int node;   
      Scanner scanner = new Scanner(System.in);
           
      LinkedList<Integer> linkedList = new LinkedList<>();
             
      System.out.println("Nhập vào số phần tử của danh sách: ");
      n = scanner.nextInt();
           
      System.out.println("Nhập giá trị của các phần tử trong danh sách: ");
      for (int i = 0; i < n; i++) {
        System.out.print("Nhập giá trị thứ " + i +": ");
        node = scanner.nextInt();
        linkedList.add(node);
      }
      double sumLinkedList = 0, count =0;
      for (int i=0; i<linkedList.size();i++){
          count++;
          sumLinkedList += linkedList.get(i);
      }
      Double average = sumLinkedList/count;
      System.out.println("Trung binh cong cac phan tu trong linkedList: " + average);
  }
}