package CodeWars;

public class Prime {
    public static boolean isPrime(int num) {
        boolean flag = num > 1;
        for(int i = 2; i < num; i++) {
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
