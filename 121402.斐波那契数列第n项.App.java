import java.util.Scanner;

public class Bpp {
    public static void main(String[] args) {
        System.out.println("输入一个数字来选中第几项");
        int a = 1, b = 1, c = 0;
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
            for (int i = 3; i < user; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            if (user > 0 && user <= 3) {
                if (user == 1) System.out.println(0);
                if (user != 1) System.out.println(1);
            } else {
                System.out.println(c);
            }
        }
    }
