public class App {

    public static void main(String [] args){
        int x = 15;
        int y = 10;

        System.out.println(sum(x,y));
        System.out.println(mul(x,y));

    }

    public static int sum(int x, int y){
        return  x + y;
    }

    public static int mul(int x, int y){
        return  x * y;
    }

}
