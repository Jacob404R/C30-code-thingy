public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("My name i\bs Jacob");
        int total = 0;
        for(int i = 1; i <= 10; i = i + 3)
           for(int x = 1; x <= i; x = x + 3)
              total = total + x;
              System.out.println(total);
    }
}
