package CodeWars;

public class Century {
    public static int century(int number){
        double x = Math.ceil((double) number / 100);
        return (int)x;
    }
}
