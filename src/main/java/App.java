public class App {
    public static void main(String[] args) {
        int a =7;
        int b =3;
        System.out.println(div(a, b));
        System.out.println(sum(a, b));
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static int div(int a, int b){
        return a-b;
    }
}
