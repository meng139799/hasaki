import java.util.Scanner;

public class Cpp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        if (user < 3200&&user>0) {
            if (user % 100 != 0 && user % 4 == 0||user%400==0) {
                System.out.println("你输入的是闰年");
            } else {
                System.out.println("你输入的不是闰年");
            }
        }
        if (user>-3200&&user<0){
            if(user%4==-1&&user%400==-1){
                System.out.println("你输入的是闰年");
            }else{
                System.out.println("你输入的不是闰年");
            }
        }
    }
}
