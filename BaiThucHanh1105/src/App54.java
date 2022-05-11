import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args ){
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // thêm các phần tử vào hastSetInterger
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
       
        // hiển thị các phần tử trong hastSetInteger
        System.out.println("Các phần tử trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhập phần tử cần thêm: ");
        number = scanner.nextInt();
        // thêm một phần tử mới vào hashSetInteger từ bàn phím
        // nếu phần tử đó đã tồn tại thì thông báo đã tồn tạ ngược lại thì thêm vào
        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong hashSetInteger sau khi thêm: ");
            System.out.println(hashSetInteger);
        } else {
            System.out.println("Phần tử " + number + " đã tồn tại!");
        }
    }
}