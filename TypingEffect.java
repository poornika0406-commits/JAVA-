public class TypingEffect {
    public static void main(String[] args) throws Exception {
        String text = "Welcome to Unique Java Program 🚀";

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(80); // delay
        }
    }
}