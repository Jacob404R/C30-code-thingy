public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very";
        System.out.println(message1.indexOf(target1));
        System.out.println(message1.length());
        System.out.println(message1.substring(0,5) + message1.substring(10,16));

        String message2 = "that was great - lol";
        String target2 = "lol";
        System.out.println(message2.indexOf(target2));
        System.out.println(message2.substring(0, 17)+ "laugh out loud");
    }
}
