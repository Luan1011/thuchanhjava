import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App108 {
    public static void main(String[] args) {
        int n;  
        int number;
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
             
        System.out.println("Nhập vào số phần tử của ArrayList: ");
        n = scanner.nextInt();
             
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }
        System.out.println("Cac phan tu trong arrListInteger: ");
        for(int i=0; i<arrListInteger.size();i++){
            System.out.println(arrListInteger.get(i)+"\t");
        }

        int max = arrListInteger.get(0);    
        for (int i = 1; i < arrListInteger.size(); i++) {
            if (arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong arrListInteger = " + max);

        int x;
        System.out.println("Nhap so nguyen can xoa: ");
        x = scanner.nextInt();
        for(int i=0; i< arrListInteger.size(); i++){
            if(arrListInteger.get(i) == x){
                arrListInteger.remove(i);
            }
        }
        System.out.println("Sau khi xoa: ");
        for(int i=0; i<arrListInteger.size();i++){
            System.out.println(arrListInteger.get(i)+"\t");
        }

        arrListInteger.sort(Comparator.naturalOrder());
        System.out.println("Sau khi sap xep tang dan: ");
        for(int i=0; i<arrListInteger.size();i++){
            System.out.println(arrListInteger.get(i)+"\t");
        }
    }
}