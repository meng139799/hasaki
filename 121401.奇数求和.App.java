public class App {
    public static void main(String[] args) {
        long sum=0;
        for (long i = 1; i <= 2147483647; i++) {
            if (i%2 != 0){
                sum=i+sum;
            }
        }
        System.out.println(sum);
    }
}
